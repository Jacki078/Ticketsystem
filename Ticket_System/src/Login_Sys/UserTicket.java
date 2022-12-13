package Login_Sys;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UserTicket {

	private JFrame frmBenutzerticket;
	private JTable table;
	private JTable table_1;
	private JTable table_2;

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
		frmBenutzerticket.setBounds(100, 100, 591, 443);
		frmBenutzerticket.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmBenutzerticket.getContentPane().setLayout(null);
		
		JLabel lblTicketLabel = new JLabel("Ticket Nr.");
		lblTicketLabel.setBounds(10, 11, 46, 14);
		frmBenutzerticket.getContentPane().add(lblTicketLabel);
		
		JLabel lblPrioLabel_1 = new JLabel("Priorität");
		lblPrioLabel_1.setBounds(96, 11, 46, 14);
		frmBenutzerticket.getContentPane().add(lblPrioLabel_1);
		
		JLabel lblBeschreibungLabel = new JLabel("T-Beschreibung");
		lblBeschreibungLabel.setBounds(183, 11, 86, 14);
		frmBenutzerticket.getContentPane().add(lblBeschreibungLabel);
		
		JButton btnAnsehenButton = new JButton("Ansehen");
		btnAnsehenButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAnsehenButton.setBounds(445, 66, 89, 23);
		frmBenutzerticket.getContentPane().add(btnAnsehenButton);
		
		JButton btnBearbeitenButton_1 = new JButton("Bearbeiten");
		btnBearbeitenButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnBearbeitenButton_1.setBounds(445, 113, 89, 23);
		frmBenutzerticket.getContentPane().add(btnBearbeitenButton_1);
		
		JButton btnErstellenButton_2 = new JButton("Erstellen");
		btnErstellenButton_2.setBounds(445, 370, 89, 23);
		frmBenutzerticket.getContentPane().add(btnErstellenButton_2);
		
		JButton btnLöschenButton_3 = new JButton("Löschen");
		btnLöschenButton_3.setBounds(445, 160, 89, 23);
		frmBenutzerticket.getContentPane().add(btnLöschenButton_3);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 33, 555, 2);
		frmBenutzerticket.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 357, 555, 2);
		frmBenutzerticket.getContentPane().add(separator_1);
		
		table = new JTable();
		table.setBounds(10, 46, 46, 300);
		frmBenutzerticket.getContentPane().add(table);
		
		table_1 = new JTable();
		table_1.setBounds(96, 46, 46, 300);
		frmBenutzerticket.getContentPane().add(table_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(183, 46, 202, 300);
		frmBenutzerticket.getContentPane().add(scrollPane);
		
		table_2 = new JTable();
		scrollPane.setViewportView(table_2);
	}
}
