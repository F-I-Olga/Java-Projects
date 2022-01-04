//We need a character for our hero to fight. What are the similarities and differences 
//between this and the hero file?
//Dr. G 
//10-5-18
//Edited: 2-17-19
//Edited: 2-27-20

import java.security.SecureRandom;

public class Baddy extends Character
{

	public Baddy()
	{
	//call the parent constructor
	}
	
	public Baddy(String name, Field f1, int hitPoints, int strength)
	{
	SecureRandom sr = new SecureRandom();
	
	this.name = name;
	
	//place him randomly on the map, but not at 0,0
	while (x==0 & y==0){
		x = sr.nextInt(f1.getWidth()); 
		y = sr.nextInt(f1.getHeight());
	}
	
	//Give him a status of alive
	status = status.ALIVE;
	
	//only allow for a max of 300 hit points
	if (hitPoints > 300) {
		this.hitPoints = 300; 
	}
	else{
		this.hitPoints = hitPoints;
	}
	
	//only allow for a max of 100 strength
	if (strength > 100){
		this.strength =100;
	}
	else{
		this.strength = strength; 
	}

	
	//How could we have accomplished the above with a parent constructor?
	}
	
	public Baddy(String name, int hitPoints, int strength)
	{
	SecureRandom sr = new SecureRandom();
	
	this.name = name;
	
	//place him randomly on the map, but not at 0,0
	/*while (x==0 & y==0){
		x = sr.nextInt(f1.getWidth()); 
		y = sr.nextInt(f1.getHeight());
	}*/
	
	//Give him a status of alive
	status = status.ALIVE;
	
	//only allow for a max of 300 hit points
	if (hitPoints > 300) {
		this.hitPoints = 300; 
	}
	else{
		this.hitPoints = hitPoints;
	}
	
	//only allow for a max of 100 strength
	if (strength > 100){
		this.strength =100;
	}
	else{
		this.strength = strength; 
	}

	
	//How could we have accomplished the above with a parent constructor?
	}
	
	//What other functions would we need to give our villain?
	//Are the hero and baddy sufficiently different to require two classes?
	
	//NOW GO CHECK OUT THE DRIVER FILE
}