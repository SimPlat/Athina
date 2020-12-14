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
	final private String db_url = "jdbc:mysql://0.tcp.ngrok.io:11635/Athina_db?"; // + "useInformationSchema=true";
	
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
		// Check if given username has the correct format "xx#####"
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

	public boolean connected(){
		return connected;
	}
}

