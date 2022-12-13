package Login_Sys;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class Login_S implements ActionListener {

	private JFrame frmTicketsystemLogin;
	private JTextField textID;
	private JPasswordField passwordField;
	
	JButton btnExit, btnEinloggen; 

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login_S window = new Login_S();
					window.frmTicketsystemLogin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login_S() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frmTicketsystemLogin = new JFrame();
		frmTicketsystemLogin.setTitle("Ticket-System Login");
		frmTicketsystemLogin.setBounds(200, 200, 345, 224);
		frmTicketsystemLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTicketsystemLogin.getContentPane().setLayout(null);
		
		JLabel lblLoginLabel = new JLabel("Login");
		lblLoginLabel.setBounds(97, 21, 43, 14);
		frmTicketsystemLogin.getContentPane().add(lblLoginLabel);
		
		JLabel lblUsername = new JLabel("ID:");
		lblUsername.setBounds(28, 61, 73, 14);
		frmTicketsystemLogin.getContentPane().add(lblUsername);
		
		JLabel lblPassword = new JLabel("Passwort:");
		lblPassword.setBounds(28, 95, 73, 14);
		frmTicketsystemLogin.getContentPane().add(lblPassword);
		
		textID = new JTextField();
		textID.setBounds(97, 58, 210, 20);
		frmTicketsystemLogin.getContentPane().add(textID);
		textID.setColumns(10);
		
		btnEinloggen = new JButton("Einloggen");
		btnEinloggen.setBounds(97, 138, 89, 23);
		btnEinloggen.addActionListener(this);
		frmTicketsystemLogin.getContentPane().add(btnEinloggen);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 125, 297, 2);
		frmTicketsystemLogin.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 45, 297, 2);
		frmTicketsystemLogin.getContentPane().add(separator_1);
		
		btnExit = new JButton("Exit");
		btnExit.setBounds(218, 138, 89, 23);
		btnExit.addActionListener(this);
		frmTicketsystemLogin.getContentPane().add(btnExit);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(97, 92, 210, 20);
		frmTicketsystemLogin.getContentPane().add(passwordField);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == btnExit) {
			System.exit(0);
		}

		if(e.getSource() == btnEinloggen) {
			
			
		}
		;
		
		
		
	}
}