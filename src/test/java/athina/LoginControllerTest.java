package athina;

// <editor-fold defaultstate="collapsed" desc="Imports">
// Local Imports
import athina.controller.LoginController;

// Utility Imports
import java.util.regex.Pattern;

// Test Imports
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
// </editor-fold>

class LoginControllerTest{
   private LoginController loginController = new LoginController();

   // A list of different styles of usernames
   @ParameterizedTest(name = "Testing validity of {arguments}")
   @ValueSource(strings = {"st1234","st1235","st12356",
                           "se1234","se1235","se12356",
                           "pr1234","pr1235","pr12356",
                           "ad1234","ad1235","ad12356",
                           "1234","12345","123456",
                           "X1234" ,"X1235" ,"X12356",
                           "XX1234","XX1235","XX12356",
                           "XXX1234","XXX1235","XXX12356",
                           "1234XX","12345XX","123456XX"})

   void testCheckUsenameType(String username){
      // Initialize loginController.username
      loginController.setUsername(username);
      // Call the method about to be tested
      loginController.checkUsernameType();

      /* 
      *  Check if the parametered username matches a user type pattern
      *  If yes assert that the assigned user type matches the user type of the username pattern.
      *  Else ensure that the user type was not set.
      */
      if     (Pattern.matches("^st[0-9]{5}$",username)) Assertions.assertTrue(loginController.getUserType().equals("student"));
      else if(Pattern.matches("^se[0-9]{5}$",username)) Assertions.assertTrue(loginController.getUserType().equals("secretary"));
      else if(Pattern.matches("^pr[0-9]{5}$",username)) Assertions.assertTrue(loginController.getUserType().equals("professor"));
      else if(Pattern.matches("^ad[0-9]{5}$",username)) Assertions.assertTrue(loginController.getUserType().equals("admin"));
      else                                              Assertions.assertNull(loginController.getUserType());
   }
}

