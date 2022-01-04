//Interface Demo Code 2
//Dr. G
//11-5-19
//PlanetCalculations template

/*
An interface can have static variables, static methods, default methods, and abstract methods.
This PlanetCaluclations interface holds gravity constants for all planets
What would it be good for?
*/

public interface PlanetCalculations
{
	//all variables are public static by default
	//Could you make a non-static variable then?
	double SUN     	=	274.00;
	double JUPITER 	=  	24.92;
	double NEPTUNE 	=	11.15;
	double SATURN	=  	10.44;
	double EARTH	=  	9.798;
	double URANUS 	=	8.87;
	double VENUS	=  	8.87;
	double MARS	 	=  	3.71;
	double MERCURY 	=	3.7;
	double MOON	 	=  	1.62;
	double PLUTO	=  	0.58;

	//You can have static methods
	//Create a method that will return a gravity amount given a planet string
	//Example: PlanetCalculation.getGravity("sun");
	//What is the advantage of setting it up this way?
	public static double getGravity(String planet)
	{
		if (planet.equals("SUN")) 		return 	SUN;
		if (planet.equals("JUPITER")) 	return	JUPITER;
		if (planet.equals("NEPTUNE")) 	return 	NEPTUNE;
		if (planet.equals("SATURN")) 	return 	SATURN;
		if (planet.equals("EARTH")) 	return 	EARTH;
		if (planet.equals("URANUS")) 	return 	URANUS;
		if (planet.equals("VENUS")) 	return 	VENUS;
		if (planet.equals("MARS")) 		return 	MARS;
		if (planet.equals("MERCURY")) 	return 	MERCURY;
		if (planet.equals("MOON")) 		return 	MOON;
		if (planet.equals("PLUTO")) 	return 	PLUTO;
		else return -1;
	}

	//You can have default methods, but you have to declare it as default.
	//Create a default method that will print the planet name given a gravity amount
	//What is the difference in this and a static method?
	default String getPlanetByGravity(double gravity)
	{
		if (gravity == SUN) 	return "SUN";
		if (gravity == JUPITER) return "JUPITER";
		if (gravity == NEPTUNE) return "NEPTUNE";
		if (gravity == SATURN) 	return "SATURN";
		if (gravity == EARTH) 	return "EARTH";
		if (gravity == URANUS) 	return "URANUS";
		if (gravity == VENUS) 	return "VENUS";
		if (gravity == MARS) 	return "MARS";
		if (gravity == MERCURY) return "MERCURY";
		if (gravity == MOON) 	return "MOON";
		if (gravity == PLUTO)	return "PLUTO";
		else return null;
	} 
	
	//You can have abstract methods as well
	//Make sure that everything that implements this interface has a set gravity method
	public void setGravity(String planet);
	
	//Can you have regular methods?
	//public void printSomething(){System.out.println("Something");}
	//What would the above be if it was in an abstract class?
	
	//2. Go take a look at CelestialBody
}