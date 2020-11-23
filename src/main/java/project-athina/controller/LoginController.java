package controller;

import java.util.regex.Pattern;

public class LoginController {
    private String username;
    private String password;
    private String userType;

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

}

