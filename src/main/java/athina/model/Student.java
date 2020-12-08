package athina.model;

import java.sql.*;

public class Student extends User {
	private Connection connection;
	private int ects;
	
	public Student(int id,Connection connection){
		this.connection = connection;
		getInfoFromDb(id);
	}

	public void setEcts(int ects) {
		this.ects = ects;
	}

	public int getEcts() {
		return ects;
	}

	private void getInfoFromDb(int id){
		try(CallableStatement callStmnt = connection.prepareCall("CALL student_info_procedure(?)",
																ResultSet.TYPE_SCROLL_SENSITIVE,
																ResultSet.CONCUR_UPDATABLE)){
			callStmnt.setString(1, String.valueOf(id));
			ResultSet resultSet = callStmnt.executeQuery();

			if(resultSet.next()){
				super.setId(id);
				super.setFirstName(resultSet.getString(5));
				super.setLastName(resultSet.getString(6));
				super.setEmail(resultSet.getString(7));
				super.setPhoneNumber(resultSet.getString(8));
				super.setAdress(resultSet.getString(9));
				setEcts(resultSet.getInt(10));
			}
			callStmnt.close();
		}
		catch(SQLException se){se.printStackTrace();}
	}

}