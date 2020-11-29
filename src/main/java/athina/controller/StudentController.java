/*
The Student controller contains all interactions of Student type Users that connect with the database
 */
package athina.controller;
import athina.model.Lecture;
import athina.model.Student;
import java.sql.Date;

public class StudentController {
    Student std;

    public static Lecture[] availableCoursesQueryParameters(Student student){
        return null;
    }
    public static String checkCoursesResultSet(Student student,Date cemester){
        return null;
    }
    public static void uploadNewEnrollment(Lecture[] choosenLectures){
        
    }
    public static boolean uploadNewEnrollmentQuery(Lecture[] choosenLectures){
        return false;
    }
    public static void updateEnrollment(Lecture[] choosenLectures,String id){
        
    }
    public static boolean updateEnrollmentQuery(Lecture[] choosenLectures,String id){
        return false;
    }
}
