package athina.model;

import java.sql.*;

public class Lecture {

	private Connection connection;
	private int id;
	private String name;
	private int semester;
	private int ects;
	private boolean mandatory;

	public Lecture(int id,Connection connection){
		this.connection = connection;
		this.id = id;
		getInfoFromDb();
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSemester(int semester) {
		this.semester = semester;
	}

	public void setEcts(int ects) {
		this.ects = ects;
	}

	public void setMandatory(boolean mandatory) {
		this.mandatory = mandatory;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getSemester() {
		return semester;
	}

	public int getEcts() {
		return ects;
	}

	public boolean getMandatory(){
		return mandatory;
	}

	private void getInfoFromDb(){
		ResultSet rs = null;
		PreparedStatement prepStmt = null;
		try{
			prepStmt = connection.prepareStatement("CALL lecture_info_procedure(?)",
																ResultSet.TYPE_SCROLL_SENSITIVE,
																ResultSet.CONCUR_UPDATABLE);
        	prepStmt.setString(1, String.valueOf(id));
			rs = prepStmt.executeQuery();

			if(rs.next()){
				setName(rs.getString(2));	
				setSemester(rs.getInt(3));
				setEcts(rs.getInt(4));
				setMandatory((rs.getInt(5) == 1));
			}
      }
		catch(SQLException se){se.printStackTrace();}
		finally{
			try{rs.close();} catch(SQLException se){}
			try{prepStmt.close();} catch(SQLException se){}
		}		
	}
	
}