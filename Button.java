import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Button extends JPanel implements ActionListener {
	
	protected JButton button1;
	public Button() {
/* Button management */
		
		button1 = new JButton("Submit");
		button1.setVerticalTextPosition(AbstractButton.CENTER);
		button1.setHorizontalTextPosition(AbstractButton.CENTER);
		button1.setMnemonic(KeyEvent.VK_M);
		button1.setActionCommand("submit");
		button1.setBackground(new Color(255,209,164));
	    button1.addActionListener(this);
		add(button1);
	}
	
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if ("submit".equals(arg0.getActionCommand())) {
            
            button1.setEnabled(false);
            
        } else {
            
            button1.setEnabled(true);
        }
           
	}

}
