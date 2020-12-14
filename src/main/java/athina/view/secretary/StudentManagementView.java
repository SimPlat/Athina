package athina.view.secretary;

import athina.controller.SecretaryController;

public class StudentManagementView extends javax.swing.JFrame {
	private static final long serialVersionUID = -8262023502964023183L;
	private SecretaryController secretaryController;

	public StudentManagementView() {
		initComponents();
	}

	public void setController(SecretaryController secretaryController) {
		this.secretaryController = secretaryController;
	}

	public String getId(){
		return studentIdTextField.getText();
	}

	public void setFullName(String fullName){
		nameData.setText(fullName);
	}
   
	private void registerStudentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerStudentButtonActionPerformed
		secretaryController.displayRegisterStudentView();
		secretaryController.displayRegisterStudentView();
	}//GEN-LAST:event_registerStudentButtonActionPerformed

	private void findStudentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findStudentButtonActionPerformed
		secretaryController.findStudent();
		secretaryController.findStudent();
	}//GEN-LAST:event_findStudentButtonActionPerformed

	private void removeStudentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeStudentButtonActionPerformed
		secretaryController.removeStudent();
		secretaryController.removeStudent();
	}//GEN-LAST:event_removeStudentButtonActionPerformed

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton findStudentButton;
	private javax.swing.JLabel logoLabel;
	private javax.swing.JLabel nameData;
	private javax.swing.JLabel nameLabel;
	private javax.swing.JButton registerStudentButton;
	private javax.swing.JButton removeStudentButton;
	private javax.swing.JLabel studentIdLabel;
	private javax.swing.JTextField studentIdTextField;
	private javax.swing.JLabel titleLabel;
	// End of variables declaration//GEN-END:variables

	// <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		logoLabel = new javax.swing.JLabel();
		titleLabel = new javax.swing.JLabel();
		registerStudentButton = new javax.swing.JButton();
		studentIdLabel = new javax.swing.JLabel();
		studentIdTextField = new javax.swing.JTextField();
		findStudentButton = new javax.swing.JButton();
		nameLabel = new javax.swing.JLabel();
		nameData = new javax.swing.JLabel();
		removeStudentButton = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		logoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		logoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/athina/view/cropped-ihu-logo_el-16.png"))); // NOI18N
		logoLabel.setText("logo");

		titleLabel.setText("Student Management");

		registerStudentButton.setText("Register Student");
		registerStudentButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				registerStudentButtonActionPerformed(evt);
			}
		});

		studentIdLabel.setText("Student ID");

		studentIdTextField.setText("XXXXX");

		findStudentButton.setText("Find Student");
		findStudentButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				findStudentButtonActionPerformed(evt);
			}
		});

		nameLabel.setText("Name");

		nameData.setText("Name Surname");

		removeStudentButton.setText("Remove Student");
		removeStudentButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				removeStudentButtonActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(
			layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			.addGroup(layout.createSequentialGroup()
				.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
					.addGroup(layout.createSequentialGroup()
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
							.addGroup(layout.createSequentialGroup()
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
									.addComponent(studentIdLabel)
									.addComponent(nameLabel))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addComponent(studentIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
							.addGroup(layout.createSequentialGroup()
								.addGap(60, 60, 60)
								.addComponent(nameData, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
						.addGap(0, 0, 0)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
							.addComponent(removeStudentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
							.addComponent(findStudentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
					.addGroup(layout.createSequentialGroup()
						.addComponent(logoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
							.addGroup(layout.createSequentialGroup()
								.addGap(150, 150, 150)
								.addComponent(registerStudentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
							.addGroup(layout.createSequentialGroup()
								.addGap(46, 46, 46)
								.addComponent(titleLabel)))))
				.addGap(12, 12, 12))
		);

		layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {nameLabel, studentIdLabel});

		layout.setVerticalGroup(
			layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			.addGroup(layout.createSequentialGroup()
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
					.addGroup(layout.createSequentialGroup()
						.addGap(16, 16, 16)
						.addComponent(logoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
					.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
						.addGap(8, 8, 8)
						.addComponent(titleLabel)
						.addGap(20, 20, 20)
						.addComponent(registerStudentButton)))
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
					.addComponent(studentIdLabel)
					.addComponent(studentIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
					.addComponent(findStudentButton))
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
					.addComponent(nameLabel)
					.addComponent(nameData)
					.addComponent(removeStudentButton))
				.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);

		pack();
	}// </editor-fold>//GEN-END:initComponents
}
