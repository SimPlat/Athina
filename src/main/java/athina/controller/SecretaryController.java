package athina.controller;

import athina.model.Secretary;
import athina.view.global.*;
import athina.view.secretary.*;
import java.util.ArrayList;
import javax.swing.JFrame;
import java.sql.*;


public class SecretaryController implements UserController{
	private Secretary secretary;
	private ArrayList<JFrame> frameList; // 0=InfoView | 1=StudentsView | 2=NewStudentView
	private Connection connection;

	public SecretaryController(Secretary secretary,ArrayList<JFrame> frameList,Connection connection){
		this.secretary = secretary;
		this.frameList = frameList;
		this.connection = connection;
		((StudentsView) frameList.get(1)).setController(this);
		((NewStudentView) frameList.get(2)).setController(this);
	}

	// Updates user info frame
	public void displayUserInfoView(){
		InfoView infoView = (InfoView) frameList.get(0);
		infoView.setId(secretary.getId());
		infoView.setFirstName(secretary.getFirstName());
		infoView.setLastName(secretary.getLastName());
		infoView.setEmail(secretary.getEmail());
		infoView.setPhoneNumber(secretary.getPhoneNumber());
		infoView.setAdress(secretary.getAdress());
		infoView.setVisible(true);
	}

	public static Boolean UploadNewStudent(String Info){
		return null;
	}
	public static String UploadNewStudentQuery(String Info){
		return null;
	}
	public static Boolean SearchStudent(String AM){
		return null;
	}
	public static String SearchStudentQuery(String AM){
		return null;
	}
}
