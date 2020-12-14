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
    private javax.swing.JLabel lectureLabel1;
    private javax.swing.JLabel lectureLabel10;
    private javax.swing.JLabel lectureLabel11;
    private javax.swing.JLabel lectureLabel12;
    private javax.swing.JLabel lectureLabel13;
    private javax.swing.JLabel lectureLabel14;
    private javax.swing.JLabel lectureLabel15;
    private javax.swing.JLabel lectureLabel16;
    private javax.swing.JLabel lectureLabel17;
    private javax.swing.JLabel lectureLabel18;
    private javax.swing.JLabel lectureLabel19;
    private javax.swing.JLabel lectureLabel2;
    private javax.swing.JLabel lectureLabel20;
    private javax.swing.JLabel lectureLabel21;
    private javax.swing.JLabel lectureLabel22;
    private javax.swing.JLabel lectureLabel23;
    private javax.swing.JLabel lectureLabel24;
    private javax.swing.JLabel lectureLabel25;
    private javax.swing.JLabel lectureLabel26;
    private javax.swing.JLabel lectureLabel27;
    private javax.swing.JLabel lectureLabel28;
    private javax.swing.JLabel lectureLabel29;
    private javax.swing.JLabel lectureLabel3;
    private javax.swing.JLabel lectureLabel30;
    private javax.swing.JLabel lectureLabel31;
    private javax.swing.JLabel lectureLabel32;
    private javax.swing.JLabel lectureLabel33;
    private javax.swing.JLabel lectureLabel34;
    private javax.swing.JLabel lectureLabel35;
    private javax.swing.JLabel lectureLabel36;
    private javax.swing.JLabel lectureLabel37;
    private javax.swing.JLabel lectureLabel38;
    private javax.swing.JLabel lectureLabel39;
    private javax.swing.JLabel lectureLabel4;
    private javax.swing.JLabel lectureLabel40;
    private javax.swing.JLabel lectureLabel41;
    private javax.swing.JLabel lectureLabel42;
    private javax.swing.JLabel lectureLabel43;
    private javax.swing.JLabel lectureLabel44;
    private javax.swing.JLabel lectureLabel45;
    private javax.swing.JLabel lectureLabel5;
    private javax.swing.JLabel lectureLabel6;
    private javax.swing.JLabel lectureLabel7;
    private javax.swing.JLabel lectureLabel8;
    private javax.swing.JLabel lectureLabel9;
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
        lectureLabel1 = new javax.swing.JLabel();
        lectureBox2 = new javax.swing.JCheckBox();
        lectureLabel2 = new javax.swing.JLabel();
        lectureBox3 = new javax.swing.JCheckBox();
        lectureLabel3 = new javax.swing.JLabel();
        lectureBox4 = new javax.swing.JCheckBox();
        lectureLabel4 = new javax.swing.JLabel();
        lectureBox5 = new javax.swing.JCheckBox();
        lectureLabel5 = new javax.swing.JLabel();
        seperator1 = new javax.swing.JSeparator();
        semesterPanel2 = new javax.swing.JPanel();
        semesterLabel2 = new javax.swing.JLabel();
        lectureBox6 = new javax.swing.JCheckBox();
        lectureLabel6 = new javax.swing.JLabel();
        lectureBox7 = new javax.swing.JCheckBox();
        lectureLabel7 = new javax.swing.JLabel();
        lectureBox8 = new javax.swing.JCheckBox();
        lectureLabel8 = new javax.swing.JLabel();
        lectureBox9 = new javax.swing.JCheckBox();
        lectureLabel9 = new javax.swing.JLabel();
        lectureBox10 = new javax.swing.JCheckBox();
        lectureLabel10 = new javax.swing.JLabel();
        seperator2 = new javax.swing.JSeparator();
        semesterPanel3 = new javax.swing.JPanel();
        semesterLabel3 = new javax.swing.JLabel();
        lectureBox11 = new javax.swing.JCheckBox();
        lectureLabel11 = new javax.swing.JLabel();
        lectureBox12 = new javax.swing.JCheckBox();
        lectureLabel12 = new javax.swing.JLabel();
        lectureBox13 = new javax.swing.JCheckBox();
        lectureLabel13 = new javax.swing.JLabel();
        lectureBox14 = new javax.swing.JCheckBox();
        lectureLabel14 = new javax.swing.JLabel();
        lectureBox15 = new javax.swing.JCheckBox();
        lectureLabel15 = new javax.swing.JLabel();
        seperator3 = new javax.swing.JSeparator();
        semesterPanel4 = new javax.swing.JPanel();
        semesterLabel4 = new javax.swing.JLabel();
        lectureBox16 = new javax.swing.JCheckBox();
        lectureLabel16 = new javax.swing.JLabel();
        lectureBox17 = new javax.swing.JCheckBox();
        lectureLabel17 = new javax.swing.JLabel();
        lectureBox18 = new javax.swing.JCheckBox();
        lectureLabel18 = new javax.swing.JLabel();
        lectureBox19 = new javax.swing.JCheckBox();
        lectureLabel19 = new javax.swing.JLabel();
        lectureBox20 = new javax.swing.JCheckBox();
        lectureLabel20 = new javax.swing.JLabel();
        seperator4 = new javax.swing.JSeparator();
        semesterPanel5 = new javax.swing.JPanel();
        semesterLabel5 = new javax.swing.JLabel();
        lectureBox21 = new javax.swing.JCheckBox();
        lectureLabel21 = new javax.swing.JLabel();
        lectureBox22 = new javax.swing.JCheckBox();
        lectureLabel22 = new javax.swing.JLabel();
        lectureBox23 = new javax.swing.JCheckBox();
        lectureLabel23 = new javax.swing.JLabel();
        lectureBox24 = new javax.swing.JCheckBox();
        lectureLabel24 = new javax.swing.JLabel();
        lectureBox25 = new javax.swing.JCheckBox();
        lectureLabel25 = new javax.swing.JLabel();
        seperator5 = new javax.swing.JSeparator();
        semesterPanel6 = new javax.swing.JPanel();
        semesterLabel6 = new javax.swing.JLabel();
        lectureBox26 = new javax.swing.JCheckBox();
        lectureLabel26 = new javax.swing.JLabel();
        lectureBox27 = new javax.swing.JCheckBox();
        lectureLabel27 = new javax.swing.JLabel();
        lectureBox28 = new javax.swing.JCheckBox();
        lectureLabel28 = new javax.swing.JLabel();
        lectureBox29 = new javax.swing.JCheckBox();
        lectureLabel29 = new javax.swing.JLabel();
        lectureBox30 = new javax.swing.JCheckBox();
        lectureLabel30 = new javax.swing.JLabel();
        seperator6 = new javax.swing.JSeparator();
        semesterPanel7 = new javax.swing.JPanel();
        semesterLabel7 = new javax.swing.JLabel();
        lectureBox31 = new javax.swing.JCheckBox();
        lectureLabel31 = new javax.swing.JLabel();
        lectureBox32 = new javax.swing.JCheckBox();
        lectureLabel32 = new javax.swing.JLabel();
        lectureBox33 = new javax.swing.JCheckBox();
        lectureLabel33 = new javax.swing.JLabel();
        lectureBox34 = new javax.swing.JCheckBox();
        lectureLabel34 = new javax.swing.JLabel();
        lectureBox35 = new javax.swing.JCheckBox();
        lectureLabel35 = new javax.swing.JLabel();
        seperator7 = new javax.swing.JSeparator();
        semesterPanel8 = new javax.swing.JPanel();
        semesterLabel8 = new javax.swing.JLabel();
        lectureBox36 = new javax.swing.JCheckBox();
        lectureLabel36 = new javax.swing.JLabel();
        lectureBox37 = new javax.swing.JCheckBox();
        lectureLabel37 = new javax.swing.JLabel();
        lectureBox38 = new javax.swing.JCheckBox();
        lectureLabel38 = new javax.swing.JLabel();
        lectureBox39 = new javax.swing.JCheckBox();
        lectureLabel39 = new javax.swing.JLabel();
        lectureBox40 = new javax.swing.JCheckBox();
        lectureLabel40 = new javax.swing.JLabel();
        seperator8 = new javax.swing.JSeparator();
        semesterPanel9 = new javax.swing.JPanel();
        semesterLabel9 = new javax.swing.JLabel();
        lectureBox41 = new javax.swing.JCheckBox();
        lectureLabel41 = new javax.swing.JLabel();
        lectureBox42 = new javax.swing.JCheckBox();
        lectureLabel42 = new javax.swing.JLabel();
        lectureBox43 = new javax.swing.JCheckBox();
        lectureLabel43 = new javax.swing.JLabel();
        lectureBox44 = new javax.swing.JCheckBox();
        lectureLabel44 = new javax.swing.JLabel();
        lectureBox45 = new javax.swing.JCheckBox();
        lectureLabel45 = new javax.swing.JLabel();
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

        lectureLabel1.setText("lecture 1");

        lectureLabel2.setText("lecture 2");

        lectureLabel3.setText("lecture 3");

        lectureLabel4.setText("lecture 4");

        lectureLabel5.setText("lecture 5");

        javax.swing.GroupLayout semesterPanel1Layout = new javax.swing.GroupLayout(semesterPanel1);
        semesterPanel1.setLayout(semesterPanel1Layout);
        semesterPanel1Layout.setHorizontalGroup(
            semesterPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 333, Short.MAX_VALUE)
            .addGroup(semesterPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(semesterPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(semesterPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(semesterPanel1Layout.createSequentialGroup()
                            .addGroup(semesterPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(semesterPanel1Layout.createSequentialGroup()
                                    .addComponent(lectureBox1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lectureLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE))
                                .addGroup(semesterPanel1Layout.createSequentialGroup()
                                    .addComponent(lectureBox5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lectureLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(semesterPanel1Layout.createSequentialGroup()
                                    .addComponent(lectureBox2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lectureLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(semesterPanel1Layout.createSequentialGroup()
                                    .addComponent(lectureBox3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lectureLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(semesterPanel1Layout.createSequentialGroup()
                                    .addComponent(lectureBox4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lectureLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGap(12, 12, 12))
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
                    .addGroup(semesterPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lectureBox1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lectureLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(semesterPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lectureBox2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lectureLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(semesterPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lectureBox3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lectureLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(semesterPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lectureBox4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lectureLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(semesterPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lectureBox5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lectureLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(seperator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        semesterLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        semesterLabel2.setText("Semester 2");

        lectureLabel6.setText("lecture 1");

        lectureLabel7.setText("lecture 2");

        lectureLabel8.setText("lecture 3");

        lectureLabel9.setText("lecture 4");

        lectureLabel10.setText("lecture 5");

        javax.swing.GroupLayout semesterPanel2Layout = new javax.swing.GroupLayout(semesterPanel2);
        semesterPanel2.setLayout(semesterPanel2Layout);
        semesterPanel2Layout.setHorizontalGroup(
            semesterPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 333, Short.MAX_VALUE)
            .addGroup(semesterPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(semesterPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(semesterPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(semesterPanel2Layout.createSequentialGroup()
                            .addGroup(semesterPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(semesterPanel2Layout.createSequentialGroup()
                                    .addComponent(lectureBox6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lectureLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE))
                                .addGroup(semesterPanel2Layout.createSequentialGroup()
                                    .addComponent(lectureBox10)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lectureLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(semesterPanel2Layout.createSequentialGroup()
                                    .addComponent(lectureBox7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lectureLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(semesterPanel2Layout.createSequentialGroup()
                                    .addComponent(lectureBox8)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lectureLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(semesterPanel2Layout.createSequentialGroup()
                                    .addComponent(lectureBox9)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lectureLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGap(12, 12, 12))
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
                    .addGroup(semesterPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lectureBox6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lectureLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(semesterPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lectureBox7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lectureLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(semesterPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lectureBox8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lectureLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(semesterPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lectureBox9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lectureLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(semesterPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lectureBox10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lectureLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(seperator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        semesterLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        semesterLabel3.setText("Semester 3");

        lectureLabel11.setText("lecture 1");

        lectureLabel12.setText("lecture 2");

        lectureLabel13.setText("lecture 3");

        lectureLabel14.setText("lecture 4");

        lectureLabel15.setText("lecture 5");

        javax.swing.GroupLayout semesterPanel3Layout = new javax.swing.GroupLayout(semesterPanel3);
        semesterPanel3.setLayout(semesterPanel3Layout);
        semesterPanel3Layout.setHorizontalGroup(
            semesterPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 333, Short.MAX_VALUE)
            .addGroup(semesterPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(semesterPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(semesterPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(semesterPanel3Layout.createSequentialGroup()
                            .addGroup(semesterPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(semesterPanel3Layout.createSequentialGroup()
                                    .addComponent(lectureBox11)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lectureLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE))
                                .addGroup(semesterPanel3Layout.createSequentialGroup()
                                    .addComponent(lectureBox15)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lectureLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(semesterPanel3Layout.createSequentialGroup()
                                    .addComponent(lectureBox12)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lectureLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(semesterPanel3Layout.createSequentialGroup()
                                    .addComponent(lectureBox13)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lectureLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(semesterPanel3Layout.createSequentialGroup()
                                    .addComponent(lectureBox14)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lectureLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGap(12, 12, 12))
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
                    .addGroup(semesterPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lectureBox11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lectureLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(semesterPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lectureBox12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lectureLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(semesterPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lectureBox13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lectureLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(semesterPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lectureBox14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lectureLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(semesterPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lectureBox15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lectureLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(seperator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        semesterLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        semesterLabel4.setText("Semester 4");

        lectureLabel16.setText("lecture 1");

        lectureLabel17.setText("lecture 2");

        lectureLabel18.setText("lecture 3");

        lectureLabel19.setText("lecture 4");

        lectureLabel20.setText("lecture 5");

        javax.swing.GroupLayout semesterPanel4Layout = new javax.swing.GroupLayout(semesterPanel4);
        semesterPanel4.setLayout(semesterPanel4Layout);
        semesterPanel4Layout.setHorizontalGroup(
            semesterPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 333, Short.MAX_VALUE)
            .addGroup(semesterPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(semesterPanel4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(semesterPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(semesterPanel4Layout.createSequentialGroup()
                            .addGroup(semesterPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(semesterPanel4Layout.createSequentialGroup()
                                    .addComponent(lectureBox16)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lectureLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE))
                                .addGroup(semesterPanel4Layout.createSequentialGroup()
                                    .addComponent(lectureBox20)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lectureLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(semesterPanel4Layout.createSequentialGroup()
                                    .addComponent(lectureBox17)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lectureLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(semesterPanel4Layout.createSequentialGroup()
                                    .addComponent(lectureBox18)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lectureLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(semesterPanel4Layout.createSequentialGroup()
                                    .addComponent(lectureBox19)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lectureLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGap(12, 12, 12))
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
                    .addGroup(semesterPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lectureBox16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lectureLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(semesterPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lectureBox17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lectureLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(semesterPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lectureBox18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lectureLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(semesterPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lectureBox19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lectureLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(semesterPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lectureBox20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lectureLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(seperator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        semesterLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        semesterLabel5.setText("Semester 5");

        lectureLabel21.setText("lecture 1");

        lectureLabel22.setText("lecture 2");

        lectureLabel23.setText("lecture 3");

        lectureLabel24.setText("lecture 4");

        lectureLabel25.setText("lecture 5");

        javax.swing.GroupLayout semesterPanel5Layout = new javax.swing.GroupLayout(semesterPanel5);
        semesterPanel5.setLayout(semesterPanel5Layout);
        semesterPanel5Layout.setHorizontalGroup(
            semesterPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 333, Short.MAX_VALUE)
            .addGroup(semesterPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(semesterPanel5Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(semesterPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(semesterPanel5Layout.createSequentialGroup()
                            .addGroup(semesterPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(semesterPanel5Layout.createSequentialGroup()
                                    .addComponent(lectureBox21)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lectureLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE))
                                .addGroup(semesterPanel5Layout.createSequentialGroup()
                                    .addComponent(lectureBox25)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lectureLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(semesterPanel5Layout.createSequentialGroup()
                                    .addComponent(lectureBox22)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lectureLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(semesterPanel5Layout.createSequentialGroup()
                                    .addComponent(lectureBox23)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lectureLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(semesterPanel5Layout.createSequentialGroup()
                                    .addComponent(lectureBox24)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lectureLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGap(12, 12, 12))
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
                    .addGroup(semesterPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lectureBox21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lectureLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(semesterPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lectureBox22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lectureLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(semesterPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lectureBox23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lectureLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(semesterPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lectureBox24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lectureLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(semesterPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lectureBox25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lectureLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(seperator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        semesterLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        semesterLabel6.setText("Semester 6");

        lectureLabel26.setText("lecture 1");

        lectureLabel27.setText("lecture 2");

        lectureLabel28.setText("lecture 3");

        lectureLabel29.setText("lecture 4");

        lectureLabel30.setText("lecture 5");

        javax.swing.GroupLayout semesterPanel6Layout = new javax.swing.GroupLayout(semesterPanel6);
        semesterPanel6.setLayout(semesterPanel6Layout);
        semesterPanel6Layout.setHorizontalGroup(
            semesterPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 333, Short.MAX_VALUE)
            .addGroup(semesterPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(semesterPanel6Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(semesterPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(semesterPanel6Layout.createSequentialGroup()
                            .addGroup(semesterPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(semesterPanel6Layout.createSequentialGroup()
                                    .addComponent(lectureBox26)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lectureLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE))
                                .addGroup(semesterPanel6Layout.createSequentialGroup()
                                    .addComponent(lectureBox30)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lectureLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(semesterPanel6Layout.createSequentialGroup()
                                    .addComponent(lectureBox27)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lectureLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(semesterPanel6Layout.createSequentialGroup()
                                    .addComponent(lectureBox28)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lectureLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(semesterPanel6Layout.createSequentialGroup()
                                    .addComponent(lectureBox29)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lectureLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGap(12, 12, 12))
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
                    .addGroup(semesterPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lectureBox26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lectureLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(semesterPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lectureBox27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lectureLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(semesterPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lectureBox28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lectureLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(semesterPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lectureBox29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lectureLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(semesterPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lectureBox30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lectureLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(seperator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        semesterLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        semesterLabel7.setText("Semester 7");

        lectureLabel31.setText("lecture 1");

        lectureLabel32.setText("lecture 2");

        lectureLabel33.setText("lecture 3");

        lectureLabel34.setText("lecture 4");

        lectureLabel35.setText("lecture 5");

        javax.swing.GroupLayout semesterPanel7Layout = new javax.swing.GroupLayout(semesterPanel7);
        semesterPanel7.setLayout(semesterPanel7Layout);
        semesterPanel7Layout.setHorizontalGroup(
            semesterPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 333, Short.MAX_VALUE)
            .addGroup(semesterPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(semesterPanel7Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(semesterPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(semesterPanel7Layout.createSequentialGroup()
                            .addGroup(semesterPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(semesterPanel7Layout.createSequentialGroup()
                                    .addComponent(lectureBox31)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lectureLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE))
                                .addGroup(semesterPanel7Layout.createSequentialGroup()
                                    .addComponent(lectureBox35)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lectureLabel35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(semesterPanel7Layout.createSequentialGroup()
                                    .addComponent(lectureBox32)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lectureLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(semesterPanel7Layout.createSequentialGroup()
                                    .addComponent(lectureBox33)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lectureLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(semesterPanel7Layout.createSequentialGroup()
                                    .addComponent(lectureBox34)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lectureLabel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGap(12, 12, 12))
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
                    .addGroup(semesterPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lectureBox31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lectureLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(semesterPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lectureBox32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lectureLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(semesterPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lectureBox33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lectureLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(semesterPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lectureBox34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lectureLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(semesterPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lectureBox35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lectureLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(seperator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        semesterLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        semesterLabel8.setText("Semester 8");

        lectureLabel36.setText("lecture 1");

        lectureLabel37.setText("lecture 2");

        lectureLabel38.setText("lecture 3");

        lectureLabel39.setText("lecture 4");

        lectureLabel40.setText("lecture 5");

        javax.swing.GroupLayout semesterPanel8Layout = new javax.swing.GroupLayout(semesterPanel8);
        semesterPanel8.setLayout(semesterPanel8Layout);
        semesterPanel8Layout.setHorizontalGroup(
            semesterPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 333, Short.MAX_VALUE)
            .addGroup(semesterPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(semesterPanel8Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(semesterPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(semesterPanel8Layout.createSequentialGroup()
                            .addGroup(semesterPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(semesterPanel8Layout.createSequentialGroup()
                                    .addComponent(lectureBox36)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lectureLabel36, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE))
                                .addGroup(semesterPanel8Layout.createSequentialGroup()
                                    .addComponent(lectureBox40)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lectureLabel40, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(semesterPanel8Layout.createSequentialGroup()
                                    .addComponent(lectureBox37)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lectureLabel37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(semesterPanel8Layout.createSequentialGroup()
                                    .addComponent(lectureBox38)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lectureLabel38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(semesterPanel8Layout.createSequentialGroup()
                                    .addComponent(lectureBox39)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lectureLabel39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGap(12, 12, 12))
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
                    .addGroup(semesterPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lectureBox36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lectureLabel36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(semesterPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lectureBox37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lectureLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(semesterPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lectureBox38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lectureLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(semesterPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lectureBox39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lectureLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(semesterPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lectureBox40, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lectureLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(seperator8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        semesterLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        semesterLabel9.setText("Semester 9");

        lectureLabel41.setText("lecture 1");

        lectureLabel42.setText("lecture 2");

        lectureLabel43.setText("lecture 3");

        lectureLabel44.setText("lecture 4");

        lectureLabel45.setText("lecture 5");

        javax.swing.GroupLayout semesterPanel9Layout = new javax.swing.GroupLayout(semesterPanel9);
        semesterPanel9.setLayout(semesterPanel9Layout);
        semesterPanel9Layout.setHorizontalGroup(
            semesterPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(semesterPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(semesterPanel9Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(semesterPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(semesterPanel9Layout.createSequentialGroup()
                            .addGroup(semesterPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(semesterPanel9Layout.createSequentialGroup()
                                    .addComponent(lectureBox41)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lectureLabel41, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE))
                                .addGroup(semesterPanel9Layout.createSequentialGroup()
                                    .addComponent(lectureBox45)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lectureLabel45, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(semesterPanel9Layout.createSequentialGroup()
                                    .addComponent(lectureBox42)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lectureLabel42, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(semesterPanel9Layout.createSequentialGroup()
                                    .addComponent(lectureBox43)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lectureLabel43, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(semesterPanel9Layout.createSequentialGroup()
                                    .addComponent(lectureBox44)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lectureLabel44, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGap(12, 12, 12))
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
                    .addGroup(semesterPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lectureBox41, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lectureLabel41, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(semesterPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lectureBox42, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lectureLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(semesterPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lectureBox43, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lectureLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(semesterPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lectureBox44, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lectureLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(semesterPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lectureBox45, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lectureLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
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
