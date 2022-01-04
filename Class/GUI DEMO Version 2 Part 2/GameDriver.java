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
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;

public class GameDriver extends JFrame
{
	private int x; 
	private Timer timer;
	private Bullet1 b1;
	private Tower t1; 
	
	//constructor
	public GameDriver() 
	{
		x = 0;
		
		try {
		t1 = new Tower(30,30,ImageIO.read(new File("Crystal.png")), 20, 20);
		}catch (IOException e) {
			System.err.println("Unable to read the tower file: ");
		}
		
		
		
		getContentPane().setLayout(null);
		
		JPanel controls = new JPanel();
		controls.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		controls.setBounds(10, 11, 171, 239);
		getContentPane().add(controls);
		controls.setLayout(null);
		
		JLabel lbl_lives = new JLabel("Lives : ");
		lbl_lives.setBounds(10, 11, 46, 14);
		controls.add(lbl_lives);
		
		JLabel lbl_money = new JLabel("Money : ");
		lbl_money.setBounds(10, 36, 46, 14);
		controls.add(lbl_money);
		
	
		
		JPanel map = new MyCanvas(4,4);
		
		 for (int x = 0; x< 4; x++)
				for (int y = 0; y < 4; y++)
					((MyCanvas)map).addPicture(x, y,"grass_02_64.png");
		
		map.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		map.setBounds(191, 11, 322, 297);
		getContentPane().add(map);
		map.setLayout(null);
		
		JButton btn_startButton = new JButton("START");
		btn_startButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				timer.start();
				b1 = new Bullet1(30,30,10,10);
				t1.drawImage(map.getGraphics());
			}
		});
		btn_startButton.setBounds(20, 61, 89, 23);
		controls.add(btn_startButton);
		
		
		timer = new Timer(500, new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				
				if (b1 != null)
				{
					map.paint(map.getGraphics());
					b1.drawImage(map.getGraphics());
				}
				
				if(t1 != null)
				{
					t1.drawImage(map.getGraphics());
				}
				
			}});
		
	}
	

	
	public static void main(String[] args) {
		
	/*
		 * Review From Last Class
		 * 1. Explored basic setup using WindowsBuilder
		 * 2. Discussed how this is an example of inheritance
		 * 3. Used previous cod in this demonstrated
		 * 4. Explored the use of a timer
		 * 5. Demonstrated how to use class object in a more complicated project
		 * */
		
		/*
		 * 1. Fix sizing
		 * 2. Add title
		 * 3. Add towers based on click
		 * 4. When you add a tower have it fire
		 * 5. Modify it to fire once only
		 * 6. Add a moving badguy
		 * 
		 * */
		
		/*Lab assignment
		 * 
		 * 1. Replace the dot with a fireball
		 * 2. Fix the moving badguy 
		 * 3. Make it 4 moving badguys and space them out
		 * 4. If a bullet hits a badguy stop drawing it
		 * 
		 * */
		
		
		GameDriver m = new GameDriver();
		m.setSize(600, 600);
		m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		m.setVisible(true);
		
	}
}
