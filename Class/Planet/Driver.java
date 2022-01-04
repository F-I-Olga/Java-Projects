//Interface Demo Code 2
//Dr. G
//11-5-19
//Planet Driver

//1. Start with PlanetCalculations

import java.util.Scanner;

public class Driver
{

	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);

		double distance = 0;
		double mass = 0;
		double currentCal = 0;
		int lifts;
		final double CALCONST = 0.2390057361;
		double total = 0;
		
		System.out.println("Please make planet selection in all caps");
		//8. Create a planet p1 using a string
		
		System.out.println("Enter distance of benchpress in meters\n");
		distance = sc.nextDouble();
		System.out.println("Enter benchpress weight in kilograms\n");
		mass = sc.nextDouble();
		currentCal = mass * p1.gravity * distance * CALCONST;
		
		System.out.println("Enter number of lifts\n");
		lifts = sc.nextInt();
		total = lifts * currentCal;
		//9. add the name of the planet at the end of the string, but get it based on the 
		//the current gravity amount
		System.out.println("Calories burned = " + total + " on " );
		
	}
}