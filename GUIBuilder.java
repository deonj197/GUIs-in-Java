import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.swing.*;
import java.util.*;
import javax.imageio.ImageIO;
;public class GUIBuilder {
	/*
	 *   Creates and displays a GUI 
	 */
	private static JFrame frame;
 	private static JPanel mainPanel;
	private static void createAndDisplayGUI () {
		/* Craete and setup th GUI */
		frame = new JFrame("Deon's GUI");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
	
		/* Create and format menu bar */
		mainPanel = new JPanel();
		mainPanel.setBackground(new Color(255,209,164));
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setOpaque(true);
		menuBar.setBackground(new Color(255,128,0));
		menuBar.setPreferredSize(new Dimension(200,25));
		
		/* 
		 *  Construct the File menu including all buttons and features
		 */
		JMenu menu;
		JMenuItem menuItem;
	    menu = new JMenu("File");
		menu.getAccessibleContext().setAccessibleDescription("File options");
		menuBar.add(menu);
		menuItem = new JMenuItem("Save");
		menu.add(menuItem);
		menuItem = new JMenuItem("Save as");
		menu.add(menuItem);
		menuItem = new JMenuItem("Import");
		menu.add(menuItem);
		
		
		/*
		 *   Construct the Edit menu
		 */
		menu = new JMenu("Edit");
		menu.getAccessibleContext().setAccessibleDescription("Edit menu");
		menuBar.add(menu);
		menuItem = new JMenuItem("Undo");
		menu.add(menuItem);
		menuItem = new JMenuItem("Redo");
		menu.add(menuItem);
		menuItem = new JMenuItem("Cut");
		menu.add(menuItem);
		menuItem = new JMenuItem("Copy");
		menu.add(menuItem);
		menuItem = new JMenuItem("Paste");
		menu.add(menuItem);
		
		/*
		 *   Construct the Settings menu
		 */
		menu = new JMenu("Settings");
		menu.getAccessibleContext().setAccessibleDescription("Settings menu");
		menuBar.add(menu);
		menuItem = new JMenuItem("Preferences");
		menu.add(menuItem);
		menuItem = new JMenuItem("Style");
		menu.add(menuItem);
		menuItem = new JMenuItem("Operations");
		menu.add(menuItem);
		menuItem = new JMenuItem("Appearance");
		menu.add(menuItem);

		
		 
		
		/* Apply custom menu bar and label  */
		frame.setJMenuBar(menuBar);
		
		/*
		 *   Ford Logo
		 */
		ImageIcon image = new ImageIcon("C:/Users/DJACK277/workspace/GUI_project/src/ford.png");
		
			
		
		
		/* Button implemtentation */
		Button buttonContentPane = new Button();
		buttonContentPane.setOpaque(true);
		
		Image fordLogo = new Image(); 
		mainPanel.setPreferredSize(new Dimension(425, 100));
		
		mainPanel.add(new Text());
		mainPanel.add(buttonContentPane);
		frame.add(mainPanel);
		
		
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
