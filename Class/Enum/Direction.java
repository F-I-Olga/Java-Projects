//OLGA INGABIRE

import java.util.Scanner;

public class Direction
{
	
	enum direction{NORTH, SOUTH, EAST, WEST}
	public static void main(String [] args)
	{
	
		direction dir = direction.NORTH;
		int [] ray = new int[2];
		
		boolean go = true;
		boolean work= true;
		
		ray[0]=0;
		ray[1]=0;
		
		Scanner scn = new Scanner(System.in);
		
		do{
			System.out.println("Enter 'N' for North, 'S' for South, 'E' for East, 'W' for West, and 'Q' for Quit.\n The program is case sensitive please input only upper case letters.");
		    char dirct = scn.next().charAt(0);
			switch(dirct){	
			    case 'N':  
			    dir= direction.NORTH;
				work= true;
				
			    break;
			
			    case 'S':  
			    dir= direction.SOUTH;
				work= true;
				
			    break;
			
			    case 'W':  
			    dir= direction.WEST;
				work= true;
			
			    break;
			
			    case 'E':  
			    dir= direction.EAST;
				work= true;
			
			    break;
			
			    case 'Q':  
			    System.out.println("Take care");
				go=false;
				work=false;
			    break;
			
			   default:
			   System.out.println("Wrong input");
			   work=false;
			
		    }
			if (work == true){
				Moving(ray,dir);
			}
			
		    
		}while(go);
		
	}
	
	public static void Moving(int [] array, direction movt){
		switch(movt){
			case NORTH:
			array[0]+= 0;
			array[1]+= 13;
			
			System.out.println("Movement Direction " +movt+ "\n X= "+ array[0] +"\n Y= "+ array[1]);
			break;
			
			case SOUTH:
			array[0]+= 0;
			array[1]-= 13;
			
			System.out.println("Movement Direction " +movt+ "\n X= "+ array[0] +"\n Y= "+ array[1]);
			break;
			
			case WEST:
			array[0]-= 13;
			array[1]+= 0;
			
			System.out.println("Movement Direction " +movt+ "\n X= "+ array[0] +"\n Y= "+ array[1]);
			break;
			
			case EAST:
			array[0]+= 13;
			array[1]+= 0;
			
			System.out.println("Movement Direction " +movt+ "\n X= "+ array[0] +"\n Y= "+ array[1]);
			break;
			
			default:
			array[0]= 0;
			array[1]=0;
		}
	}

}

