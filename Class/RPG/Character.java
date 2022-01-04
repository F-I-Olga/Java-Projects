//Character class object. Inherits from Thing class
//Dr. G
//10-5-18
//Edited 2-17-19
//Edited 2-27-20

//This class represents a character in our game. It could be a good guy, bad guy, or just an NPC
//What other things would a character need?
//Draw this on class object on the board and show the relationship it has with thing. 
//What is this type of inheritance called?
import java.security.SecureRandom;
public class Character extends Thing
{
	protected int hitPoints; 
	protected int strength;
	
	protected enum STATUS {DEAD, ALIVE};
	protected STATUS status;

	//What happens if you don't have a no argument object constructor
	public Character()
	{
		super();
		//Children do not inherit constructors 
		//Call the base class no argument construtor first using "super"
		hitPoints = 0;
		strength = 0;
	}
	
	//Comment out both constructors and watch what happens. 
	
	//a more complete constructor
	public Character(String name, Field f1, int hitPoints, int strength)
	{
		//These aren't instance variables we created?
		//Could we replace these with a super constructor?
		super(name);
		
		//Character's instances
		this.hitPoints = hitPoints;
		this.strength = strength;
		status = STATUS.ALIVE;
	}
	
	//This constructor only addresses the subclass variables. What happens to the 
	//inherited variables? How can we make sure the inherited variables have default values?
	public Character(int hitPoints, int strength)
	{
		super();
		this.hitPoints = hitPoints;
		this.strength = strength;
		status = STATUS.ALIVE;
	}
	
	//We'll need some getters for later use, but we'll "set" with damage and heal methods.
	//There's nothing magic about getters and setters. You can call them whatever you want. 
	
	public void SetHitpoints(int hitPoints){
		if (hitPoints > 300) {
	    	this.hitPoints = 300; 
	    }
	    else{
		    this.hitPoints = hitPoints;
	    }
	}
	
	public void SetStrength(int strength){
		if (strength > 100){
		    this.strength =100;
	    }
	    else{
		    this.strength = strength; 
	    }
	}
	public int getHitPoints()
	{
		return hitPoints;
	}
	
	public int getStrength()
	{
		return strength;
	}
	
	//So we can test our creation
	public void showStats(){
	    System.out.printf("Name: %s%n Hit Points: %d%n Strength: %d%n X = %d y = %d%n", name, hitPoints, strength, x, y );
	}
	
	//Check to see if the character still alive?
	public boolean isAlive()
	{
		if (status==STATUS.DEAD){
			return false;
		}
		else{
			return true;
		}
	}
	
	//Destroy the character and move him off the grid
	public void destroyCharacter()
	{
		x= -1;
		y= -1;
		status = STATUS.DEAD;
	}
	
	public void takeDamage(int damage){
		hitPoints-= damage;
		if(hitPoints<=0){
			hitPoints=0;
			status= STATUS.DEAD;
		}
	}
	
	public int attack(){
		SecureRandom sr= new SecureRandom();
		return(sr.nextInt(strength));
	}

	//Compile this file.
	//What's the problem and how do we fix it?
	//MOVE TO HERO FILE
}