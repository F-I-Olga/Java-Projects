//Interface Demo Code 2
//Dr. G
//11-5-19
//Any celestial body

public abstract class CelestialBody
{
	protected String name;
	protected double coordinates;
	
	
	//This is an abstract class what does this method do for you?
	//What is the equivalent in the interface?
	public void printBasic()
	{
		System.out.println(name);
		System.out.println(coordinates);
	}
	
	//What do these methods enforce?
	public abstract void setName(String name);
	public abstract void setCoordinates(double coordinates);
	public abstract String getName();
	public abstract double getCoordinates();
	
	//3. head over to planet
}