//Generic game Thing super class file
//This class should never be instantiated
//Start with this class object
//
//Dr. G 
//10-5-18
//Edited 2-17-19
//Edited 2-27-20

//Create an Thing class for something in our video game. 
//What would ever "thing" that you want to interact with need to have?
 
//Review all of the code below. 
//Draw a representation of this class

public class Thing
{
	//The thing's name
	protected String name;
	
	//Maybe we need to keep up with the position of every "thing" in the game
	protected int x; 
	protected int y;
	protected int z; 
	
	public Thing()//no argument constructor placing Thing off the field
	{
		this.name = null; 
		this.x = -1;
		this.y = -1;
		this.z = -1;
	}
	
	//Complete constructor
	public Thing(String name, int x, int y, int z)
	{
		this.name = name; 
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	//Constructor for the Thing without putting it on the playing field yet
	//Maybe instead we'll put it in our hero's inventory if we make that a thing
	public Thing(String name)
	{
		this.name = name;
		x=-1; 
		y=-1;
		z=-1;
	}
	
	//Sometimes a Thing gets destroyed. 
	//Note this does not de-allocate the memory this Thing took up
	public void DestroyThing()
	{
		this.name = null; 
		this.x = -1;
		this.y = -1;
	}	
	
	//Compile this class to check for errors
	//MOVE TO THE CHARACTER CLASS
}