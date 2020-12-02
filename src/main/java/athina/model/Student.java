package athina.model;

import java.sql.*;

public class Student extends User {
	private enum Type {student, secretary, professor, admin};
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
		try(PreparedStatement prepStmnt = connection.prepareStatement("CALL user_info_procedure(?,?)",
																	  ResultSet.TYPE_SCROLL_SENSITIVE,
																	  ResultSet.CONCUR_UPDATABLE)){
            prepStmnt.setString(1, String.valueOf(id));
			prepStmnt.setString(2, Type.student.name());
			ResultSet rs = prepStmnt.executeQuery();
			
			if(rs.next()){
				super.setId(id);
				super.setFirstName(rs.getString("name"));
				super.setLastName(rs.getString("surname"));
				super.setEmail(rs.getString("email"));
				super.setPhoneNumber(rs.getString("phone"));
				super.setAdress(rs.getString("adress"));
				setEcts(rs.getInt("ects"));
			}
        }
		catch(SQLException se){se.printStackTrace();}
	}

}