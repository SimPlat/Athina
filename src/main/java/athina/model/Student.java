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
		PreparedStatement prepStmt = null;
		ResultSet rs = null;

		try{
			prepStmt = connection.prepareStatement("CALL student_info_procedure(?)");
			prepStmt.setString(1, String.valueOf(id));
			rs = prepStmt.executeQuery();

			if(rs.next()){
				super.setId(id);
				super.setFirstName(rs.getString(5));
				super.setLastName(rs.getString(6));
				super.setEmail(rs.getString(7));
				super.setPhoneNumber(rs.getString(8));
				super.setAdress(rs.getString(9));
				setEcts(rs.getInt(10));
			}

			prepStmt.close();
		}
		catch(SQLException se){se.printStackTrace();}
		finally{
			try{rs.close();} catch(SQLException se){}
			try{prepStmt.close();} catch(SQLException se){}
		}
	}

}
