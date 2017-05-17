import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Button extends JPanel implements ActionListener {
	
	public void makeButton() {
/* Button management */
		
		JButton button1 = new JButton("Submit");
		button1.setVerticalTextPosition(AbstractButton.CENTER);
		button1.setHorizontalTextPosition(SwingConstants.CENTER);
		button1.setMnemonic(KeyEvent.VK_M);
		button1.setActionCommand("submit");
		
	    button1.addActionListener(this);
		add(button1);
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub

	}

}
