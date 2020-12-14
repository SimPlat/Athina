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
		List<Component> componentList = getAllComponents(frameList.get(2));
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
			for(Component comp : componentList){
				if (comp instanceof JLabel && ((JLabel) comp).getText().contains("lecture")){
					JLabel jl = ((JLabel) comp);
					if (rs.next()){
						jl.setText(rs.getString(2));
					}
				}
			}
			//disableUnavailableLectures();
		}		
		catch (SQLException se){se.printStackTrace();}
		finally{
			try{rs.close();} catch(SQLException se){}
			try{prepStmt.close();} catch(SQLException se){}
		}
	}

	public void disableUnavailableLectures(RegisterEnrollmentView registerEnrollmentView){
		List<Component> componentList = getAllComponents(registerEnrollmentView);
		PreparedStatement prepStmt = null;
		ResultSet rs = null;
		
		// Create 2 lists to store all the lecture labels and checkboxes
		List<JLabel> lectureLabelsList = new ArrayList<JLabel>();
		List<JCheckBox> lectureCheckboxList = new ArrayList<JCheckBox>();
		
		// Fill the lists with the corresponding components
		for (Component comp : componentList){
			if(comp instanceof JLabel && ((JLabel) comp).getText().contains("lecture"))
				lectureLabelsList.add((JLabel) comp);
			else if(comp instanceof JCheckBox)
				lectureCheckboxList.add((JCheckBox) comp);
		}
		
		try{
			// Fetch active student's unavailable lectures
			prepStmt = connection.prepareStatement("CALL unavailable_lecture_procedure(?);",
																ResultSet.TYPE_SCROLL_SENSITIVE,
																ResultSet.CONCUR_UPDATABLE);
			prepStmt.setString(1, String.valueOf(student.getId()));
			rs = prepStmt.executeQuery();
			
			int count = 0;
			// Disables the components responsible for the management of the received unavailable lectures
			while(rs.next()){
				for(Component comp : lectureLabelsList){
					if(((JLabel) comp).getText().equals(rs.getString(1))){
						lectureLabelsList.get(count).setEnabled(false);
						lectureCheckboxList.get(count).setEnabled(false);
					}
					count++;
				}
				count = 0;
			}
		}
		catch(SQLException se){se.printStackTrace();}
		finally{
			try{rs.close();} catch(SQLException se){}
			try{prepStmt.close();} catch(SQLException se){}
		}
	}

	// Create using recursion, a list with all the components of the given container and return it 
	public List<Component> getAllComponents(Container container) {
		Component[] components = container.getComponents();
		List<Component> componentList = new ArrayList<Component>();
		for (Component comp : components) {
			componentList.add(comp);
			if (comp instanceof Container) componentList.addAll(getAllComponents((Container) comp));
		}
		return componentList;
  }

}
