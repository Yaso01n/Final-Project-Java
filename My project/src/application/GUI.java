package application;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.UIManager;
import javax.swing.JPasswordField;

public class GUI {

	public JFrame frame;
	private JTextField UsernameINPUT;
	private JPasswordField passwordField;

	
	/**
	 * Initialize the contents of the frame.
	 * @wbp.parser.entryPoint
	 */
	public void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		
		JButton btnNewButton = new JButton("Log in");
		btnNewButton.setForeground(Color.LIGHT_GRAY);
		btnNewButton.setBackground(new Color(75, 0, 130));
		btnNewButton.setSize(100,10);
//Button Log in action
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
//Comparing the inputs with the e-mails
				 String username = UsernameINPUT.getText();
				String password = passwordField.getText();
				 Student Stuaccounts =new Student();
				 Doctor Docaccounts =new Doctor();
				 TeachingAssistant Assistantaccounts =new TeachingAssistant();
				 boolean S =  Stuaccounts.Comparinginput(username, password);
				 boolean D =  Docaccounts.Comparinginput(username, password);
				 boolean A =  Assistantaccounts.Comparinginput(username, password);
			if(S) {
	               frame.setVisible(false);
		           Studentwindow2 w2 = new Studentwindow2();
		           w2.initialize();
		    }
			else if(D) {
				       frame.setVisible(false);
					  
			}
				
			else if(A) {
				        frame.setVisible(false);
//					    Assistantwindow2 w2 = new Assistantwindow2();
//					    w2.initialize();
			}
			
		    else {
			JOptionPane.showMessageDialog(btnNewButton, "Incorrect Inputs","Error Message",JOptionPane.ERROR_MESSAGE );
			UsernameINPUT.setText(null);
			passwordField.setText(null);
		    }
			}
		});
		
		UsernameINPUT = new JTextField();
		UsernameINPUT.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Password");
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		
		JLabel lblNewLabel_1 = new JLabel("Username");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_1.setBackground(new Color(0, 0, 255));
		
		
//Adding a new account Button		
		JButton btnNewButton_1 = new JButton("New Account");
		btnNewButton_1.setForeground(Color.LIGHT_GRAY);
		btnNewButton_1.setBackground(new Color(75, 0, 130));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		passwordField = new JPasswordField();
		
		
		
		
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(108)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btnNewButton)
							.addPreferredGap(ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
							.addComponent(btnNewButton_1)
							.addGap(63))
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(passwordField, Alignment.LEADING)
								.addComponent(UsernameINPUT, Alignment.LEADING, 153, 153, Short.MAX_VALUE)
								.addComponent(lblNewLabel_1, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE))
							.addContainerGap(173, Short.MAX_VALUE))))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(36)
					.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(UsernameINPUT, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_1, GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
					.addContainerGap(24, Short.MAX_VALUE))
		);
		frame.getContentPane().setLayout(groupLayout);
	}
}
