//Here's our hero. The hero is a ___________ which is a _____________. 
//Which is an example of ___________________.
//Playable hero object subclass of a Character
//Dr. G 
//10-5-18
//Edited: 2-17-19
//Edited: 2-27-20

//Draw this object and describe its association with it's parent
import java.security.SecureRandom;
public class Hero extends Character
{
	//Should these be private or protected?
	private Thing inventory [];
	private final int INVENTORY_SIZE = 10; 
	private int manna=49;
	Weapon w4= new Weapon(); 
	
	public int getManna(){
		return (manna);
	}
	
	public void setManna(int manna){
		this.manna= manna;
	}

	//Constructors for hero object
	public Hero()
		{
			//Call the parent constructor and trace what happens
			inventory = null;
		}
	
	public Hero(String name, Field f1, int hitPoints, int strength)
		{ 
			this.name = name;
			//Start him at position 0
			//We could have a board object with an array of "Thing" objects and use the coordindates. 
			//But that requires polymorphism and we'll get to that. 
			x = 0; 
			y = 0;
			//Give him a status of alive
			status = status.ALIVE;
			SetHitpoints(hitPoints);
			SetStrength(strength);
		
			//only allow for a max of 300 hit points
			//What is this an example of?
			if (hitPoints > 300){
				this.hitPoints = 300; 
			}
			else{
				this.hitPoints = hitPoints;
			}
		
			//only allow for a max of 100 strength
			//What is this an example of?
			if (strength > 100){
				this.strength =100;
			}
			else{
			    this.strength = strength;
			}			
		
			//create an inventory of objects for the hero to carry around
			inventory = new Thing [INVENTORY_SIZE];
		
			//initialize inventory array
			initInventory();
		}
	public Hero(String name, int hitPoints, int strength)
		{ 
			this.name = name;
			//Start him at position 0
			//We could have a board object with an array of "Thing" objects and use the coordindates. 
			//But that requires polymorphism and we'll get to that. 
			x = 0; 
			y = 0;
			//Give him a status of alive
			status = status.ALIVE;
			SetHitpoints(hitPoints);
			SetStrength(strength);
		
			//only allow for a max of 300 hit points
			//What is this an example of?
			if (hitPoints > 300){
				this.hitPoints = 300; 
			}
			else{
				this.hitPoints = hitPoints;
			}
		
			//only allow for a max of 100 strength
			//What is this an example of?
			if (strength > 100){
				this.strength =100;
			}
			else{
			    this.strength = strength;
			}			
		
			//create an inventory of objects for the hero to carry around
			inventory = new Thing [INVENTORY_SIZE];
		
			//initialize inventory array
			initInventory();
		}
		
		
	//This is the reason for the name only constructor in the object class
	private void initInventory()
	{
	 for (int i = 0; i< INVENTORY_SIZE; ++i){
	 	inventory[i] = new Thing("EMPTY"); 
	 }
	}
	
	public int Weaponattack(int c){
		SecureRandom sr= new SecureRandom();
		return(sr.nextInt(w4.basicAttack(c)));
	}
	
	//What other functions would we need to give our hero?
	
	//NOW GO TAKE A LOOK AT THE VILLIAN FILE. 
}