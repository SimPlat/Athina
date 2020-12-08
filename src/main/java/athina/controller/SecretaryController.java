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
		try(CallableStatement callStmnt = connection.prepareCall("CALL register_student_procedure(?,?,?,?)")){
			callStmnt.setString(1, newStudentView.getName());
			callStmnt.setString(2, newStudentView.getSurname());
			callStmnt.setString(3, newStudentView.getPhoneNumber());
			callStmnt.setString(4, newStudentView.getAdress());
			callStmnt.execute();
			callStmnt.close();
		}
		catch(SQLException se){se.printStackTrace();}					 
	}

	// Fetches the student with the given ID and updates StudentsView 
	public void findStudent(){
		StudentsView studentsView = (StudentsView) frameList.get(1);
		String fullName = null;
		targetStudentId = studentsView.getId();
		try(CallableStatement callStmnt = connection.prepareCall("CALL student_info_procedure(?)")){
			callStmnt.setString(1, targetStudentId);
			ResultSet resultSet = callStmnt.executeQuery();
			fullName = (resultSet.next()) ? resultSet.getString(5).concat(" ").concat(resultSet.getString(6))
										  : fullName;
			callStmnt.close(); 
		}
		catch(SQLException se){se.printStackTrace();}
		finally{studentsView.setFullName(fullName);}
	}
	
	// Fetches the student with the given ID and updates StudentsView 
	public void removeStudent(){
		if(targetStudentId != null){ 
			try(CallableStatement callStmnt = connection.prepareCall("CALL remove_student_procedure(?)")){
				callStmnt.setString(1, targetStudentId);
				callStmnt.execute();
				callStmnt.close();
			}
			catch(SQLException se){se.printStackTrace();}	
		}
	}
}
