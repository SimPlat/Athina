package athina.controller;

import java.util.regex.Pattern;
import java.sql.*;

public class LoginController {
    private String username;
    private String password;
    private String userType = "";

    final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    final String db_url = "jdbc:mysql://localhost/Athina_db";
    Connection conn = null;
    
    public LoginController(String username, String password){
        this.username = username;
        this.password = password;
    }

    public void checkUsernameType(){
        if (Pattern.matches("^[a-z]{2}[0-9]{8}$",username)){
            switch(username.substring(0,2)){
                case "st":    
                    userType="student";
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
        try {
            // Connect to DB
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Connecting to Athina DB...");
            conn = DriverManager.getConnection(db_url,username,password);
        }
        catch(SQLException se){se.printStackTrace();}   // Handle JDBC errors
        catch(Exception e){e.printStackTrace();}        // Handle Class.forName errors
    }

    // Invokes DB routine login_function(String username, String password, Enum type(studen,secretary,professor,admin))
    public String logIn(){
        boolean validation = false;
        dbConnect();
        try(PreparedStatement prepStmnt = conn.prepareStatement("SELECT login_function(?,?,?) as login_function",
                                                                ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE)){
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
    //
    public static String loginCheck(String username,String password,String user_type){
        return null;
    }
    //
    public static String checkResult(String rs){
        return null;
    }
}

