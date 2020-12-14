package athina.view.global;

import athina.controller.*;

public class MainMenuView extends javax.swing.JFrame {
	private static final long serialVersionUID = 6626742060523528285L;
	private UserController controller;

	public MainMenuView(UserController controller) {
		initComponents();
		this.controller = controller;
		studentMenuPanel.setVisible(false);
		professorMenuPanel.setVisible(false);
		secretaryMenuPanel.setVisible(false);
		adminMenuPanel.setVisible(false);
		showTypeSpecificMenu(controller);
	}

	public void showTypeSpecificMenu(UserController controller){
		if(controller instanceof StudentController){
			studentMenuPanel.setVisible(true);
		}
		else if(controller instanceof SecretaryController){
			secretaryMenuPanel.setVisible(true);
		}
	}

	private void userInfoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userInfoButtonActionPerformed
		controller.displayUserInfoView();
	}//GEN-LAST:event_userInfoButtonActionPerformed

	private void enrollmentsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enrollmentsButtonActionPerformed
		((StudentController) controller).displayEnrollmentManagementView();
	}//GEN-LAST:event_enrollmentsButtonActionPerformed

	private void manageStudentsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageStudentsButtonActionPerformed
		((SecretaryController) controller).displayStudentManagementView();
	}//GEN-LAST:event_manageStudentsButtonActionPerformed

	private void gradesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gradesButtonActionPerformed
		// TODO add your handling code here:
	}//GEN-LAST:event_gradesButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adminActionsLabel;
    private javax.swing.JPanel adminMenuPanel;
    private javax.swing.JButton applicationsButton;
    private javax.swing.JButton disconnetionButton;
    private javax.swing.JButton enrollmentsButton;
    private javax.swing.JButton gradesButton;
    private javax.swing.JButton lecturesButton;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JPanel mainMenuPanel;
    private javax.swing.JButton manageEmployeesButton;
    private javax.swing.JButton manageLecturesButton;
    private javax.swing.JButton manageStudentsButton;
    private javax.swing.JLabel professorActionsLabel;
    private javax.swing.JPanel professorMenuPanel;
    private javax.swing.JLabel secretaryActionsLabel;
    private javax.swing.JPanel secretaryMenuPanel;
    private javax.swing.JLabel studentActionsLabel;
    private javax.swing.JPanel studentMenuPanel;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JButton userInfoButton;
    // End of variables declaration//GEN-END:variables

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainMenuPanel = new javax.swing.JPanel();
        logoLabel = new javax.swing.JLabel();
        titleLabel = new javax.swing.JLabel();
        disconnetionButton = new javax.swing.JButton();
        userInfoButton = new javax.swing.JButton();
        studentMenuPanel = new javax.swing.JPanel();
        enrollmentsButton = new javax.swing.JButton();
        studentActionsLabel = new javax.swing.JLabel();
        secretaryMenuPanel = new javax.swing.JPanel();
        secretaryActionsLabel = new javax.swing.JLabel();
        manageStudentsButton = new javax.swing.JButton();
        applicationsButton = new javax.swing.JButton();
        professorMenuPanel = new javax.swing.JPanel();
        professorActionsLabel = new javax.swing.JLabel();
        gradesButton = new javax.swing.JButton();
        lecturesButton = new javax.swing.JButton();
        adminMenuPanel = new javax.swing.JPanel();
        adminActionsLabel = new javax.swing.JLabel();
        manageEmployeesButton = new javax.swing.JButton();
        manageLecturesButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        logoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/athina/view/cropped-ihu-logo_el-16.png"))); // NOI18N

        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("Information and Electronice Engineering Department ");

        disconnetionButton.setText("Logout");

        userInfoButton.setText("User Information");
        userInfoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userInfoButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainMenuPanelLayout = new javax.swing.GroupLayout(mainMenuPanel);
        mainMenuPanel.setLayout(mainMenuPanelLayout);
        mainMenuPanelLayout.setHorizontalGroup(
            mainMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainMenuPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainMenuPanelLayout.createSequentialGroup()
                        .addComponent(logoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(titleLabel)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainMenuPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(userInfoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(115, 115, 115))))
            .addGroup(mainMenuPanelLayout.createSequentialGroup()
                .addGap(198, 198, 198)
                .addComponent(disconnetionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(198, 198, 198))
        );
        mainMenuPanelLayout.setVerticalGroup(
            mainMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainMenuPanelLayout.createSequentialGroup()
                .addGroup(mainMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainMenuPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(logoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainMenuPanelLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(disconnetionButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(userInfoButton)
                .addGap(0, 0, 0))
        );

        enrollmentsButton.setText("Enrollments");
        enrollmentsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enrollmentsButtonActionPerformed(evt);
            }
        });

        studentActionsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        studentActionsLabel.setText("Student Actions");

        javax.swing.GroupLayout studentMenuPanelLayout = new javax.swing.GroupLayout(studentMenuPanel);
        studentMenuPanel.setLayout(studentMenuPanelLayout);
        studentMenuPanelLayout.setHorizontalGroup(
            studentMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, studentMenuPanelLayout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addGroup(studentMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(enrollmentsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(studentActionsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(115, 115, 115))
        );
        studentMenuPanelLayout.setVerticalGroup(
            studentMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(studentMenuPanelLayout.createSequentialGroup()
                .addComponent(studentActionsLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(enrollmentsButton))
        );

        secretaryActionsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        secretaryActionsLabel.setText("Secretary Actions");

        manageStudentsButton.setText("Manage Students");
        manageStudentsButton.setToolTipText("");
        manageStudentsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageStudentsButtonActionPerformed(evt);
            }
        });

        applicationsButton.setText("Applications");

        javax.swing.GroupLayout secretaryMenuPanelLayout = new javax.swing.GroupLayout(secretaryMenuPanel);
        secretaryMenuPanel.setLayout(secretaryMenuPanelLayout);
        secretaryMenuPanelLayout.setHorizontalGroup(
            secretaryMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(secretaryMenuPanelLayout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addGroup(secretaryMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(applicationsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(manageStudentsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(secretaryActionsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(115, 115, 115))
        );
        secretaryMenuPanelLayout.setVerticalGroup(
            secretaryMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(secretaryMenuPanelLayout.createSequentialGroup()
                .addComponent(secretaryActionsLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(manageStudentsButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(applicationsButton))
        );

        professorActionsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        professorActionsLabel.setText("Professor Actions");

        gradesButton.setText("Grades");
        gradesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gradesButtonActionPerformed(evt);
            }
        });

        lecturesButton.setText("Lectures");

        javax.swing.GroupLayout professorMenuPanelLayout = new javax.swing.GroupLayout(professorMenuPanel);
        professorMenuPanel.setLayout(professorMenuPanelLayout);
        professorMenuPanelLayout.setHorizontalGroup(
            professorMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, professorMenuPanelLayout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addGroup(professorMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lecturesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gradesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(professorActionsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(115, 115, 115))
        );
        professorMenuPanelLayout.setVerticalGroup(
            professorMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(professorMenuPanelLayout.createSequentialGroup()
                .addComponent(professorActionsLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gradesButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lecturesButton))
        );

        adminActionsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        adminActionsLabel.setText("Admin Actions");

        manageEmployeesButton.setText("Manage Employees");

        manageLecturesButton.setText("Manage Lectures");

        javax.swing.GroupLayout adminMenuPanelLayout = new javax.swing.GroupLayout(adminMenuPanel);
        adminMenuPanel.setLayout(adminMenuPanelLayout);
        adminMenuPanelLayout.setHorizontalGroup(
            adminMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminMenuPanelLayout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addGroup(adminMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(manageEmployeesButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(manageLecturesButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(adminActionsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(115, 115, 115))
        );
        adminMenuPanelLayout.setVerticalGroup(
            adminMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminMenuPanelLayout.createSequentialGroup()
                .addComponent(adminActionsLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(manageEmployeesButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(manageLecturesButton))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(professorMenuPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(secretaryMenuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(adminMenuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(studentMenuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(mainMenuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainMenuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(studentMenuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(secretaryMenuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(professorMenuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(adminMenuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
}
