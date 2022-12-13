package Login_Sys;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class UserTicket {

	private JFrame frmBenutzerticket;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserTicket window = new UserTicket();
					window.frmBenutzerticket.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public UserTicket() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmBenutzerticket = new JFrame();
		frmBenutzerticket.setTitle("Benutzerticket");
		frmBenutzerticket.setBounds(100, 100, 591, 483);
		frmBenutzerticket.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmBenutzerticket.getContentPane().setLayout(null);
		
		JLabel lblTicketLabel = new JLabel("Ticket Nr.");
		lblTicketLabel.setBounds(10, 11, 46, 14);
		frmBenutzerticket.getContentPane().add(lblTicketLabel);
		
		JLabel lblPrioLabel_1 = new JLabel("Priorität");
		lblPrioLabel_1.setBounds(96, 11, 46, 14);
		frmBenutzerticket.getContentPane().add(lblPrioLabel_1);
		
		JLabel lblBeschreibungLabel = new JLabel("New label");
		lblBeschreibungLabel.setBounds(183, 11, 46, 14);
		frmBenutzerticket.getContentPane().add(lblBeschreibungLabel);
	}
}
