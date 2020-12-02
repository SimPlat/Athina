package athina.main;

import athina.model.*;
import athina.controller.*;
import athina.view.global.*;
import athina.view.student.*;
import athina.view.secretary.*;
import java.sql.Connection;
import java.util.ArrayList;
import javax.swing.JFrame;

public class Main {
	public static void main(String[] args) {
		// Standard generalized variables
		boolean flag = true;             // Wait for connection signal flag
		Connection connection;           // DB Connection 
		User ussr;                       // Connected user
		UserController controller;       // User controller
		JFrame mainFrame;                // Main frame
		ArrayList<JFrame> frameList;     // User specific frames
		
		// Initialized login frame
		mainFrame = new LoginView(new LoginController());
		mainFrame.setVisible(true);
			
		// Shitty way to implement notify logic
		while(flag){
			flag = !(((LoginView) mainFrame).getController().connected());
			System.out.println("Not connected");
		}
	
		// Continue the flow after the connection branching out to specific user type
		switch(((LoginView) mainFrame).getController().getUserType()) {
			case "student":
			// Current student connection
			connection = ((LoginView) mainFrame).getController().getDbConnection();
			 
			// Create user student
			ussr =  new Student(((LoginView) mainFrame).getController().getUserId(),connection);
			 
			// Create the needed controller and frames for student
			frameList = new ArrayList<JFrame>();
			frameList.add(0,new InfoView());
			frameList.add(1,new EnrollmentsView());
			frameList.add(2,new NewEnrollmentView());
			controller = new StudentController((Student) ussr,frameList,connection);
			 
			 // Replace login with main menu on the main frame
				mainFrame.dispose();
				mainFrame = new MainMenuView(controller);
				mainFrame.setVisible(true);
				break;
			case "secretary":
				break;
			default:
				ussr = null; // Государственный гимн СССР
		}
					
	}
}