import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.nio.file.Files;
import java.nio.file.Paths;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;


@SuppressWarnings({ "serial", "unused" })
public class FileReader extends JFrame {

	public FileReader(){
		super("Maze");
		int numRows = 10;
		int numCols = 50;
		MyCanvas myCanvas = null; 
		String ans="Maze2.txt";
		//Do Not Make Any Changes Above This Line

		//Here is where you need to ask the user to enter the name of the maze file, or just hard code it in
		Scanner scn= new Scanner(System.in);
		File m = new File(ans);
		System.out.println("Please choose a Maze file, Choose 1,2, 0r 3");
		System.out.println("1. Maze2.txt");
		System.out.println("2. Maze3.txt");
		System.out.println("3. Maze3.txt");
		int choice= scn.nextInt();
	    if (choice== 2) ans= "Maze3.txt";
		else if (choice== 3) ans= "Maze4.txt";
		 try {

            Scanner r= new Scanner(m);
            while (r.hasNextLine()) {
                String data = r.nextLine();
               // System.out.println(data);
		    	 
			   
            }
            r.close();
        } 
		catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
		
		
          //BufferedReader reader = new BufferedReader(new FileReader(mazeFile));
		
		//Use the first 2 integers in the file to make the following method call work
		
		try{
		    Scanner line = new Scanner(m);
			numRows = line.nextInt(); //get the number of rows of the maze
            numCols = line.nextInt(); // get the number of columns of the maze
			myCanvas = new MyCanvas(numRows, numCols);
		}
		catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
       
		


		//Now the hard part.  Figure out what picture should be printed at each position
		//Using a Scanner you can read in ints and doubles, and Strings
		//Note: loops are very good for this type of exercise
		//The following method call adds picture A at position 0 0
		try{
			String s;
			do{
				
				
				s = new String (Files.readAllBytes(Paths.get("C:/Users/olgaf/OneDrive/Desktop/CS 1410/File Reading/Maze")));
				// s = m.readString(ans);

				if(s=="A"||s=="B"||s=="C"||s=="D"||s=="E"||s=="F"||s=="G"||s=="H"||s=="I"||s=="J"||s=="K"||s=="L"||s=="M"||s=="N"||s=="O"||s=="P"){
					myCanvas.addPicture(0, 0, s + ".png");
				}
			    
				
			}while(s!="5"||s!="7"||s!="9");
		}
		catch (IOException  e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

		//You can change the size of the Frame if you want
		this.setSize(600, 600);

		//Do Not Make Any Changes Below This Line
		if (myCanvas != null){
			this.add(myCanvas);
		}
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new FileReader();
	}

 
}

@SuppressWarnings("serial")
class MyCanvas extends JPanel{
	private BufferedImage[][] imgs;
	private int rows;
	private int cols;
	private final int tileSize = 64;
	public MyCanvas(int rows, int cols){
		super();
		this.rows = rows;
		this.cols = cols;
		imgs = new BufferedImage[rows][cols];
	}
	public void addPicture(int x, int y, String filename){
		if (x < 0 || x >= rows){
			System.err.println("There is no row " + x);
		}
		else if (y < 0 || y >= cols){
			System.err.println("There is no col " + y);
		}
		else{
				try {
					imgs[x][y] = ImageIO.read(new File(filename));
				} catch (IOException e) {
					System.err.println("Unable to read the file: " + filename);
				}
		}
	}
	public void paint(Graphics g){
		for (int i = 0; i < rows; i++){
			for (int j = 0; j < cols; j++){
				g.drawImage(imgs[i][j], j*tileSize, i*tileSize, null);
			}
		}
	}
}