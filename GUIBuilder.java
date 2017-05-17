import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUIBuilder {
	/*
	 *   Creates and displays a GUI 
	 */
	private static void createAndDisplayGUI () {
		/* Craete and setup th GUI */
		JFrame frame = new JFrame("Deon's GUI");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		/* Create and format menu bar */
		JMenuBar menuBar = new JMenuBar();
		menuBar.setOpaque(true);
		menuBar.setBackground(new Color(255,128,0));
		menuBar.setPreferredSize(new Dimension(200,25));
		
		/* Create a peach colored Label for the content pane */
		JLabel peachLabel = new JLabel("My first GUI");
		peachLabel.setOpaque(true);
		peachLabel.setBackground(new Color(255,209,164));
		peachLabel.setPreferredSize(new Dimension(300, 280));
		//JPanel contentPane = new JPanel(new BorderLayout());
		
		/* Apply custom menu bar and label  */
		frame.setJMenuBar(menuBar);
		frame.getContentPane().add(peachLabel, BorderLayout.CENTER);
		
		/*Button implemtentation */
		Button buttonContentPane = new Button();
		//buttonContentPane.setOpaque(true);
		//frame.setContentPane(buttonContentPane);
		
		
		
		
		/* Display the GUI */
		frame.pack();
		frame.setVisible(true);
	}
	
	/*
	 *  Main program control
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		javax.swing.SwingUtilities.invokeLater(new Runnable() {public void run() {createAndDisplayGUI();}});
	}

}
