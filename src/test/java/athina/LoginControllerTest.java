package athina;

import athina.controller.LoginController;

import java.util.regex.Pattern;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


class LoginControllerTest{
   private LoginController loginController = new LoginController();

   @ParameterizedTest(name = "Testing validity of {arguments}")
   @ValueSource(strings = {"st1234","st1235","st12356", 
                           "se1234","se1235","se12356", 
                           "pr1234","pr1235","pr12356", 
                           "ad1234","ad1235","ad12356", 
                           "X1234" ,"X1235" ,"X12356", 
                           "XX1234","XX1235","XX12356", 
                           "XXX1234","XXX1235","XXX12356"})
   void testCheckUsenameType(String username){
      loginController.setUsername(username);
      loginController.checkUsernameType();

      if     (Pattern.matches("^st[0-9]{5}$",username)) Assertions.assertTrue(loginController.getUserType().equals("student"));
      else if(Pattern.matches("^se[0-9]{5}$",username)) Assertions.assertTrue(loginController.getUserType().equals("secretary"));
      else if(Pattern.matches("^pr[0-9]{5}$",username)) Assertions.assertTrue(loginController.getUserType().equals("professor"));
      else if(Pattern.matches("^ad[0-9]{5}$",username)) Assertions.assertTrue(loginController.getUserType().equals("admin"));
      else                                              Assertions.assertNull(loginController.getUserType());
   }

}
