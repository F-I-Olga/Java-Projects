//Game play field class object
//At present this class object is for demonstration purposes only.
//It isn't used in the final product. 
//Dr. G 
//10-5-18
//Edited: 2-17-19
//Edited: 2-27-20

//1. Create a field represented by a 2 dimensional array to place objects in. Allow the 
//driver to select the size of the field.

//Draw a representation of this field object

import java.security.SecureRandom;

public class Field
{
	private int [][] field; 
	private int width; 
	private int height;
	
	public Field(){
		field = null;
	}
	
	public Field(int width, int height){
		field = new int [width][height];
		this.width = width; 
		this.height = height;
		
	//2. Initialize the field with random numbers for now. 
	//The field itself represents a board that the players can play on. 
	//Depending on what number or thing
		initializeField();
	}
	
	//Getters for field
	public int getWidth(){
		return width;
	}
	
	public int getHeight(){
		return height;
	}
	
	//3. We don't have to make every method public.
	//Why would we want to make this one private?
	private void initializeField()
		{
			SecureRandom sr = new SecureRandom();
		
			for (int i = 0; i<width; i++)
				for (int j = 0; j<height; j++)
					{field[i][j] = sr.nextInt(9)+1;}
		}
	
	//Consider this the field is represented by a 2D array and it is initialized with
	//random numbers. Do we want to create setters?

	//MOVE TO THING FILE.....
}