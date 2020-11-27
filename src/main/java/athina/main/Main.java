package athina.main;

import athina.controller.*;
import athina.view.*;

public class Main {

    public static void main(String[] args) {
        LoginController lc = new LoginController("ab", "ab");
        Enrollments en = new Enrollments();
        InfoView iv = new InfoView();
        LoginView lv = new LoginView();
        MainMenu mm = new MainMenu();
        NewEnrollment ne = new NewEnrollment();
        NewStudentView ns = new NewStudentView();
        StudentsView sv = new StudentsView();
        
        mm.setVisible(true);
        en.setVisible(true);
        iv.setVisible(true);
        lv.setVisible(true);
        ne.setVisible(true);
        ns.setVisible(true);
        sv.setVisible(true);
    }
}