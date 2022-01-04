//Superclass Monster for creating generic monsters
//Dr. G
//10/13/18


public class Monster
{
	//public abstract void speak();
	public void speak()
	{
	System.out.println("GROWL!");
	}
	
	
	//We have to declare speak, but it doesn't really need a body. 
	//public void speak() {}
	
	//An abstract method has to be in an abstract class, but you may have non-abstract 
	//methods inside an abstract class.
	
	//abstract void speak();
	
	//Once you make a method abstract method it needs to be implemented in the subclasses
	//comment it out in one of the subclasses and see what happens.
}