//Quick demonstration for enum type
//Created 3-5-20
//-Dr. G

//enum is a special type of class that groups together constant values to make your code
//more readable. They do not add any functionality, but can add readability. 

//My main purpose in introducing them is to make sure you recognize them in other code and
//provide you with another tool you can use if you choose. 

import java.util.Scanner;

public class EnumDemo
{
	
		//Let's create a system of classifications for users on our system. This
		//classification can determine their access to certain parts of our application. 
	
	//1. Create an enum type called Level that has values "LOW", "MEDIUM", AND "HIGH."
	// Why create it here instead of in main?
	
	enum LEVEL{LOW, MEDIUM, HIGH}
	public static void main(String [] args)
	{
		//2. Create an enum variable to hold the value of your user. 
		
		LEVEL level;

		//3. Request the level of access from the prompt in the form of 1. for high; 2. for medium; or three for low
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter name");
		String name = sc.next();
		System.out.println("Please enter access level 1, 2, or 3");
		int selection = sc.nextInt();
		
		
		switch(selection)
		{	
			case 1:  
			level= LEVEL.LOW;
			break;
			case 2:  
			level= LEVEL.MEDIUM;
			break;
			case 3: 
			level= LEVEL.HIGH;
			break;
			default: 
			level= LEVEL.LOW;
		}
		
		
		//4. Create a user with this level of access
		
		User u1 = new User(name, level);
		
		//5. Print the level of access based on the created user's set access
		
		System.out.println("Attempting to grang access to " + u1.getName());
		
		
		switch(u1.getLevel())
		{	
			case HIGH :
			System.out.println("maximum access granted");
			break;
			case MEDIUM: 
			System.out.println("mid access granted");
			break;
			default: 
			System.out.println("minimal access granted");
		}
		
	}
	
	//I'm placing this class inside of the Enum class. 
	//Surprise this is something you can do. :)
	//You likely want to declare the class static though.
	//At this level don't worry about why. Just know it works.
	static class User
	{
		private String name;
        private LEVEL level;		
		
		public User()
		{
			name = "Bob";
		}
		
		
		public User(String name, LEVEL level)
		{
			this.name = name;
			this.level = level;
		}
		
		
		public  LEVEL getLevel(){
			return level ;
		}
		
		public String getName() {
			return name;
			}
	}
}

