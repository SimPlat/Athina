package athina.controller;

import athina.model.Secretary;
import athina.view.global.*;
import athina.view.secretary.*;

import java.util.List;
import javax.swing.JFrame;
import java.sql.*;

public class SecretaryController implements UserController{
	private Secretary secretary;
	private List<JFrame> List; // 0=InfoView | 1=ManagementView | 2=RegisterView
	private String targetStudentId;
	private Connection connection;
	
	public SecretaryController(Secretary secretary,List<JFrame> List,Connection connection){
		this.secretary = secretary;
		this.List = List;
		this.connection = connection;
		((StudentManagementView) List.get(1)).setController(this);
		((RegisterStudentView) List.get(2)).setController(this);
	}

	// Set and Reveal secretary info frame
	public void displayUserInfoView(){
		InfoView infoView = (InfoView) List.get(0);
		infoView.setId(secretary.getId());
		infoView.setName(secretary.getFirstName().concat(" ").concat(secretary.getLastName()));
		infoView.setEmail(secretary.getEmail());
		infoView.setPhoneNumber(secretary.getPhoneNumber());
		infoView.setAdress(secretary.getAdress());
		infoView.showTypeSpecificInfo(secretary);
		infoView.setVisible(true);
	}

	// Reveal student management frame
	public void displayStudentManagementView(){
		StudentManagementView studentManagementView = ((StudentManagementView) List.get(1));
		studentManagementView.setVisible(true);
	}

	// Reveal student registration frame
	public void displayRegisterStudentView(){
		RegisterStudentView registerStudentView = ((RegisterStudentView) List.get(2));
		registerStudentView.setVisible(true);
	}

	// Registers a new student into the DB
	public void registerNewStudent(){
		RegisterStudentView registerStudentView = (RegisterStudentView) List.get(2);
		PreparedStatement prepStmt = null;;
		try{
			prepStmt = connection.prepareStatement("CALL register_student_procedure(?,?,?,?)");
			prepStmt.setString(1, registerStudentView.getName());
			prepStmt.setString(2, registerStudentView.getSurname());
			prepStmt.setString(3, registerStudentView.getPhoneNumber());
			prepStmt.setString(4, registerStudentView.getAdress());
			prepStmt.execute();
		}
		catch(SQLException se){se.printStackTrace();}
		finally{try{prepStmt.close();} catch(SQLException se){}}	 
	}

	// Fetches the student with the given ID and updates studentManagementView 
	public void findStudent(){
		StudentManagementView studentManagementView = (StudentManagementView) List.get(1);
		PreparedStatement prepStmt = null;
		ResultSet rs = null;
		String fullName = null;
		targetStudentId = studentManagementView.getId();
		
		try{
			prepStmt = connection.prepareStatement("CALL student_info_procedure(?)");
			prepStmt.setString(1, targetStudentId);
			rs = prepStmt.executeQuery();
			if (rs.next())
				fullName = rs.getString(5).concat(" ").concat(rs.getString(6)); 
		}
		catch(SQLException se){se.printStackTrace();}
		finally{
			studentManagementView.setFullName(fullName);
			try{rs.close();} catch(SQLException se){}
			try{prepStmt.close();} catch(SQLException se){}
		}
	}
	
	// Removes the student found during the search procedure on StudentManagementView 
	public void removeStudent(){
		PreparedStatement prepStmt = null;
		if(targetStudentId != null){ 
			try{
				prepStmt = connection.prepareStatement("CALL remove_student_procedure(?)");
				prepStmt.setString(1, targetStudentId);
				prepStmt.execute();
			}
			catch(SQLException se){se.printStackTrace();}
			finally{try{prepStmt.close();} catch(SQLException se){}}	
		}
	}

}
