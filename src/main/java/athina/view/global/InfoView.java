package athina.view.global;

import athina.model.*;

public class InfoView extends javax.swing.JFrame {
    private static final long serialVersionUID = -7488325200857978581L;

    public InfoView() {
        initComponents();
        studentInfoPanel.setVisible(false);
        employeeInfoPanel.setVisible(false);
        // Hidden untill they are supported by the DB 
        cityData.setVisible(false);
        postalCodeData.setVisible(false);
        countryData.setVisible(false);
    }

    public void showTypeSpecificInfo(User user){
        if(user instanceof Student){
			studentInfoPanel.setVisible(true);
		}
		else if(user instanceof Secretary){
			employeeInfoPanel.setVisible(true);
		}
    }

    public void setId(int id){
		userIDData.setText(String.valueOf(id));
	}

	public void setName(String name){
		nameData.setText(name);
	}

	public void setEmail(String email){
		emailData.setText(email);
	}

	public void setPhoneNumber(String phoneNumber){
		phoneNumberData.setText(phoneNumber);
	}

	public void setAdress(String adress){
		adressData.setText(adress);
	}

	public void setEcts(int ects){
		ectsData.setText(String.valueOf(ects));
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adressData;
    private javax.swing.JLabel adressLabel;
    private javax.swing.JLabel cityData;
    private javax.swing.JLabel cityLabel;
    private javax.swing.JLabel countryData;
    private javax.swing.JLabel countryLabel;
    private javax.swing.JLabel ectsData;
    private javax.swing.JLabel ectsLabel;
    private javax.swing.JLabel emailData;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JLabel employeeInfoLabel;
    private javax.swing.JPanel employeeInfoPanel;
    private javax.swing.JPanel globalInfoPanel;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JLabel nameData;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel phoneNumberData;
    private javax.swing.JLabel phoneNumberLabel;
    private javax.swing.JLabel postalCodeData;
    private javax.swing.JLabel postalCodeLabel;
    private javax.swing.JLabel registrationDateData;
    private javax.swing.JLabel registrationDateLabel;
    private javax.swing.JLabel semesterData;
    private javax.swing.JLabel semesterLabel;
    private javax.swing.JLabel studentInfoLabel;
    private javax.swing.JPanel studentInfoPanel;
    private javax.swing.JLabel userIDData;
    private javax.swing.JLabel userIDLabel;
    private javax.swing.JLabel userInfoLabel;
    // End of variables declaration//GEN-END:variables

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        logoLabel = new javax.swing.JLabel();
        userInfoLabel = new javax.swing.JLabel();
        globalInfoPanel = new javax.swing.JPanel();
        userIDLabel = new javax.swing.JLabel();
        userIDData = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        nameData = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        emailData = new javax.swing.JLabel();
        phoneNumberLabel = new javax.swing.JLabel();
        phoneNumberData = new javax.swing.JLabel();
        adressLabel = new javax.swing.JLabel();
        adressData = new javax.swing.JLabel();
        cityLabel = new javax.swing.JLabel();
        cityData = new javax.swing.JLabel();
        postalCodeLabel = new javax.swing.JLabel();
        postalCodeData = new javax.swing.JLabel();
        countryLabel = new javax.swing.JLabel();
        countryData = new javax.swing.JLabel();
        studentInfoPanel = new javax.swing.JPanel();
        studentInfoLabel = new javax.swing.JLabel();
        ectsLabel = new javax.swing.JLabel();
        ectsData = new javax.swing.JLabel();
        semesterLabel = new javax.swing.JLabel();
        semesterData = new javax.swing.JLabel();
        registrationDateLabel = new javax.swing.JLabel();
        registrationDateData = new javax.swing.JLabel();
        employeeInfoPanel = new javax.swing.JPanel();
        employeeInfoLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        logoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/athina/view/cropped-ihu-logo_el-16.png"))); // NOI18N
        logoLabel.setText("jLabel7");

        userInfoLabel.setText("User Information");

        userIDLabel.setText("ID:");

        userIDData.setText("12345");

        nameLabel.setText("Name:");

        nameData.setText("name surname");

        emailLabel.setText("E-mail:");

        emailData.setText("xx12345@ihu.gr");

        phoneNumberLabel.setText("Phone Num. :");

        phoneNumberData.setText("6912345678");

        adressLabel.setText("Adress:");

        adressData.setText("adress");

        cityLabel.setText("City:");

        cityData.setText("city");

        postalCodeLabel.setText("Postal Code:");

        postalCodeData.setText("12345");

        countryLabel.setText("Country:");

        countryData.setText("country");

        javax.swing.GroupLayout globalInfoPanelLayout = new javax.swing.GroupLayout(globalInfoPanel);
        globalInfoPanel.setLayout(globalInfoPanelLayout);
        globalInfoPanelLayout.setHorizontalGroup(
            globalInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(globalInfoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(globalInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(globalInfoPanelLayout.createSequentialGroup()
                        .addComponent(nameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nameData, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                        .addGap(40, 40, 40))
                    .addGroup(globalInfoPanelLayout.createSequentialGroup()
                        .addGroup(globalInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(globalInfoPanelLayout.createSequentialGroup()
                                .addGroup(globalInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(globalInfoPanelLayout.createSequentialGroup()
                                        .addComponent(userIDLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(userIDData, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(phoneNumberLabel))
                                .addGap(6, 6, 6)
                                .addComponent(phoneNumberData))
                            .addGroup(globalInfoPanelLayout.createSequentialGroup()
                                .addComponent(emailLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(emailData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(globalInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(globalInfoPanelLayout.createSequentialGroup()
                        .addComponent(postalCodeLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(postalCodeData))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, globalInfoPanelLayout.createSequentialGroup()
                        .addComponent(adressLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(adressData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(globalInfoPanelLayout.createSequentialGroup()
                        .addComponent(cityLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cityData, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(globalInfoPanelLayout.createSequentialGroup()
                        .addComponent(countryLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(countryData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        globalInfoPanelLayout.setVerticalGroup(
            globalInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(globalInfoPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(globalInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userIDLabel)
                    .addComponent(userIDData)
                    .addComponent(adressLabel)
                    .addComponent(adressData))
                .addGap(20, 20, 20)
                .addGroup(globalInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(globalInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cityLabel)
                        .addComponent(cityData))
                    .addGroup(globalInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(nameLabel)
                        .addComponent(nameData)))
                .addGap(20, 20, 20)
                .addGroup(globalInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(postalCodeData)
                    .addComponent(postalCodeLabel)
                    .addComponent(emailLabel)
                    .addComponent(emailData))
                .addGap(20, 20, 20)
                .addGroup(globalInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneNumberLabel)
                    .addComponent(phoneNumberData)
                    .addComponent(countryData)
                    .addComponent(countryLabel))
                .addGap(0, 0, 0))
        );

        studentInfoLabel.setText("Student Information");

        ectsLabel.setText("ECTS");

        ectsData.setText("0");

        semesterLabel.setText("Semester");

        semesterData.setText("0");

        registrationDateLabel.setText("Registration Date");

        registrationDateData.setText("00/00/0000");

        javax.swing.GroupLayout studentInfoPanelLayout = new javax.swing.GroupLayout(studentInfoPanel);
        studentInfoPanel.setLayout(studentInfoPanelLayout);
        studentInfoPanelLayout.setHorizontalGroup(
            studentInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(studentInfoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(studentInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(studentInfoLabel)
                    .addGroup(studentInfoPanelLayout.createSequentialGroup()
                        .addComponent(registrationDateLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(registrationDateData, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(studentInfoPanelLayout.createSequentialGroup()
                        .addComponent(ectsLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ectsData, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(studentInfoPanelLayout.createSequentialGroup()
                        .addComponent(semesterLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(semesterData, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        studentInfoPanelLayout.setVerticalGroup(
            studentInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(studentInfoPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(studentInfoLabel)
                .addGap(18, 18, 18)
                .addGroup(studentInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ectsLabel)
                    .addComponent(ectsData))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(studentInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(semesterLabel)
                    .addComponent(semesterData))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(studentInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registrationDateLabel)
                    .addComponent(registrationDateData)))
        );

        employeeInfoLabel.setText("Employee  Information");

        javax.swing.GroupLayout employeeInfoPanelLayout = new javax.swing.GroupLayout(employeeInfoPanel);
        employeeInfoPanel.setLayout(employeeInfoPanelLayout);
        employeeInfoPanelLayout.setHorizontalGroup(
            employeeInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(employeeInfoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(employeeInfoLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        employeeInfoPanelLayout.setVerticalGroup(
            employeeInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(employeeInfoPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(employeeInfoLabel)
                .addContainerGap(78, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(logoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(userInfoLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(globalInfoPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(studentInfoPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(employeeInfoPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(logoLabel)
                    .addComponent(userInfoLabel))
                .addGap(10, 10, 10)
                .addComponent(globalInfoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(studentInfoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(employeeInfoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
}
