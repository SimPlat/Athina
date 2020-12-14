package athina.model;

import java.sql.*;

public class Secretary extends User {
	private enum Type {secretary, professor, admin};
	private Connection connection;

	public Secretary(int id,Connection connection){
		this.connection = connection;
		getInfoFromDb(id);
	}

	private void getInfoFromDb(int id){
		PreparedStatement prepStmt = null;
		ResultSet rs = null;
		try{
			prepStmt = connection.prepareStatement("CALL employee_info_procedure(?,?)",
																ResultSet.TYPE_SCROLL_SENSITIVE,
																ResultSet.CONCUR_UPDATABLE);
        	prepStmt.setString(1, String.valueOf(id));
			prepStmt.setString(2, Type.secretary.name());
			rs = prepStmt.executeQuery();

			if(rs.next()){
				super.setId(id);
				super.setFirstName(rs.getString(5));
				super.setLastName(rs.getString(6));
				super.setEmail(rs.getString(7));
				super.setPhoneNumber(rs.getString(8));
				super.setAdress(rs.getString(9));
			}
      }
		catch(SQLException se){se.printStackTrace();}
		finally{
			try{rs.close();} catch(SQLException se){}
			try{prepStmt.close();} catch(SQLException se){}
		}		
	}
}