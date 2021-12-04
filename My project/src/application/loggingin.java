package application;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JEditorPane;

public class loggingin extends JPanel {
	private final JButton btnLogIn = new JButton("Log in");
	private final JTextField txtPassword = new JTextField();

	/**
	 * Create the panel.
	 */
	public loggingin() {
		add(txtPassword);
		txtPassword.setText("Password");
		txtPassword.setColumns(10);
		
		JEditorPane editorPane = new JEditorPane();
		add(editorPane);
		add(btnLogIn);

	}

}
