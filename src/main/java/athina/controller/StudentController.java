package athina.controller;

import athina.model.Student;
import athina.view.global.*;
import athina.view.student.*;

import java.util.List;
import java.util.ArrayList;
import java.awt.Container;
import java.awt.Component;
import java.time.LocalDate;
import javax.swing.*;
import java.sql.*;

public class StudentController implements UserController{
	private Student student;
	private ArrayList<JFrame> frameList;	// 0=InfoView | 1=EnrollmentManagementView | 2=RegisterEnrollmentView
	private Connection connection;

	public StudentController(Student student,ArrayList<JFrame> frameList,Connection connection){
		this.student = student;
		this.frameList = frameList;
		this.connection = connection;
		((EnrollmentManagementView) frameList.get(1)).setController(this);
		((RegisterEnrollmentView) frameList.get(2)).setController(this);
	}

	// Updates user info frame
	public void displayUserInfoView(){
		InfoView infoView = (InfoView) frameList.get(0);
		infoView.setId(student.getId());
		infoView.setName(student.getFirstName().concat(" ").concat(student.getLastName()));
		infoView.setEmail(student.getEmail());
		infoView.setPhoneNumber(student.getPhoneNumber());
		infoView.setAdress(student.getAdress());
		infoView.setEcts(student.getEcts());
		infoView.showTypeSpecificInfo(student);
		infoView.setVisible(true);
	}

	public void displayEnrollmentManagementView(){
		EnrollmentManagementView enrollmentManagementView = (EnrollmentManagementView) frameList.get(1);
		enrollmentManagementView.setVisible(true);
	}

	public void displayRegisterEnrollmentView(){
		RegisterEnrollmentView registerEnrollmentView = (RegisterEnrollmentView) frameList.get(2);
		prepareRegisterEnrollmentView(registerEnrollmentView);
		registerEnrollmentView.setVisible(true);
	}

	public void prepareRegisterEnrollmentView(RegisterEnrollmentView registerEnrollmentView){
		PreparedStatement prepStmt = null;
		ResultSet rs = null;
		List<JCheckBox> checkboxList = getAllCheckboxes(frameList.get(2));
		int currentMonth = LocalDate.now().getMonthValue();
		
		// Hide off season lectures
		if (currentMonth < 3 || currentMonth > 8) registerEnrollmentView.hideOutOfSeason("winter");
		else registerEnrollmentView.hideOutOfSeason("spring");

		try{
			// Fetch all the lecture info
			prepStmt = connection.prepareStatement("CALL lecture_info_procedure(?)",
																ResultSet.TYPE_SCROLL_SENSITIVE,
																ResultSet.CONCUR_UPDATABLE);
			prepStmt.setInt(1, -1);
			rs = prepStmt.executeQuery();

			// Fill the labels with the fetched lecture names
			for(Component comp : checkboxList){
				if (comp instanceof JCheckBox){
					JCheckBox jc = ((JCheckBox) comp);
					if (rs.next()){
						jc.setText(rs.getString(2));
					}
				}
			}
		}		
		catch (SQLException se){se.printStackTrace();}
		finally{
			try{rs.close();} catch(SQLException se){}
			try{prepStmt.close();} catch(SQLException se){}
		}
		//disableUnavailableLectures(registerEnrollmentView);
		
	}

	public void disableUnavailableLectures(){
		RegisterEnrollmentView registerEnrollmentView = (RegisterEnrollmentView) frameList.get(2);
		List<JCheckBox> lectureCheckboxList = getAllCheckboxes(registerEnrollmentView);
		PreparedStatement prepStmt = null;
		ResultSet rs = null;
		
		try{
			// Fetch active student's unavailable lectures
			prepStmt = connection.prepareStatement("CALL unavailable_lectures_procedure(?)",
																ResultSet.TYPE_SCROLL_SENSITIVE,
																ResultSet.CONCUR_UPDATABLE);
			prepStmt.setInt(1, student.getId());
			rs = prepStmt.executeQuery();
			
			// Disables the checkboxes responsible for the received unavailable lectures
			for(JCheckBox jc : lectureCheckboxList){	
				if(rs.next()){
					if(jc.getText().equals(rs.getString(2)))
						jc.setEnabled(false);
				}
			}
		}
		catch(SQLException se){se.printStackTrace();}
		finally{
			try{rs.close();} catch(SQLException se){}
			try{prepStmt.close();} catch(SQLException se){}
		}
	}

	// Create using recursion, a list with all the components of the given container and return it 
	public List<JCheckBox> getAllCheckboxes(Container container) {
		Component[] components = container.getComponents();
		List<JCheckBox> checkboxList = new ArrayList<JCheckBox>();
		for (Component comp : components) {
			if (comp instanceof JCheckBox) checkboxList.add((JCheckBox) comp);
			if (comp instanceof Container) checkboxList.addAll(getAllCheckboxes((Container) comp));
		}
		return checkboxList;
  }

}
