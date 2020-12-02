package athina.controller;

import athina.model.Student;
import athina.view.global.*;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JFrame;

public class StudentController implements UserController{
	private Student student;
	private ArrayList<JFrame> frameList;
	private Connection connection;

	public StudentController(Student student,ArrayList<JFrame> frameList,Connection connection){
		this.student = student;
		this.frameList = frameList;
		this.connection = connection;
	}

	// Updates user info frame
	public void displayUserInfo(){
		InfoView infoView = (InfoView) frameList.get(0);
		infoView.setId(student.getId());
		infoView.setFirstName(student.getFirstName());
		infoView.setLastName(student.getLastName());
		infoView.setEmail(student.getEmail());
		infoView.setPhoneNumber(student.getPhoneNumber());
		infoView.setAdress(student.getAdress());
		infoView.setEcts(student.getEcts());
		infoView.setVisible(true);
	}
}
