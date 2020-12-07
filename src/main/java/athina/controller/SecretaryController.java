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
	private enum Type {student, secretary, professor, admin};
	private String targetStudentId;
	private Connection connection;
	
	public SecretaryController(Secretary secretary,ArrayList<JFrame> frameList,Connection connection){
		this.secretary = secretary;
		this.frameList = frameList;
		this.connection = connection;
		((StudentsView) frameList.get(1)).setController(this);
		((NewStudentView) frameList.get(2)).setController(this);
	}

	// Set and Reveal secretary info frame
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

	// Reveal student management frame
	public void displayStudentsView(){
		StudentsView studentsView = ((StudentsView) frameList.get(1));
		studentsView.setVisible(true);
	}

	// Reveal student registration frame
	public void displayNewStudentView(){
		NewStudentView newStudentView = ((NewStudentView) frameList.get(1));
		newStudentView.setVisible(true);
	}

	// Registers a new student into the DB
	public void registerNewStudent(){
		NewStudentView newStudentView = (NewStudentView) frameList.get(2);
		try(PreparedStatement prepStmnt = connection.prepareStatement("CALL register_student_procedure(?,?,?,?)")){
			prepStmnt.setString(1, newStudentView.getName());
			prepStmnt.setString(2, newStudentView.getSurname());
			prepStmnt.setString(3, newStudentView.getPhoneNumber());
			prepStmnt.setString(4, newStudentView.getAdress());
			prepStmnt.executeQuery();
		}
		catch(SQLException se){se.printStackTrace();}					 
	}

	// Fetches the student with the given ID and updates StudentsView 
	public void findStudent(){
		StudentsView studentsView = (StudentsView) frameList.get(1);
		String fullName;
		targetStudentId = studentsView.getId();
		try(PreparedStatement prepStmnt = connection.prepareStatement("CALL user_info_procedure(?,?)")){
			prepStmnt.setString(1, targetStudentId);
			prepStmnt.setString(2, Type.student.name());
			ResultSet resultSet = prepStmnt.executeQuery();
			if(resultSet.next()){
				fullName = resultSet.getString("name").concat(" ").concat(resultSet.getString("surname"));
				studentsView.setFullName(fullName);
			}
		}
		catch(SQLException se){se.printStackTrace();}	
	}
	
	// Fetches the student with the given ID and updates StudentsView 
	public void removeStudent(){
		if(targetStudentId != null){ 
			try(PreparedStatement prepStmnt = connection.prepareStatement("CALL remove_student_procedure(?)")){
				prepStmnt.setString(1, targetStudentId);
				prepStmnt.executeQuery();
			}
			catch(SQLException se){se.printStackTrace();}	
		}
	}
}
