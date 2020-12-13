package athina.view.global;

import athina.controller.*;

public class LoginView extends javax.swing.JFrame {
	private static final long serialVersionUID = -5994528210002301049L;
	private LoginController loginController;

	public LoginView(LoginController loginController) {
		initComponents();
		this.loginController = loginController;
	}

	public LoginController getController(){
		return loginController;
	}

	private void connectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_connectButtonActionPerformed
		loginController.setUsername(usernameTextField.getText());
		loginController.setPassword(passwordTextField.getText());
		loginController.dbConnect();
	}//GEN-LAST:event_connectButtonActionPerformed

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton connectButton;
	private javax.swing.JLabel logoLabel;
	private javax.swing.JLabel passwordLabel;
	private javax.swing.JTextField passwordTextField;
	private javax.swing.JLabel univericityLabel;
	private javax.swing.JLabel usernameLabel;
	private javax.swing.JTextField usernameTextField;
	// End of variables declaration//GEN-END:variables

	// <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		logoLabel = new javax.swing.JLabel();
		univericityLabel = new javax.swing.JLabel();
		usernameLabel = new javax.swing.JLabel();
		usernameTextField = new javax.swing.JTextField();
		passwordLabel = new javax.swing.JLabel();
		passwordTextField = new javax.swing.JTextField();
		connectButton = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		logoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		logoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/athina/view/cropped-ihu-logo_el-16.png"))); // NOI18N
		logoLabel.setText("logo");

		univericityLabel.setText("Information and Electronice Engineering Department ");

		usernameLabel.setText("Username");

		usernameTextField.setToolTipText("");

		passwordLabel.setText("Password");

		connectButton.setText("Login");
		connectButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				connectButtonActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(
			layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			.addGroup(layout.createSequentialGroup()
				.addGap(18, 18, 18)
				.addComponent(logoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
				.addComponent(univericityLabel)
				.addGap(21, 21, 21))
			.addGroup(layout.createSequentialGroup()
				.addGap(49, 49, 49)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
					.addComponent(connectButton, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
					.addGroup(layout.createSequentialGroup()
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
							.addComponent(usernameLabel)
							.addComponent(passwordLabel))
						.addGap(46, 46, 46)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
							.addComponent(usernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
							.addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))))
				.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		layout.setVerticalGroup(
			layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
				.addGap(18, 18, 18)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
					.addComponent(logoLabel)
					.addComponent(univericityLabel))
				.addGap(40, 40, 40)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
					.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
							.addComponent(usernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
							.addComponent(usernameLabel))
						.addGap(51, 51, 51))
					.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
						.addComponent(passwordLabel)
						.addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
				.addComponent(connectButton)
				.addGap(10, 10, 10))
		);

		pack();
	}// </editor-fold>//GEN-END:initComponents
}
