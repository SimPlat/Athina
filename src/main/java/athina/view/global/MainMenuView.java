package athina.view.global;

import athina.controller.*;

public class MainMenuView extends javax.swing.JFrame {
	private static final long serialVersionUID = 6626742060523528285L;
	private UserController controller;

	public MainMenuView(UserController controller) {
		initComponents();
		this.controller = controller;
		showMainMenu(controller);
	}

	public void showMainMenu(UserController controller){
		StudentMenuPanel.setVisible(false);
		ProfessorMenuPanel.setVisible(false);
		SecretaryMenuPanel.setVisible(false);
		AdminMenuPanel.setVisible(false);

		if(controller instanceof StudentController){
			StudentMenuPanel.setVisible(true);
		}
		else if(controller instanceof SecretaryController){
			SecretaryMenuPanel.setVisible(true);
		}
	}

	private void UserInfoButtonActionPerformed(java.awt.event.ActionEvent evt) {
		controller.displayUserInfoView();
	}

	private void EnrollmentButtonActionPerformed(java.awt.event.ActionEvent evt) {
		((StudentController) controller).displayEnrollmentsView();
	}
	private void CourseScoreButtonActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO
	}
	private void ManageStudentsButtonActionPerformed(java.awt.event.ActionEvent evt) {
		((SecretaryController) controller).displayStudentsView();
	}

	// UI declaration - do not modify
	private javax.swing.JPanel AdminMenuPanel;
	private javax.swing.JButton CourseScoreButton;
	private javax.swing.JButton DisconnetionButton;
	private javax.swing.JButton EnrollmentButton;
	private javax.swing.JLabel Logo;
	private javax.swing.JPanel MainMenuPanel;
	private javax.swing.JButton ManageLecturesButton;
	private javax.swing.JButton ManagePersonelButton;
	private javax.swing.JButton ManageStudents;
	private javax.swing.JButton MyLecturesButton;
	private javax.swing.JPanel SecretaryMenuPanel;
	private javax.swing.JPanel StudentMenuPanel;
	private javax.swing.JPanel ProfessorMenuPanel;
	private javax.swing.JButton UserInfoButton;
	private javax.swing.JButton jButton8;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	
	private void initComponents() {

		MainMenuPanel = new javax.swing.JPanel();
		Logo = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		UserInfoButton = new javax.swing.JButton();
		DisconnetionButton = new javax.swing.JButton();
		StudentMenuPanel = new javax.swing.JPanel();
		EnrollmentButton = new javax.swing.JButton();
		jLabel3 = new javax.swing.JLabel();
		ProfessorMenuPanel = new javax.swing.JPanel();
		jLabel4 = new javax.swing.JLabel();
		CourseScoreButton = new javax.swing.JButton();
		MyLecturesButton = new javax.swing.JButton();
		AdminMenuPanel = new javax.swing.JPanel();
		jLabel5 = new javax.swing.JLabel();
		ManagePersonelButton = new javax.swing.JButton();
		ManageLecturesButton = new javax.swing.JButton();
		SecretaryMenuPanel = new javax.swing.JPanel();
		jLabel6 = new javax.swing.JLabel();
		ManageStudents = new javax.swing.JButton();
		jButton8 = new javax.swing.JButton();
		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/athina/view/cropped-ihu-logo_el-16.png"))); // NOI18N
		Logo.setText("jLabel1");
		jLabel2.setText("Υπυρεσίες τμήματος μηχανικών πληροφορικής");
		UserInfoButton.setText("Πληροφορίες Χρήστη");
		UserInfoButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				UserInfoButtonActionPerformed(evt);
			}
		});
		DisconnetionButton.setText("Αποσύνδεση");
		javax.swing.GroupLayout MainMenuPanelLayout = new javax.swing.GroupLayout(MainMenuPanel);
		MainMenuPanel.setLayout(MainMenuPanelLayout);
		MainMenuPanelLayout.setHorizontalGroup(
			MainMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			.addGroup(MainMenuPanelLayout.createSequentialGroup()
				.addGroup(MainMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
					.addGroup(MainMenuPanelLayout.createSequentialGroup()
						.addContainerGap()
						.addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGroup(MainMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
							.addGroup(MainMenuPanelLayout.createSequentialGroup()
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(jLabel2))
							.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainMenuPanelLayout.createSequentialGroup()
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(DisconnetionButton)
								.addGap(20, 20, 20))))
					.addGroup(MainMenuPanelLayout.createSequentialGroup()
						.addGap(64, 64, 64)
						.addComponent(UserInfoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)))
				.addContainerGap(22, Short.MAX_VALUE))
		);
		MainMenuPanelLayout.setVerticalGroup(
			MainMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			.addGroup(MainMenuPanelLayout.createSequentialGroup()
				.addContainerGap()
				.addGroup(MainMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
					.addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
					.addGroup(MainMenuPanelLayout.createSequentialGroup()
						.addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addComponent(DisconnetionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
				.addComponent(UserInfoButton)
				.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		EnrollmentButton.setText("Δηλώσεις");
		EnrollmentButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				EnrollmentButtonActionPerformed(evt);
			}
		});
		jLabel3.setText("Λειτουργίες φοιτητών");
		javax.swing.GroupLayout StudentMenuPanelLayout = new javax.swing.GroupLayout(StudentMenuPanel);
		StudentMenuPanel.setLayout(StudentMenuPanelLayout);
		StudentMenuPanelLayout.setHorizontalGroup(
			StudentMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			.addGroup(StudentMenuPanelLayout.createSequentialGroup()
				.addGroup(StudentMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
					.addGroup(StudentMenuPanelLayout.createSequentialGroup()
						.addGap(125, 125, 125)
						.addComponent(jLabel3))
					.addGroup(StudentMenuPanelLayout.createSequentialGroup()
						.addGap(63, 63, 63)
						.addComponent(EnrollmentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)))
				.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		StudentMenuPanelLayout.setVerticalGroup(
			StudentMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			.addGroup(StudentMenuPanelLayout.createSequentialGroup()
				.addContainerGap()
				.addComponent(jLabel3)
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
				.addComponent(EnrollmentButton)
				.addContainerGap(14, Short.MAX_VALUE))
		);
		jLabel4.setText("Λειτουργίες καθηγητών");
		CourseScoreButton.setText("Βαθμολογίες");
		CourseScoreButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				CourseScoreButtonActionPerformed(evt);
			}
		});
		MyLecturesButton.setText("Μαθήματα που διδάσκω");
		javax.swing.GroupLayout ProfessorMenuPanelLayout = new javax.swing.GroupLayout(ProfessorMenuPanel);
		ProfessorMenuPanel.setLayout(ProfessorMenuPanelLayout);
		ProfessorMenuPanelLayout.setHorizontalGroup(
			ProfessorMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			.addGroup(ProfessorMenuPanelLayout.createSequentialGroup()
				.addGroup(ProfessorMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
					.addGroup(ProfessorMenuPanelLayout.createSequentialGroup()
						.addGap(122, 122, 122)
						.addComponent(jLabel4))
					.addGroup(ProfessorMenuPanelLayout.createSequentialGroup()
						.addGap(55, 55, 55)
						.addGroup(ProfessorMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
							.addComponent(MyLecturesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
							.addComponent(CourseScoreButton, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))))
				.addContainerGap(45, Short.MAX_VALUE))
		);
		ProfessorMenuPanelLayout.setVerticalGroup(
			ProfessorMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			.addGroup(ProfessorMenuPanelLayout.createSequentialGroup()
				.addContainerGap()
				.addComponent(jLabel4)
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
				.addComponent(CourseScoreButton)
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
				.addComponent(MyLecturesButton)
				.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		jLabel5.setText("Λειτουργίες διαχειρηστών");
		ManagePersonelButton.setText("Εισαγωγή προσωπικού");
		ManageLecturesButton.setText("Διαχείρηση μαθημάτων");
		javax.swing.GroupLayout AdminMenuPanelLayout = new javax.swing.GroupLayout(AdminMenuPanel);
		AdminMenuPanel.setLayout(AdminMenuPanelLayout);
		AdminMenuPanelLayout.setHorizontalGroup(
			AdminMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			.addGroup(AdminMenuPanelLayout.createSequentialGroup()
				.addGroup(AdminMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
					.addGroup(AdminMenuPanelLayout.createSequentialGroup()
						.addGap(59, 59, 59)
						.addGroup(AdminMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
							.addComponent(ManagePersonelButton, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
							.addComponent(ManageLecturesButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
					.addGroup(AdminMenuPanelLayout.createSequentialGroup()
						.addGap(118, 118, 118)
						.addComponent(jLabel5)))
				.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		AdminMenuPanelLayout.setVerticalGroup(
			AdminMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			.addGroup(AdminMenuPanelLayout.createSequentialGroup()
				.addContainerGap()
				.addComponent(jLabel5)
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
				.addComponent(ManagePersonelButton)
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
				.addComponent(ManageLecturesButton)
				.addContainerGap(12, Short.MAX_VALUE))
		);
		jLabel6.setText("Λειτουργίες Γραμματέων");
		ManageStudents.setText("Διαχείρηση φοιτητών");
		ManageStudents.setToolTipText("");
		ManageStudents.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				ManageStudentsButtonActionPerformed(evt);
			}
		});
		jButton8.setText("Βεβαιώσεις");
		javax.swing.GroupLayout SecretaryMenuPanelLayout = new javax.swing.GroupLayout(SecretaryMenuPanel);
		SecretaryMenuPanel.setLayout(SecretaryMenuPanelLayout);
		SecretaryMenuPanelLayout.setHorizontalGroup(
			SecretaryMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			.addGroup(SecretaryMenuPanelLayout.createSequentialGroup()
				.addGroup(SecretaryMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
					.addGroup(SecretaryMenuPanelLayout.createSequentialGroup()
						.addGap(108, 108, 108)
						.addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
					.addGroup(SecretaryMenuPanelLayout.createSequentialGroup()
						.addGap(56, 56, 56)
						.addGroup(SecretaryMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
							.addComponent(ManageStudents, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
							.addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
				.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		SecretaryMenuPanelLayout.setVerticalGroup(
			SecretaryMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			.addGroup(SecretaryMenuPanelLayout.createSequentialGroup()
				.addContainerGap()
				.addComponent(jLabel6)
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
				.addComponent(ManageStudents)
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
				.addComponent(jButton8)
				.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(
			layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			.addGroup(layout.createSequentialGroup()
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
					.addComponent(StudentMenuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(MainMenuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addGap(0, 19, Short.MAX_VALUE))
			.addGroup(layout.createSequentialGroup()
				.addContainerGap()
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
					.addComponent(SecretaryMenuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(ProfessorMenuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(AdminMenuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		layout.setVerticalGroup(
			layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			.addGroup(layout.createSequentialGroup()
				.addComponent(MainMenuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
				.addComponent(StudentMenuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
				.addComponent(ProfessorMenuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
				.addComponent(SecretaryMenuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
				.addComponent(AdminMenuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
				.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		pack();
	}
	// End of UI declaration
}
