package athina.controller;

import java.util.regex.Pattern;
import java.sql.*;

public class LoginController {
	private String username;
	private String password;
	private String userType = "";
	private boolean connected = false;
	private Connection connection = null;
	final private String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	final private String db_url = "jdbc:mysql://localhost:3306/Athina_db?";// + "useInformationSchema=true";
	
	public LoginController(){
	}

	public void setUsername(String username){
		this.username = username;
	}

	public void setPassword(String password){
		this.password = password;
	}

	public int getUserId(){
		return Integer.valueOf(username.substring(2));
	}

	public String getUserType(){
		return userType;
	}

	public Connection getDbConnection(){
		return connection;
	}

	public void checkUsernameType(){
		if (Pattern.matches("^[a-z]{2}[0-9]{5}$",username)){
			switch(username.substring(0,2)){
				case "st":   
					this.userType="student";
					break;
				case "se":
					userType="secretary";
					break;
				case "pr":
					userType="professor";
					break;
				case "ad":
					userType="admin";
					break;
				default:
					// Invalid user type
			}
		}
		else{
			// Invalid username
		}
	}

	public void dbConnect(){
		checkUsernameType();
		// Connect to DB
		try {
			Class.forName(JDBC_DRIVER);
			connection = DriverManager.getConnection(db_url,username,password);
			System.out.println("Connecting to Athina DB...");
		}
		catch(SQLException se){se.printStackTrace();}   // Handle JDBC errors
		catch(Exception e){e.printStackTrace();}        // Handle Class.forName errors
		finally{connected = true;}
	}

	// Invokes DB routine login_function(String username, String password, Enum type(studen,secretary,professor,admin))
	public String logInValidation(){
		boolean validation = false;
		dbConnect();
		try(PreparedStatement prepStmnt = connection.prepareStatement("SELECT login_function(?,?,?) as login_function",
																	ResultSet.TYPE_SCROLL_SENSITIVE,
																	ResultSet.CONCUR_UPDATABLE)){
																			
			prepStmnt.setString(1, username);
			prepStmnt.setString(2, password);
			prepStmnt.setString(3, userType);
			ResultSet rs = prepStmnt.executeQuery();

			validation = (1 == (rs.next() ? rs.getInt("login_function") : null));
		}
		catch(SQLException se){se.printStackTrace();}  
		if (validation)
			return userType;
		return null;
	}

	public boolean connected(){
		return connected;
	}
}

