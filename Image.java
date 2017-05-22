import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.nio.file.Paths;
import java.io.File;
import java.io.IOException;
import javax.swing.*;
import java.util.*;
import javax.imageio.ImageIO;

public class Image extends JPanel{
	private BufferedImage image;
	
	public Image() {
		//Path path = Paths.get("C:\Users\DJACK277\workspace\GUI_project\src");
		try {
			image = ImageIO.read(new File("C:/Users/DJACK277/workspace/GUI_project/src/ford.png"));
		} catch (IOException e) {
			System.out.println("nah");
		}


	}
}
