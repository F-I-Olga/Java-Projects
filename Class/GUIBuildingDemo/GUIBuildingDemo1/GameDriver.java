//Demo code to demonstrate GUI Building
//3-7-19
//Updated 11/29/2020
//Dr. G

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;
import java.awt.Graphics;
import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class GameDriver extends JFrame
{
	
	//constructor
	public GameDriver() {}
	

	
	public static void main(String[] args) {
		
		//1. Try to open the file with WindowsBuilder
		//If you need to install it go to Help -> Market place and do a search
		//For windows builder to work the file has to be a JFrame
		//2. Uncomment and discuss the code at the bottom of this file
		//3. Explore the different layouts within WB and then add a layout and observe what happens to your code
		//4. Create two panels one for controls and one for the map then explore different layouts
		//5. Add labels for lives and money to the control panel
		//6. Add a start button to the control panel
		//7. Construct an object to test your results so far
		//8. Notice how you can adjust things in the code or with the GUI
		//9. Make the program print something when you click the start button
		//10. Create an output label and change the text there when there's a mouse click
		//11. Add the MyCanvas file to the project and review
		//12. Make MyCanvas your 2nd JPanel and add this code in the appropriate place
		
		/*
		 for (int x = 0; x< 4; x++)
			for (int y = 0; y < 4; y++)
				((MyCanvas)Map).addPicture(x, y,"A.png");
		 */
		
		//You can control the size and bounds as well if desired
		//It used to be a JFrame it's now a what? Why?
		
		//13. Change the tile to one you download
		
		//14. Discuss the paint method in MyCanvas
		//15. Add the bullet file to the project and review
		
		//16. Add a timer object and listener
		
		/*
		Timer timer = new Timer(1000, new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				
				//do stuff
				
			}});
		 */
		
		//17. Create a bullet object and have it drawn in the timer listener
		
		//18. Start the timer when the user hits the previously created button
		//19. Add MapObject, Tower, and MovingObject then review
		//20. Have the bullet fire from a tower
		/*
		For your lab
		1. organize and comment this code file
		2. have the tower fire a fire ball instead of a black circle
		More details will be given in class lecture
		*/
		
		/*
		GameDriver m = new GameDriver();
		m.setSize(600, 600);
		m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		m.setVisible(true);
		*/
	}
}
