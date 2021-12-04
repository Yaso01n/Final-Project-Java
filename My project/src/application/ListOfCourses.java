package application;

import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JEditorPane;
import javax.swing.JList;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTree;

public class ListOfCourses {

	private JFrame frame;
	private JTable table;

	/**
	 * Initialize the contents of the frame.
	 * @wbp.parser.entryPoint
	 */
	public void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 372);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//Go Back Button		
		JButton btnNewButton = new JButton("Go Back");
		btnNewButton.setBackground(new Color(75, 0, 130));
		btnNewButton.setForeground(Color.LIGHT_GRAY);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				   frame.setVisible(false);
				   Studentwindow2 b = new  Studentwindow2();
		           b.initialize();	
			}
		});
		
//View Courses Button		
		JButton btnNewButton_1 = new JButton("View Course");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				EnterCourseCode c = new  EnterCourseCode();
		        c.initialize();
			}
		});
		btnNewButton_1.setForeground(Color.LIGHT_GRAY);
		btnNewButton_1.setBackground(new Color(75, 0, 130));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		
	
		JLabel lblNewLabel = new JLabel("Your Courses Are:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel.setBackground(new Color(75, 0, 130));
		lblNewLabel.setForeground(new Color(75, 0, 130));
		
		table = new JTable();
		table.addAncestorListener(new AncestorListener() {
			public void ancestorAdded(AncestorEvent event) {
				Courses o = new Courses();
				ArrayList<String> c = o.ListofCoursesCodes(); 
				ArrayList<String> n = o.ListofCoursesNames();
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				Object rowData[]= new Object[2];
				for(int i=0; i< c.toArray().length;i++)
				{
					rowData[0]=n.get(i);
					rowData[1]=c.get(i);
					model.addRow(rowData);
				}
			}
			public void ancestorMoved(AncestorEvent event) {
			}
			public void ancestorRemoved(AncestorEvent event) {
			}
		});
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Course Name", "Course Code"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(90);
		table.getColumnModel().getColumn(1).setPreferredWidth(72);
		
		JLabel lblNewLabel_1 = new JLabel("Course Name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setForeground(new Color(75, 0, 130));
		
		JLabel lblNewLabel_2 = new JLabel("Course Code");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setForeground(new Color(75, 0, 130));
		
		
		
		
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 182, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btnNewButton_1)
							.addPreferredGap(ComponentPlacement.RELATED, 242, Short.MAX_VALUE)
							.addComponent(btnNewButton)))
					.addContainerGap())
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(19)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblNewLabel_1)
							.addGap(134)
							.addComponent(lblNewLabel_2))
						.addComponent(table, GroupLayout.PREFERRED_SIZE, 390, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(25, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(19)
					.addComponent(lblNewLabel)
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1)
						.addComponent(lblNewLabel_2))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(table, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 212, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton_1)
						.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
					.addGap(19))
		);
		frame.getContentPane().setLayout(groupLayout);
		frame.setVisible(true);
	}
}
