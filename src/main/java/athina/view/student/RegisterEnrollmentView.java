package athina.view.student;

import athina.controller.StudentController;

public class RegisterEnrollmentView extends javax.swing.JFrame {
	private static final long serialVersionUID = 3054003590949168789L;
	private StudentController studentController;
	
	public RegisterEnrollmentView() {
		initComponents();
	}

	public void setController(StudentController studentController) {
		this.studentController = studentController;
	}

	public void hideOutOfSeason(String epoch){
		switch(epoch){
			case "winter":
				semesterPanel2.setVisible(false);
				semesterPanel4.setVisible(false);
				semesterPanel6.setVisible(false);
				semesterPanel8.setVisible(false);
				break;
			case "spring":
				semesterPanel1.setVisible(false);
				semesterPanel3.setVisible(false);
				semesterPanel5.setVisible(false);
				semesterPanel7.setVisible(false);
				semesterPanel9.setVisible(false);
				break;
			default:
		}
	}

	private void completeEntrollmentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_completeEntrollmentButtonActionPerformed
        studentController.submitEnrollment();
    }//GEN-LAST:event_completeEntrollmentButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton completeEntrollmentButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JCheckBox lectureBox1;
    private javax.swing.JCheckBox lectureBox10;
    private javax.swing.JCheckBox lectureBox11;
    private javax.swing.JCheckBox lectureBox12;
    private javax.swing.JCheckBox lectureBox13;
    private javax.swing.JCheckBox lectureBox14;
    private javax.swing.JCheckBox lectureBox15;
    private javax.swing.JCheckBox lectureBox16;
    private javax.swing.JCheckBox lectureBox17;
    private javax.swing.JCheckBox lectureBox18;
    private javax.swing.JCheckBox lectureBox19;
    private javax.swing.JCheckBox lectureBox2;
    private javax.swing.JCheckBox lectureBox20;
    private javax.swing.JCheckBox lectureBox21;
    private javax.swing.JCheckBox lectureBox22;
    private javax.swing.JCheckBox lectureBox23;
    private javax.swing.JCheckBox lectureBox24;
    private javax.swing.JCheckBox lectureBox25;
    private javax.swing.JCheckBox lectureBox26;
    private javax.swing.JCheckBox lectureBox27;
    private javax.swing.JCheckBox lectureBox28;
    private javax.swing.JCheckBox lectureBox29;
    private javax.swing.JCheckBox lectureBox3;
    private javax.swing.JCheckBox lectureBox30;
    private javax.swing.JCheckBox lectureBox31;
    private javax.swing.JCheckBox lectureBox32;
    private javax.swing.JCheckBox lectureBox33;
    private javax.swing.JCheckBox lectureBox34;
    private javax.swing.JCheckBox lectureBox35;
    private javax.swing.JCheckBox lectureBox36;
    private javax.swing.JCheckBox lectureBox37;
    private javax.swing.JCheckBox lectureBox38;
    private javax.swing.JCheckBox lectureBox39;
    private javax.swing.JCheckBox lectureBox4;
    private javax.swing.JCheckBox lectureBox40;
    private javax.swing.JCheckBox lectureBox41;
    private javax.swing.JCheckBox lectureBox42;
    private javax.swing.JCheckBox lectureBox43;
    private javax.swing.JCheckBox lectureBox44;
    private javax.swing.JCheckBox lectureBox45;
    private javax.swing.JCheckBox lectureBox5;
    private javax.swing.JCheckBox lectureBox6;
    private javax.swing.JCheckBox lectureBox7;
    private javax.swing.JCheckBox lectureBox8;
    private javax.swing.JCheckBox lectureBox9;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JLabel semesterLabel1;
    private javax.swing.JLabel semesterLabel2;
    private javax.swing.JLabel semesterLabel3;
    private javax.swing.JLabel semesterLabel4;
    private javax.swing.JLabel semesterLabel5;
    private javax.swing.JLabel semesterLabel6;
    private javax.swing.JLabel semesterLabel7;
    private javax.swing.JLabel semesterLabel8;
    private javax.swing.JLabel semesterLabel9;
    private javax.swing.JPanel semesterPanel1;
    private javax.swing.JPanel semesterPanel2;
    private javax.swing.JPanel semesterPanel3;
    private javax.swing.JPanel semesterPanel4;
    private javax.swing.JPanel semesterPanel5;
    private javax.swing.JPanel semesterPanel6;
    private javax.swing.JPanel semesterPanel7;
    private javax.swing.JPanel semesterPanel8;
    private javax.swing.JPanel semesterPanel9;
    private javax.swing.JSeparator seperator1;
    private javax.swing.JSeparator seperator2;
    private javax.swing.JSeparator seperator3;
    private javax.swing.JSeparator seperator4;
    private javax.swing.JSeparator seperator5;
    private javax.swing.JSeparator seperator6;
    private javax.swing.JSeparator seperator7;
    private javax.swing.JSeparator seperator8;
    private javax.swing.JSeparator seperator9;
    private javax.swing.JLabel studentData;
    private javax.swing.JLabel studentData1;
    private javax.swing.JLabel studentLabel;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        logoLabel = new javax.swing.JLabel();
        studentLabel = new javax.swing.JLabel();
        studentData = new javax.swing.JLabel();
        titleLabel = new javax.swing.JLabel();
        completeEntrollmentButton = new javax.swing.JButton();
        scrollPane = new javax.swing.JScrollPane();
        mainPanel = new javax.swing.JPanel();
        semesterPanel1 = new javax.swing.JPanel();
        semesterLabel1 = new javax.swing.JLabel();
        lectureBox1 = new javax.swing.JCheckBox();
        lectureBox2 = new javax.swing.JCheckBox();
        lectureBox3 = new javax.swing.JCheckBox();
        lectureBox4 = new javax.swing.JCheckBox();
        lectureBox5 = new javax.swing.JCheckBox();
        seperator1 = new javax.swing.JSeparator();
        semesterPanel2 = new javax.swing.JPanel();
        semesterLabel2 = new javax.swing.JLabel();
        lectureBox6 = new javax.swing.JCheckBox();
        lectureBox7 = new javax.swing.JCheckBox();
        lectureBox8 = new javax.swing.JCheckBox();
        lectureBox9 = new javax.swing.JCheckBox();
        lectureBox10 = new javax.swing.JCheckBox();
        seperator2 = new javax.swing.JSeparator();
        semesterPanel3 = new javax.swing.JPanel();
        semesterLabel3 = new javax.swing.JLabel();
        lectureBox11 = new javax.swing.JCheckBox();
        lectureBox12 = new javax.swing.JCheckBox();
        lectureBox13 = new javax.swing.JCheckBox();
        lectureBox14 = new javax.swing.JCheckBox();
        lectureBox15 = new javax.swing.JCheckBox();
        seperator3 = new javax.swing.JSeparator();
        semesterPanel4 = new javax.swing.JPanel();
        semesterLabel4 = new javax.swing.JLabel();
        lectureBox16 = new javax.swing.JCheckBox();
        lectureBox17 = new javax.swing.JCheckBox();
        lectureBox18 = new javax.swing.JCheckBox();
        lectureBox19 = new javax.swing.JCheckBox();
        lectureBox20 = new javax.swing.JCheckBox();
        seperator4 = new javax.swing.JSeparator();
        semesterPanel5 = new javax.swing.JPanel();
        semesterLabel5 = new javax.swing.JLabel();
        lectureBox21 = new javax.swing.JCheckBox();
        lectureBox22 = new javax.swing.JCheckBox();
        lectureBox23 = new javax.swing.JCheckBox();
        lectureBox24 = new javax.swing.JCheckBox();
        lectureBox25 = new javax.swing.JCheckBox();
        seperator5 = new javax.swing.JSeparator();
        semesterPanel6 = new javax.swing.JPanel();
        semesterLabel6 = new javax.swing.JLabel();
        lectureBox26 = new javax.swing.JCheckBox();
        lectureBox27 = new javax.swing.JCheckBox();
        lectureBox28 = new javax.swing.JCheckBox();
        lectureBox29 = new javax.swing.JCheckBox();
        lectureBox30 = new javax.swing.JCheckBox();
        seperator6 = new javax.swing.JSeparator();
        semesterPanel7 = new javax.swing.JPanel();
        semesterLabel7 = new javax.swing.JLabel();
        lectureBox31 = new javax.swing.JCheckBox();
        lectureBox32 = new javax.swing.JCheckBox();
        lectureBox33 = new javax.swing.JCheckBox();
        lectureBox34 = new javax.swing.JCheckBox();
        lectureBox35 = new javax.swing.JCheckBox();
        seperator7 = new javax.swing.JSeparator();
        semesterPanel8 = new javax.swing.JPanel();
        semesterLabel8 = new javax.swing.JLabel();
        lectureBox36 = new javax.swing.JCheckBox();
        lectureBox37 = new javax.swing.JCheckBox();
        lectureBox38 = new javax.swing.JCheckBox();
        lectureBox39 = new javax.swing.JCheckBox();
        lectureBox40 = new javax.swing.JCheckBox();
        seperator8 = new javax.swing.JSeparator();
        semesterPanel9 = new javax.swing.JPanel();
        semesterLabel9 = new javax.swing.JLabel();
        lectureBox41 = new javax.swing.JCheckBox();
        lectureBox42 = new javax.swing.JCheckBox();
        lectureBox43 = new javax.swing.JCheckBox();
        lectureBox44 = new javax.swing.JCheckBox();
        lectureBox45 = new javax.swing.JCheckBox();
        seperator9 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        studentData1 = new javax.swing.JLabel();

        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        logoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/athina/view/cropped-ihu-logo_el-16.png"))); // NOI18N

        studentLabel.setText("Student");

        studentData.setText("name surname");

        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("Available Lectures");
        titleLabel.setAutoscrolls(true);

        completeEntrollmentButton.setText("Complete Enrollment");
        completeEntrollmentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                completeEntrollmentButtonActionPerformed(evt);
            }
        });

        mainPanel.setPreferredSize(new java.awt.Dimension(333, 1827));

        semesterLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        semesterLabel1.setText("Semester 1");

        javax.swing.GroupLayout semesterPanel1Layout = new javax.swing.GroupLayout(semesterPanel1);
        semesterPanel1.setLayout(semesterPanel1Layout);
        semesterPanel1Layout.setHorizontalGroup(
            semesterPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 375, Short.MAX_VALUE)
            .addGroup(semesterPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(semesterPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(semesterPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(semesterPanel1Layout.createSequentialGroup()
                            .addGroup(semesterPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lectureBox5)
                                .addComponent(lectureBox4)
                                .addComponent(lectureBox3)
                                .addComponent(lectureBox1)
                                .addComponent(lectureBox2))
                            .addGap(12, 339, Short.MAX_VALUE))
                        .addComponent(seperator1, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(semesterLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap()))
        );
        semesterPanel1Layout.setVerticalGroup(
            semesterPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 203, Short.MAX_VALUE)
            .addGroup(semesterPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(semesterPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(semesterLabel1)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(lectureBox1)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(lectureBox2)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(lectureBox3)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(lectureBox4)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(lectureBox5)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(seperator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        semesterLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        semesterLabel2.setText("Semester 2");

        javax.swing.GroupLayout semesterPanel2Layout = new javax.swing.GroupLayout(semesterPanel2);
        semesterPanel2.setLayout(semesterPanel2Layout);
        semesterPanel2Layout.setHorizontalGroup(
            semesterPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 375, Short.MAX_VALUE)
            .addGroup(semesterPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(semesterPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(semesterPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(semesterPanel2Layout.createSequentialGroup()
                            .addGroup(semesterPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lectureBox10)
                                .addComponent(lectureBox9)
                                .addComponent(lectureBox8)
                                .addComponent(lectureBox6)
                                .addComponent(lectureBox7))
                            .addGap(12, 339, Short.MAX_VALUE))
                        .addComponent(seperator2, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(semesterLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap()))
        );
        semesterPanel2Layout.setVerticalGroup(
            semesterPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 203, Short.MAX_VALUE)
            .addGroup(semesterPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(semesterPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(semesterLabel2)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(lectureBox6)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(lectureBox7)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(lectureBox8)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(lectureBox9)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(lectureBox10)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(seperator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        semesterLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        semesterLabel3.setText("Semester 3");

        javax.swing.GroupLayout semesterPanel3Layout = new javax.swing.GroupLayout(semesterPanel3);
        semesterPanel3.setLayout(semesterPanel3Layout);
        semesterPanel3Layout.setHorizontalGroup(
            semesterPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 375, Short.MAX_VALUE)
            .addGroup(semesterPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(semesterPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(semesterPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(semesterPanel3Layout.createSequentialGroup()
                            .addGroup(semesterPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lectureBox15)
                                .addComponent(lectureBox14)
                                .addComponent(lectureBox13)
                                .addComponent(lectureBox11)
                                .addComponent(lectureBox12))
                            .addGap(12, 339, Short.MAX_VALUE))
                        .addComponent(seperator3, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(semesterLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap()))
        );
        semesterPanel3Layout.setVerticalGroup(
            semesterPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 203, Short.MAX_VALUE)
            .addGroup(semesterPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(semesterPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(semesterLabel3)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(lectureBox11)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(lectureBox12)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(lectureBox13)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(lectureBox14)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(lectureBox15)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(seperator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        semesterLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        semesterLabel4.setText("Semester 4");

        javax.swing.GroupLayout semesterPanel4Layout = new javax.swing.GroupLayout(semesterPanel4);
        semesterPanel4.setLayout(semesterPanel4Layout);
        semesterPanel4Layout.setHorizontalGroup(
            semesterPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 375, Short.MAX_VALUE)
            .addGroup(semesterPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(semesterPanel4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(semesterPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(semesterPanel4Layout.createSequentialGroup()
                            .addGroup(semesterPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lectureBox20)
                                .addComponent(lectureBox19)
                                .addComponent(lectureBox18)
                                .addComponent(lectureBox16)
                                .addComponent(lectureBox17))
                            .addGap(12, 339, Short.MAX_VALUE))
                        .addComponent(seperator4, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(semesterLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap()))
        );
        semesterPanel4Layout.setVerticalGroup(
            semesterPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 203, Short.MAX_VALUE)
            .addGroup(semesterPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(semesterPanel4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(semesterLabel4)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(lectureBox16)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(lectureBox17)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(lectureBox18)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(lectureBox19)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(lectureBox20)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(seperator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        semesterLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        semesterLabel5.setText("Semester 5");

        javax.swing.GroupLayout semesterPanel5Layout = new javax.swing.GroupLayout(semesterPanel5);
        semesterPanel5.setLayout(semesterPanel5Layout);
        semesterPanel5Layout.setHorizontalGroup(
            semesterPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 375, Short.MAX_VALUE)
            .addGroup(semesterPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(semesterPanel5Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(semesterPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(semesterPanel5Layout.createSequentialGroup()
                            .addGroup(semesterPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lectureBox25)
                                .addComponent(lectureBox24)
                                .addComponent(lectureBox23)
                                .addComponent(lectureBox21)
                                .addComponent(lectureBox22))
                            .addGap(12, 339, Short.MAX_VALUE))
                        .addComponent(seperator5, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(semesterLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap()))
        );
        semesterPanel5Layout.setVerticalGroup(
            semesterPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 203, Short.MAX_VALUE)
            .addGroup(semesterPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(semesterPanel5Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(semesterLabel5)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(lectureBox21)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(lectureBox22)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(lectureBox23)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(lectureBox24)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(lectureBox25)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(seperator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        semesterLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        semesterLabel6.setText("Semester 6");

        javax.swing.GroupLayout semesterPanel6Layout = new javax.swing.GroupLayout(semesterPanel6);
        semesterPanel6.setLayout(semesterPanel6Layout);
        semesterPanel6Layout.setHorizontalGroup(
            semesterPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 375, Short.MAX_VALUE)
            .addGroup(semesterPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(semesterPanel6Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(semesterPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(semesterPanel6Layout.createSequentialGroup()
                            .addGroup(semesterPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lectureBox30)
                                .addComponent(lectureBox29)
                                .addComponent(lectureBox28)
                                .addComponent(lectureBox26)
                                .addComponent(lectureBox27))
                            .addGap(12, 339, Short.MAX_VALUE))
                        .addComponent(seperator6, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(semesterLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap()))
        );
        semesterPanel6Layout.setVerticalGroup(
            semesterPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 203, Short.MAX_VALUE)
            .addGroup(semesterPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(semesterPanel6Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(semesterLabel6)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(lectureBox26)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(lectureBox27)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(lectureBox28)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(lectureBox29)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(lectureBox30)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(seperator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        semesterLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        semesterLabel7.setText("Semester 7");

        javax.swing.GroupLayout semesterPanel7Layout = new javax.swing.GroupLayout(semesterPanel7);
        semesterPanel7.setLayout(semesterPanel7Layout);
        semesterPanel7Layout.setHorizontalGroup(
            semesterPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 375, Short.MAX_VALUE)
            .addGroup(semesterPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(semesterPanel7Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(semesterPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(semesterPanel7Layout.createSequentialGroup()
                            .addGroup(semesterPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lectureBox35)
                                .addComponent(lectureBox34)
                                .addComponent(lectureBox33)
                                .addComponent(lectureBox31)
                                .addComponent(lectureBox32))
                            .addGap(12, 339, Short.MAX_VALUE))
                        .addComponent(seperator7, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(semesterLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap()))
        );
        semesterPanel7Layout.setVerticalGroup(
            semesterPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 203, Short.MAX_VALUE)
            .addGroup(semesterPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(semesterPanel7Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(semesterLabel7)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(lectureBox31)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(lectureBox32)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(lectureBox33)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(lectureBox34)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(lectureBox35)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(seperator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        semesterLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        semesterLabel8.setText("Semester 8");

        javax.swing.GroupLayout semesterPanel8Layout = new javax.swing.GroupLayout(semesterPanel8);
        semesterPanel8.setLayout(semesterPanel8Layout);
        semesterPanel8Layout.setHorizontalGroup(
            semesterPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 375, Short.MAX_VALUE)
            .addGroup(semesterPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(semesterPanel8Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(semesterPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(semesterPanel8Layout.createSequentialGroup()
                            .addGroup(semesterPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lectureBox40)
                                .addComponent(lectureBox39)
                                .addComponent(lectureBox38)
                                .addComponent(lectureBox36)
                                .addComponent(lectureBox37))
                            .addGap(12, 339, Short.MAX_VALUE))
                        .addComponent(seperator8, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(semesterLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap()))
        );
        semesterPanel8Layout.setVerticalGroup(
            semesterPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 203, Short.MAX_VALUE)
            .addGroup(semesterPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(semesterPanel8Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(semesterLabel8)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(lectureBox36)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(lectureBox37)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(lectureBox38)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(lectureBox39)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(lectureBox40)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(seperator8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        semesterLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        semesterLabel9.setText("Semester 9");

        javax.swing.GroupLayout semesterPanel9Layout = new javax.swing.GroupLayout(semesterPanel9);
        semesterPanel9.setLayout(semesterPanel9Layout);
        semesterPanel9Layout.setHorizontalGroup(
            semesterPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 375, Short.MAX_VALUE)
            .addGroup(semesterPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(semesterPanel9Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(semesterPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(semesterPanel9Layout.createSequentialGroup()
                            .addGroup(semesterPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lectureBox45)
                                .addComponent(lectureBox44)
                                .addComponent(lectureBox43)
                                .addComponent(lectureBox41)
                                .addComponent(lectureBox42))
                            .addGap(12, 339, Short.MAX_VALUE))
                        .addComponent(seperator9, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(semesterLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap()))
        );
        semesterPanel9Layout.setVerticalGroup(
            semesterPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 203, Short.MAX_VALUE)
            .addGroup(semesterPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(semesterPanel9Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(semesterLabel9)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(lectureBox41)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(lectureBox42)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(lectureBox43)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(lectureBox44)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(lectureBox45)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(seperator9, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(semesterPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(semesterPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(semesterPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(semesterPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(semesterPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(semesterPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(semesterPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(semesterPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(semesterPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addComponent(semesterPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(semesterPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(semesterPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(semesterPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(semesterPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(semesterPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(semesterPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(semesterPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(semesterPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        scrollPane.setViewportView(mainPanel);

        jLabel1.setText("ID");

        studentData1.setText("12345");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(logoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(studentData1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(26, 26, 26))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(studentLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(studentData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
            .addComponent(scrollPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 391, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(completeEntrollmentButton)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(logoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(studentData)
                            .addComponent(studentLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(studentData1))))
                .addGap(15, 15, 15)
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(completeEntrollmentButton)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
}
