//Driver class for polymorphism demonstration
//Dr. G
//10-13-18
//Edited 3-14-19

//For this demonstration I want to explore basic polymorphism, polymorphic variables,
//polymorphic arrays, abstract classes, concrete classes, and abstract methods. Make sure 
//to make a note of all of these concepts as we get to them. 

//1. Explore the following files Monster, Goblin, Werewolf, and Zombie. Ignore anything
//commented out for now.

public class PolyDemo
{
	public static void main(String [] args)
	{
		//2.  Create just a monster and test the speak function
		Monster m1= new Monster();
		//m1.speak();
		//3. Create a specific monster m1 and test its speak method
		//Zombie z1= new Zombie();
		//z1.speak();
		
		//Which speak method gets called?
		//Why?
		
		//4. Now here's the kicker we can also create a monster object of type zombie.
		//Create a monster m2 that is a new Zombie
     	Monster m2= new Zombie();
		Monster m3= new Goblin();
		Werewolf m4= new Werewolf();
		Monster m6= new KomodoDragon();
		
		Monster []mArr = new Monster[5];
		mArr[0]= m1;
		mArr[1]= m2;
		mArr[2]= m3;
		//mArr[4]= new Zombie();
		mArr[3]= m4;
		mArr[4]= m6;
		
		for(Monster temp: mArr){
			temp.speak();
		}
		/*m2.speak();
		m2=m3;
		m2.speak();*/
		
		//m2 "is a" monster and "is a" specific monster at the same time *Mind Blown*
		
		
		//Which method is called when the program executes?
		
		
		//5. Remove the speak method from Monster and try again
		
		//What does this mean?
		
		//6. Type cast m2 as a Zombie and try again.
		
	
		//How does this apply to your current lab?
		
			
		//How can polymorphism be useful? The first thing is we can create polymorphic arrays
		
		
		//7. Create an array of type Monsters that can hold up to 3 Monsters
		//Place m2 at index 0; place a new Goblin at position 1; and place a new Werewolf
		//at position 2. 
		
		
		//Now we can call each element within the array using an 
		//enhanced for loop and watch what happens.
		
		
		//How could we have used this with the weapons?
		
		//8. Even if we want to use the method within the subclass we still need it in the 
		//super class, but it doesn't matter what's in the method body of the super class.
		//Remove the speak body and notice it doesn't matter. 
		
		//9. Now make Monster an abstract class by placing the key word "abstract" 
		//after public. Then, try to create an instance of Monster. 
		
		//What happened? 
		//How is this useful?
		//What is an abstract class then?
		//What is a concrete class?
		
		//10. Make the speak method in Monster abstract.
		/*Zombie z1= new Zombie();
		z1.speak();*/
		//What error messages does this cause?
		//An abstract method may not have?
		//An abstract class may or may not have?
		
		//11. Fix the errors caused by making the method abstract, but then remove the 
		//speak method from a monster and recompile. 
		
		//What error messages does this cause?
		//Making a method abstract causes what?
		//How is this useful?
		
		//Instanceof
		//12. Explore the following code. 
		
		Monster m5 = new Goblin(); 
		System.out.println(m5 instanceof Goblin);
		System.out.println(m5 instanceof Monster);
		System.out.println(m5 instanceof Zombie);
		
		System.out.println(m6 instanceof Werewolf);
		System.out.println(m6 instanceof Monster);
		System.out.println(m6 instanceof KomodoDragon);
		
		//What does "instanceof" do?
		
		
		//final methods/classes
		//13. Switch back to using Monster as just a class, declare the speak method final 
		//and watch what happens. 
		
		//14. Undo that. Then, declare the class itself as final and watch what happens. 
		
		//Declaring a method as final does what?
		//Declaring a class as final does what?
		
	}
}