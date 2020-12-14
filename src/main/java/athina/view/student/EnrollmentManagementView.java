package athina.view.student;

import athina.controller.StudentController;

public class EnrollmentManagementView extends javax.swing.JFrame {
	private static final long serialVersionUID = -9034476647528064051L;
	private StudentController studentController;

	public EnrollmentManagementView() {
		initComponents();
	}

	public void setController(StudentController studentController) {
		this.studentController = studentController;
	}
	
	private void newEnrollmentButtonMouseClicked(java.awt.event.MouseEvent evt) {                                                  
		studentController.displayRegisterEnrollmentView();
	}                                                

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton editEnrollmentButton;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JButton newEnrollmentButton;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        logoLabel = new javax.swing.JLabel();
        titleLabel = new javax.swing.JLabel();
        newEnrollmentButton = new javax.swing.JButton();
        editEnrollmentButton = new javax.swing.JButton();

        logoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/athina/view/cropped-ihu-logo_el-16.png"))); // NOI18N

        titleLabel.setText("Enrollments");

        newEnrollmentButton.setText("New Enrollment");
        newEnrollmentButton.setToolTipText("");
        newEnrollmentButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                newEnrollmentButtonMouseClicked(evt);
            }
        });

        editEnrollmentButton.setText("Edit Enrollment");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(newEnrollmentButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(editEnrollmentButton)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(titleLabel)
                        .addGap(110, 110, 110))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(titleLabel)
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(newEnrollmentButton)
                            .addComponent(editEnrollmentButton)))
                    .addComponent(logoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
}
