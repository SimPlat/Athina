package athina.controller;

import athina.model.Student;
import athina.view.global.*;
import athina.view.student.*;
import java.util.ArrayList;
import javax.swing.JFrame;
import java.sql.*;

public class StudentController implements UserController{
	private Student student;
	private ArrayList<JFrame> frameList; // 0=InfoView | 1=EnrollmentManagementView | 2=NewEnrollmentsView
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

	public void displayEnrollmentsView(){
		EnrollmentManagementView enrollmentsView = (EnrollmentManagementView) frameList.get(1);
		enrollmentsView.setVisible(true);
	}

	public void displayNewEnrollmentView(){
		RegisterEnrollmentView newEnrollmentView = (RegisterEnrollmentView) frameList.get(2);
		newEnrollmentView.setVisible(true);
	}

	public void submitEnrollment(){
		
	}
	
}
