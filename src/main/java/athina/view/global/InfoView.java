package athina.view.global;

public class InfoView extends javax.swing.JFrame {
	private static final long serialVersionUID = -7488325200857978581L;

	public InfoView() {
		initComponents();
	}

	public void setId(int id){
		UserIDData.setText(String.valueOf(id));
	}

	public void setFirstName(String name){
		NameData.setText(name);
	}

	public void setLastName(String lastName){
		//TODO
	}

	public void setEmail(String email){
		EmailData.setText(email);
	}

	public void setPhoneNumber(String phoneNumber){
		PhoneNumberData.setText(phoneNumber);
	}

	public void setAdress(String adress){
		AdressData.setText(adress);
	}

	public void setEcts(int ects){
		// TODO
	}

	// UI declaration - do not modify
	private javax.swing.JLabel AdressData;
	private javax.swing.JLabel AdressLabel;
	private javax.swing.JLabel CemesterOfEnrollment;
	private javax.swing.JLabel CemesterOfEnrolment;
	private javax.swing.JLabel CityData;
	private javax.swing.JLabel CityLabel;
	private javax.swing.JLabel CountryData;
	private javax.swing.JLabel CountryLabel;
	private javax.swing.JLabel EmailData;
	private javax.swing.JLabel EmailLabel;
	private javax.swing.JLabel LogoLabel;
	private javax.swing.JLabel NameData;
	private javax.swing.JLabel NameLabel;
	private javax.swing.JLabel PhoneNumberData;
	private javax.swing.JLabel PhoneNumberLabel;
	private javax.swing.JLabel PostalCodeData;
	private javax.swing.JLabel PostalCodeLabel;
	private javax.swing.JLabel StudentRegistrationInfoLabel;
	private javax.swing.JLabel TypicalCemesterData;
	private javax.swing.JLabel TypicalCemesterLabel;
	private javax.swing.JLabel UserAdressInfoLabel;
	private javax.swing.JLabel UserIDData;
	private javax.swing.JLabel UserIDLabel;
	private javax.swing.JLabel UserInfoLabel;
	private javax.swing.JLabel UsernameData;
	private javax.swing.JLabel UsernameLabel;
	private javax.swing.JLabel YearOfRegistration;
	private javax.swing.JLabel YearOfRegistrationData;
	private javax.swing.JLabel jLabel23;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JPanel jPanel3;

	private void initComponents() {

		LogoLabel = new javax.swing.JLabel();
		UserInfoLabel = new javax.swing.JLabel();
		jPanel1 = new javax.swing.JPanel();
		StudentRegistrationInfoLabel = new javax.swing.JLabel();
		TypicalCemesterLabel = new javax.swing.JLabel();
		YearOfRegistration = new javax.swing.JLabel();
		CemesterOfEnrolment = new javax.swing.JLabel();
		TypicalCemesterData = new javax.swing.JLabel();
		YearOfRegistrationData = new javax.swing.JLabel();
		CemesterOfEnrollment = new javax.swing.JLabel();
		jPanel2 = new javax.swing.JPanel();
		jLabel23 = new javax.swing.JLabel();
		jPanel3 = new javax.swing.JPanel();
		UsernameData = new javax.swing.JLabel();
		NameData = new javax.swing.JLabel();
		UserIDData = new javax.swing.JLabel();
		PhoneNumberData = new javax.swing.JLabel();
		EmailData = new javax.swing.JLabel();
		UserAdressInfoLabel = new javax.swing.JLabel();
		CityLabel = new javax.swing.JLabel();
		AdressLabel = new javax.swing.JLabel();
		PostalCodeLabel = new javax.swing.JLabel();
		CountryLabel = new javax.swing.JLabel();
		UsernameLabel = new javax.swing.JLabel();
		CityData = new javax.swing.JLabel();
		AdressData = new javax.swing.JLabel();
		NameLabel = new javax.swing.JLabel();
		PostalCodeData = new javax.swing.JLabel();
		UserIDLabel = new javax.swing.JLabel();
		CountryData = new javax.swing.JLabel();
		PhoneNumberLabel = new javax.swing.JLabel();
		EmailLabel = new javax.swing.JLabel();
		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		LogoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/athina/view/cropped-ihu-logo_el-16.png"))); // NOI18N
		LogoLabel.setText("jLabel7");
		UserInfoLabel.setText("Πληροφορίες Χρήστη (Type)");
		StudentRegistrationInfoLabel.setText("Student Registration Info:");
		TypicalCemesterLabel.setText("Τυπικό Εξάμηνο:");
		YearOfRegistration.setText("Ακαδημαικό ετος εγγραφης:");
		CemesterOfEnrolment.setText("Περίοδος");
		TypicalCemesterData.setText("jLabel20");
		YearOfRegistrationData.setText("jLabel21");
		CemesterOfEnrollment.setText("jLabel22");
		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(
			jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			.addGroup(jPanel1Layout.createSequentialGroup()
				.addContainerGap()
				.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
					.addComponent(StudentRegistrationInfoLabel)
					.addGroup(jPanel1Layout.createSequentialGroup()
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
							.addComponent(YearOfRegistration)
							.addComponent(CemesterOfEnrolment)
							.addComponent(TypicalCemesterLabel))
						.addGap(24, 24, 24)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
							.addComponent(TypicalCemesterData, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
							.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(YearOfRegistrationData, javax.swing.GroupLayout.Alignment.TRAILING)
								.addComponent(CemesterOfEnrollment, javax.swing.GroupLayout.Alignment.TRAILING)))))
				.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		jPanel1Layout.setVerticalGroup(
			jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			.addGroup(jPanel1Layout.createSequentialGroup()
				.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addComponent(StudentRegistrationInfoLabel)
				.addGap(18, 18, 18)
				.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
					.addComponent(TypicalCemesterLabel)
					.addComponent(TypicalCemesterData))
				.addGap(18, 18, 18)
				.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
					.addComponent(YearOfRegistration)
					.addComponent(YearOfRegistrationData))
				.addGap(18, 18, 18)
				.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
					.addComponent(CemesterOfEnrollment)
					.addComponent(CemesterOfEnrolment)))
		);
		jLabel23.setText("Employee Registration info:");
		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout.setHorizontalGroup(
			jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			.addGroup(jPanel2Layout.createSequentialGroup()
				.addContainerGap()
				.addComponent(jLabel23)
				.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		jPanel2Layout.setVerticalGroup(
			jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			.addGroup(jPanel2Layout.createSequentialGroup()
				.addContainerGap()
				.addComponent(jLabel23)
				.addContainerGap(78, Short.MAX_VALUE))
		);
		UsernameData.setText("jLabel1");
		NameData.setText("jLabel3");
		UserIDData.setText("jLabel4");
		PhoneNumberData.setText("jLabel5");
		EmailData.setText("somebodys@gmail.com");
		UserAdressInfoLabel.setText("User Adress Info:");
		CityLabel.setText("City:");
		AdressLabel.setText("Adress:");
		PostalCodeLabel.setText("Postal Code:");
		CountryLabel.setText("Country:");
		UsernameLabel.setText("Username:");
		CityData.setText("jLabel13");
		AdressData.setText("jLabel14");
		NameLabel.setText("Name:");
		PostalCodeData.setText("jLabel15");
		UserIDLabel.setText("UserID:");
		CountryData.setText("jLabel16");
		PhoneNumberLabel.setText("Τηλέφωνο:");
		EmailLabel.setText("E-maill:");
		javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
		jPanel3.setLayout(jPanel3Layout);
		jPanel3Layout.setHorizontalGroup(
			jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			.addGroup(jPanel3Layout.createSequentialGroup()
				.addGap(14, 14, 14)
				.addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
					.addComponent(UsernameLabel)
					.addComponent(NameLabel)
					.addComponent(UserIDLabel)
					.addComponent(PhoneNumberLabel)
					.addComponent(EmailLabel))
				.addGap(35, 35, 35)
				.addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
					.addGroup(jPanel3Layout.createSequentialGroup()
						.addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
							.addComponent(UsernameData)
							.addComponent(NameData)
							.addComponent(UserIDData)
							.addComponent(PhoneNumberData))
						.addGap(52, 52, 52)
						.addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
							.addComponent(UserAdressInfoLabel)
							.addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
								.addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
									.addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
										.addComponent(AdressLabel)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(AdressData))
									.addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
										.addComponent(CityLabel)
										.addGap(66, 66, 66)
										.addComponent(CityData)))
								.addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
									.addGroup(jPanel3Layout.createSequentialGroup()
										.addComponent(CountryLabel)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(CountryData))
									.addGroup(jPanel3Layout.createSequentialGroup()
										.addComponent(PostalCodeLabel)
										.addGap(18, 18, 18)
										.addComponent(PostalCodeData))))))
					.addComponent(EmailData, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
				.addContainerGap(65, Short.MAX_VALUE))
		);
		jPanel3Layout.setVerticalGroup(
			jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			.addGroup(jPanel3Layout.createSequentialGroup()
				.addContainerGap()
				.addComponent(UserAdressInfoLabel)
				.addGap(18, 18, 18)
				.addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
					.addComponent(UsernameLabel)
					.addComponent(UsernameData)
					.addComponent(CityLabel)
					.addComponent(CityData))
				.addGap(18, 18, 18)
				.addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
					.addComponent(NameLabel)
					.addComponent(NameData)
					.addComponent(AdressLabel)
					.addComponent(AdressData))
				.addGap(18, 18, 18)
				.addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
					.addComponent(UserIDLabel)
					.addComponent(UserIDData)
					.addComponent(PostalCodeData)
					.addComponent(PostalCodeLabel))
				.addGap(18, 18, 18)
				.addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
					.addComponent(PhoneNumberLabel)
					.addComponent(PhoneNumberData)
					.addComponent(CountryData)
					.addComponent(CountryLabel))
				.addGap(18, 18, 18)
				.addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
					.addComponent(EmailData)
					.addComponent(EmailLabel))
				.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(
			layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			.addGroup(layout.createSequentialGroup()
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
					.addGroup(layout.createSequentialGroup()
						.addContainerGap()
						.addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addGroup(layout.createSequentialGroup()
						.addGap(23, 23, 23)
						.addComponent(LogoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(25, 25, 25)
						.addComponent(UserInfoLabel)
						.addGap(0, 0, Short.MAX_VALUE))
					.addGroup(layout.createSequentialGroup()
						.addContainerGap()
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
							.addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
				.addContainerGap())
		);
		layout.setVerticalGroup(
			layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			.addGroup(layout.createSequentialGroup()
				.addGap(20, 20, 20)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
					.addComponent(LogoLabel)
					.addComponent(UserInfoLabel))
				.addGap(30, 30, 30)
				.addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
				.addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
				.addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
				.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		pack();
	}
	// End of UI declaration
}