package athina.controller;

import athina.model.Student;
import athina.model.Lecture;
import athina.view.global.*;
import athina.view.student.*;

import java.util.List;
import java.awt.Container;
import java.awt.Component;
import java.time.LocalDate;
import javax.swing.*;
import java.sql.*;

public class StudentController implements UserController{
	private Student student;
	private Connection connection;
	private List<JFrame> frameList;	// 0=InfoView | 1=EnrollmentManagementView | 2=RegisterEnrollmentView
	private List<Lecture> lectureList;
	private List<JCheckBox> checkboxList;

	public StudentController(Student student,List<Lecture> lectureList,List<JCheckBox> checkboxList,
									List<JFrame> frameList,Connection connection){
		this.student = student;
		this.lectureList = lectureList;
		this.checkboxList = checkboxList;
		this.frameList = frameList;
		this.connection = connection;
		((EnrollmentManagementView) frameList.get(1)).setController(this);
		((RegisterEnrollmentView) frameList.get(2)).setController(this);
		getAllCheckboxes(frameList.get(2));
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

	// Sends the selected lectures to the DB
	public void submitEnrollment(){
		RegisterEnrollmentView registerEnrollmentView = (RegisterEnrollmentView) frameList.get(2);
		List<JCheckBox> lecturCheckBoxList = checkboxList;
		PreparedStatement prepStmt = null;

		try{
			prepStmt = connection.prepareStatement("CALL register_enrollment_procedure(?,?)");
			prepStmt.setInt(1, student.getId());

			for (JCheckBox jc : lecturCheckBoxList){
				if(jc.isSelected()){
					for(Lecture le : lectureList){
						if(le.getName().equals(jc.getText())){
							prepStmt.setInt(2,le.getId());
							prepStmt.execute();
						} 
					}
				}
			}
		}catch (SQLException se){se.printStackTrace();}
		finally{
			try{prepStmt.close();} catch(SQLException se){}
			registerEnrollmentView.setVisible(false);
		}
	}

	// Update lecture names from DB and prevent GUI from interacting with unavailable lectures
	public void prepareRegisterEnrollmentView(RegisterEnrollmentView registerEnrollmentView){
		Statement stmt = null;
		ResultSet rs = null;
		List<JCheckBox> lecturCheckBoxList = checkboxList;
		int currentMonth = LocalDate.now().getMonthValue();
		
		// Hide off season lectures
		if (currentMonth < 3 || currentMonth > 8) registerEnrollmentView.hideOutOfSeason("winter");
		else registerEnrollmentView.hideOutOfSeason("spring");

		try{
			// Fetch all the lecture info
			stmt = connection.createStatement();
			rs = stmt.executeQuery("CALL lecture_info_procedure(-1)");

			// Fill the labels with the fetched lecture names
			for(Component comp : lecturCheckBoxList){
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
			try{stmt.close();} catch(SQLException se){}
		}
		disableUnavailableLectures(registerEnrollmentView);
	}

	// Disable passed lecture's checkboxes
	private void disableUnavailableLectures(RegisterEnrollmentView registerEnrollmentView){
		List<JCheckBox> lectureCheckboxList = checkboxList;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try{
			// Fetch active student's unavailable lectures
			stmt = connection.prepareStatement("CALL unavailable_lectures_procedure(?)");
			stmt.setInt(1, student.getId());
			rs = stmt.executeQuery();
			
			// Disables the checkboxes responsible for the received unavailable lectures
			while(rs.next()){
				for(JCheckBox jc : lectureCheckboxList){	
					if(jc.getText().equals(rs.getString(2)))
						jc.setEnabled(false);
				}
			}
		}
		catch(SQLException se){se.printStackTrace();}
		finally{
			try{rs.close();} catch(SQLException se){}
			try{stmt.close();} catch(SQLException se){}
		}
	}

	// Create using recursion, a list with all the components of the given container and return it 
	private void getAllCheckboxes(Container container) {
		Component[] components = container.getComponents();
		for (Component comp : components) {
			if (comp instanceof JCheckBox) checkboxList.add((JCheckBox) comp);
			if (comp instanceof Container) getAllCheckboxes((Container) comp);
		}
   }

}
