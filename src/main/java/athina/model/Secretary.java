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
		try(PreparedStatement prpdStmnt = connection.prepareStatement("CALL employee_info_procedure(?,?)",
																ResultSet.TYPE_SCROLL_SENSITIVE,
																ResultSet.CONCUR_UPDATABLE)){
        	prpdStmnt.setString(1, String.valueOf(id));
			prpdStmnt.setString(2, Type.secretary.name());
			ResultSet resultSet = prpdStmnt.executeQuery();

			if(resultSet.next()){
				super.setId(id);
				super.setFirstName(resultSet.getString(5));
				super.setLastName(resultSet.getString(6));
				super.setEmail(resultSet.getString(7));
				super.setPhoneNumber(resultSet.getString(8));
				super.setAdress(resultSet.getString(9));
			}
			prpdStmnt.close();
        }
		catch(SQLException se){se.printStackTrace();}
	}
}