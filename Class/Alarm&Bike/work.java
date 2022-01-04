/*
* Olga Ingabire
* Rutijana Cedric
*/
public class work{
	public static void main(String []args){
		Bike b1= new Bike();
		Bike b2= new Bike(6000, 7000, 900);
		Alarm a1= new Alarm();
		Alarm a2= new Alarm(7, 50, 00);
		
		System.out.println("The old Alarm setting:");
		a1.showtime();
		
		System.out.println(" ");
		
		System.out.println("The new Alarm setting:");
		a2.showtime();
		
		System.out.println(" ");
		
		System.out.println("The old prices are:");
		b1.showcosts();
		
		System.out.println(" ");
		
		System.out.println("The new prices are:");
		b2.showcosts();
	}
}