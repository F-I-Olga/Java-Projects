package work12;
import java.util.Scanner;
public class work12 {
	public static void main(String[] args) {
		Scanner ced=new Scanner(System.in);
		int count1=0;
		int count2=0;
		boolean winner= false;
		boolean turn=true;
		
		System.out.println("Enter player 1's name");
		String player1=ced.next();
		
	
		
while(count1<22 && count2< 22){
			
			System.out.println(player1+"Choose a number between 0-20");
			int p1= ced.nextInt();
			count1= count1+p1;
				
			count2= count2+((int)Math.floor(Math.random()*20));
				
		}
		

		if(count2>21){
			System.out.println("The computer lost with "+count2+" points");
			System.out.println("Winner Winner Chicken Diner");
		}
		else if(count1==21){
			System.out.println("Winner Winner Chicken Diner");
			System.out.println("You lost your total was "+count1+" points");
		}
		

}
}