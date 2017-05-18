import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Text extends JPanel implements ActionListener {
	protected JTextField userTextField;
	protected JTextField passTextField;
	protected JTextArea textArea;
	private final static String newline = "\n";
	
	public Text() {
		userTextField = new JTextField(10);

		userTextField.addActionListener(this);
		passTextField = new JTextField(10);
		passTextField.addActionListener(this);
		textArea = new JTextArea(5,30);
		textArea.setEditable(false);
		//JScrollPane scrollPane = new JScrollPane(textArea);
		
		// Add comonents to the panel
		GridBagConstraints c = new GridBagConstraints();
		c.gridwidth = GridBagConstraints.REMAINDER;
		c.fill = GridBagConstraints.HORIZONTAL;
		add(new JLabel("Username"),c);
		add(userTextField, c);
		add(new JLabel("Password"),c);
		add(passTextField, c);
		
		c.fill = GridBagConstraints.BOTH;
		c.weightx = 1.0;
		c.weighty = 1.0;
		//add(scrollPane, c);
		
		
	}
	
	
	public void actionPerformed(ActionEvent evt) {
		String userInputText = userTextField.getText();
		String passInputText = passTextField.getText();
		/*
		textArea.append(userInputText + newline);
		userTextField.selectAll();
		textArea.setCaretPosition(textArea.getDocument().getLength());
		*/
	}
}
