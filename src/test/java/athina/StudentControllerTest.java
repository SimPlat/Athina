package athina;

// <editor-fold defaultstate="collapsed" desc="Imports">
// Local Imports
import athina.view.student.EnrollmentManagementView;
import athina.view.student.RegisterEnrollmentView;
import athina.controller.StudentController;
import athina.model.Lecture;
import athina.model.Student;

// Utility Imports
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Test Imports
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import org.mockito.MockitoAnnotations;
import org.mockito.Mock;
// </editor-fold>

public class StudentControllerTest {
   // Test target class
   private StudentController studentController = new StudentController();

   // Initialize dummy lists
   private List<Lecture> mockedLecturesList = new ArrayList<>();
   private List<JCheckBox> mockedCheckboxesList = new ArrayList<>();
   private List<JFrame> mockedFramesList = new ArrayList<>();
   private EnrollmentManagementView enrollmentManagementView = new EnrollmentManagementView();
   private RegisterEnrollmentView registerEnrollmentView = new RegisterEnrollmentView();

   // Define which object will be mocked for the dependency injection on StudentController
   @Mock private Student mockedStudent;
   @Mock private Lecture mockedLecture;
   @Mock private Connection mockedConnection; 
   @Mock private PreparedStatement mockedPreparedStatement;
   @Mock private JCheckBox mockedCheckBox;
   @Mock private JFrame mockedFrame;


   @BeforeEach
	void setup(){
      // Initialize Mocks
      MockitoAnnotations.openMocks(this);
      
      // Fill dummy lists with mocked objects
      mockedFramesList = Arrays.asList(mockedFrame,enrollmentManagementView,registerEnrollmentView);
      // Add 3 lectures
      mockedLecturesList = Arrays.asList(mockedLecture,mockedLecture,mockedLecture);
      // Change all mockedCheckBoxes to selected
      mockedCheckBox.setSelected(true);
      // Add 4 lecture checkboxes
      mockedCheckboxesList = Arrays.asList(mockedCheckBox,mockedCheckBox,mockedCheckBox,mockedCheckBox);   

      // Set StudentController private fields with the mocked objects
      studentController.setStudent(mockedStudent);
      studentController.setConnection(mockedConnection);
      studentController.setLectureList(mockedLecturesList);
      studentController.setCheckboxList(mockedCheckboxesList);
      studentController.setFrameList(mockedFramesList);
	}

   @Test
   void testSubmitEnrollment() throws SQLException{
      String lectureName = "lectureName";
      
      // Set mockedCheckBoxes checked
      when(mockedCheckBox.isSelected()).thenReturn(true);

      // Set identical lecture name on mockedCheckBoxes and mockedLectures
      when(mockedCheckBox.getText()).thenReturn(lectureName);
      when(mockedLecture.getName()).thenReturn(lectureName);
      
      // Set the return value of mockedConnection.prepareStatement to mockedPreparedStatement
      when(mockedConnection.prepareStatement("CALL register_enrollment_procedure(?,?)")).thenReturn(mockedPreparedStatement);
      
      // Call the method which is being tested
      studentController.submitEnrollment();
      
      /* 
      * Verify that the execution of the query got triggered the expected** number of times.
      * **Expected trigger number equals to, Checked_CheckBoxes * Lectures - sum of Lectures with a different name than the label of a check_checkbox.
      * ex. current case: Checked_CheckBoxes(all)=4, Number of Lectures=3, sum of Lectures where (lecture.name <> Checked_CheckBoxes.getLabel)=0 since all CheckBoxes and Lectures have the same name(String lectureName).
      *     4 * 3 - 0 = 12  
      */
      verify(mockedPreparedStatement,times(12)).execute();  
   }
}
