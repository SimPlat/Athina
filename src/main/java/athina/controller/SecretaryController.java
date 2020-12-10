package athina.controller;

import athina.model.Secretary;
import athina.view.global.*;
import athina.view.secretary.*;
import java.util.ArrayList;
import javax.swing.JFrame;
import java.sql.*;


public class SecretaryController implements UserController{
	private Secretary secretary;
	private ArrayList<JFrame> frameList; // 0=InfoView | 1=ManagementView | 2=RegisterView
	private String targetStudentId;
	private Connection connection;
	
	public SecretaryController(Secretary secretary,ArrayList<JFrame> frameList,Connection connection){
		this.secretary = secretary;
		this.frameList = frameList;
		this.connection = connection;
		((StudentManagementView) frameList.get(1)).setController(this);
		((RegisterStudentView) frameList.get(2)).setController(this);
	}

	// Set and Reveal secretary info frame
	public void displayUserInfoView(){
		InfoView infoView = (InfoView) frameList.get(0);
		infoView.setId(secretary.getId());
		infoView.setName(secretary.getFirstName().concat(" ").concat(secretary.getLastName()));
		infoView.setEmail(secretary.getEmail());
		infoView.setPhoneNumber(secretary.getPhoneNumber());
		infoView.setAdress(secretary.getAdress());
		infoView.setVisible(true);
	}

	// Reveal student management frame
	public void displayStudentManagementView(){
		StudentManagementView studentsView = ((StudentManagementView) frameList.get(1));
		studentsView.setVisible(true);
	}

	// Reveal student registration frame
	public void displayRegisterStudentView(){
		RegisterStudentView newStudentView = ((RegisterStudentView) frameList.get(2));
		newStudentView.setVisible(true);
	}

	// Registers a new student into the DB
	public void registerNewStudent(){
		RegisterStudentView newStudentView = (RegisterStudentView) frameList.get(2);
		try(PreparedStatement prpdStmnt = connection.prepareStatement("CALL register_student_procedure(?,?,?,?)")){
			prpdStmnt.setString(1, newStudentView.getName());
			prpdStmnt.setString(2, newStudentView.getSurname());
			prpdStmnt.setString(3, newStudentView.getPhoneNumber());
			prpdStmnt.setString(4, newStudentView.getAdress());
			prpdStmnt.execute();
			prpdStmnt.close();
		}
		catch(SQLException se){se.printStackTrace();}					 
	}

	// Fetches the student with the given ID and updates StudentsView 
	public void findStudent(){
		StudentManagementView studentsView = (StudentManagementView) frameList.get(1);
		String fullName = null;
		targetStudentId = studentsView.getId();
		try(PreparedStatement prpdStmnt = connection.prepareStatement("CALL student_info_procedure(?)",
																					ResultSet.TYPE_SCROLL_SENSITIVE,
																					ResultSet.CONCUR_UPDATABLE)){
			prpdStmnt.setString(1, targetStudentId);
			ResultSet resultSet = prpdStmnt.executeQuery();
			resultSet = prpdStmnt.executeQuery();
			if (resultSet.next()){
				fullName = resultSet.getString(5).concat(" ").concat(resultSet.getString(6)); 
			}
			prpdStmnt.close();
		}
		catch(SQLException se){se.printStackTrace();}
		finally{studentsView.setFullName(fullName);}
	}
	
	// Removes the student found during the search procedure on StudentManagementView 
	public void removeStudent(){
		if(targetStudentId != null){ 
			try(PreparedStatement prpdStmnt = connection.prepareStatement("CALL remove_student_procedure(?)")){
				prpdStmnt.setString(1, targetStudentId);
				prpdStmnt.execute();
				prpdStmnt.close();
			}
			catch(SQLException se){se.printStackTrace();}	
		}
	}
}
