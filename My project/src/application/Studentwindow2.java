package application;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JEditorPane;
import javax.swing.JTextArea;
import javax.swing.JPasswordField;
//Main menu window
public class Studentwindow2 {

	public JFrame frame;


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
		
//Logout Button
		JButton btnNewButton = new JButton("Log out");
		btnNewButton.setBackground(new Color(75, 0, 130));
		btnNewButton.setForeground(Color.LIGHT_GRAY);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				GUI w1 = new GUI();
				w1.initialize();
			}
		});
		
		
		JButton btnNewButton_1 = new JButton("Grade Report");
		btnNewButton_1.setBackground(new Color(75, 0, 130));
		btnNewButton_1.setForeground(Color.LIGHT_GRAY);
		
		
//View Course Button		
		JButton btnNewButton_2 = new JButton("View Course");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				EnterCourseCode w = new EnterCourseCode();
				w.initialize();
			}
		});
		btnNewButton_2.setBackground(new Color(75, 0, 130));
		btnNewButton_2.setForeground(Color.LIGHT_GRAY);
		
		
//List of courses button		
		JButton btnNewButton_3 = new JButton("List My Courses");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				   frame.setVisible(false);
				   ListOfCourses l = new  ListOfCourses();
		           l.initialize();	
			}
		});
		
		
		
		
		btnNewButton_3.setBackground(new Color(75, 0, 130));
		btnNewButton_3.setForeground(Color.LIGHT_GRAY);
		
		
		
		JButton btnNewButton_4 = new JButton("Register to new Course");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 frame.setVisible(false);
				 Registertoanewcourse l = new   Registertoanewcourse();
		           l.initialize();
			}
		});
		btnNewButton_4.setBackground(new Color(75, 0, 130));
		btnNewButton_4.setForeground(Color.LIGHT_GRAY);
		
		
		
		JLabel lblNewLabel = new JLabel("Welcome ");
		lblNewLabel.setForeground(new Color(75, 0, 130));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		
		
		
		
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(146)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(btnNewButton_2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btnNewButton_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(btnNewButton_3, GroupLayout.PREFERRED_SIZE, 144, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED))))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(169)
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(94)
							.addComponent(btnNewButton_4, GroupLayout.PREFERRED_SIZE, 235, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(105, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(21)
					.addComponent(lblNewLabel)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnNewButton_4, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnNewButton_3)
					.addGap(18)
					.addComponent(btnNewButton_2)
					.addGap(18)
					.addComponent(btnNewButton_1)
					.addGap(18)
					.addComponent(btnNewButton)
					.addContainerGap(16, Short.MAX_VALUE))
		);
		frame.getContentPane().setLayout(groupLayout);
	}
}
