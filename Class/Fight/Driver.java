//Olga Ingabire

import java.util.Random; 
import java.util.Scanner;

public class Driver
{
	public static void main(String[]args)
	{
		String char_Name;
		int char_Hitpoint, rand1= 0;
		int char_Strength, g1=0, g2=0, g3=0;
		char choice1, att1, att2, att3;
		int kick1, punch1;
		int kick2, punch2;
		int kick3, punch3;
		boolean keep=true;
		int h1=0, h2=0, h3=0;
		
		Random takedamage = new Random();


		
		Character Player1= new Character("Intare");
		Character Player2= new Character();
		Character Player3= new Character("Imbwa", 9, 70);
		
		Scanner scn= new Scanner(System.in);
		
		
		System.out.println("Welcome to Fight Club, we only have two rules:");
		System.out.println("1. YOU DON'T TALK ABOUT FIGHT CLUB");
		System.out.println("2. The fight only ends someone dies.");
		System.out.println("Enjoy :) ");
		System.out.println(" ");
		System.out.println("Choose your character:");
		System.out.println("a. Character "+Player1.getName());
		System.out.println(" Hitpoint: "+Player1.getHitpoints()+" Strength: "+Player1.getStrength());
		System.out.println(" ");
		System.out.println("b. Character "+Player2.getName());
		System.out.println(" Hitpoint: "+Player2.getHitpoints()+" Strength:"+Player2.getStrength());
		System.out.println(" ");
		System.out.println("c. Character "+Player3.getName());
		System.out.println(" Hitpoint: "+Player3.getHitpoints()+" Strength:"+Player3.getStrength());
		System.out.println(" ");
		System.out.println("Choose a, b, or c");
		choice1 = scn.next().charAt(0);
		
		if(choice1=='a'|| choice1=='A'){
			System.out.println(Player1.getName()+" Vs "+Player3.getName());
			System.out.println("You will each get turns, your move choices are kick and punch ");
			System.out.println("Type 'k' for Kicking");
			System.out.println("Type 'p' for Punching");
			System.out.println("Begin ");
			do{
			    System.out.println(Player1.getName()+" type 'k' for Kicking or type 'p' for Punching");
				att1= scn.next().charAt(0);
				//no kick power and punch power it is the same as hitpoint
				System.out.println(" ");
				
				if(att1 == 'k' || att1 == 'K'){
					kick1=Player3.getHitpoints()-Player1.getKickPower();
					Player3.setHitpoints(kick1);
					g3= Player3.getStrength()-takedamage.nextInt(5);
					
					Player3.setStrength(g3);
				
					punch3=Player1.getHitpoints()-Player3.getPunchPower();
					Player1.setHitpoints(punch3);
					g1= Player1.getStrength()-takedamage.nextInt(5);
					
					
					Player1.setStrength(g1);
					
					Player1.setAlive();
					Player3.setAlive();
					
					if(g1<0 || g3<0){
						break;
					}
					
					Player1.showStats();
					System.out.println(" ");
					Player3.showStats();
					
				}
				else if (att1 == 'P' || att1 == 'p'){
					punch1=Player3.getHitpoints()-Player1.getPunchPower();
					Player3.setHitpoints(punch1);
					g3= Player3.getStrength()-takedamage.nextInt(5);
					Player3.setStrength(g3);
					
					kick3=Player1.getHitpoints()-Player3.getKickPower();
					Player1.setHitpoints(kick3);
					g1= Player1.getStrength()-takedamage.nextInt(5);
					Player1.setStrength(g1);
					
					Player1.setAlive();
					Player3.setAlive();
					
					if(g1<0 || g3<0){
						break;
					}
					else if(g3<-1 || g1<-1){
						break;
					}
					
					Player1.showStats();
					System.out.println(" ");
					Player3.showStats();
					
					
				}
				
				
				
			}while(keep == true); //Player1.getAlive()== true || Player3.getAlive()== true
			
			if(g1>g3){
				System.out.println("Game Over, Final Results:");
				Player1.showStats();
				System.out.println(" ");
				Player3.showStats();
				System.out.println(Player1.getName()+" is the winner");
			}
			else if(g3>g1){
				System.out.println("Game Over, Final Results:");
				Player1.showStats();
				System.out.println(" ");
				Player3.showStats();
				System.out.println("Game Over " +Player3.getName()+" is the winner");
			}
			else if(g3==g1){
				if(h1>h3){
				System.out.println("Game Over, Final Results:");
				Player1.showStats();
				System.out.println(" ");
				Player3.showStats();
				System.out.println(Player1.getName()+" is the winner");
				}
				else if(h3>h1){
				System.out.println("Game Over, Final Results:");
				Player1.showStats();
				System.out.println(" ");
				Player3.showStats();
				System.out.println(Player3.getName()+" is the winner");
				}
			}
		}
		else if (choice1=='b' || choice1=='B'){
			System.out.println(Player2.getName()+" Vs "+Player1.getName());
			System.out.println("You will each get turns, your move choices are kick and punch ");
			System.out.println("Type 'k' for Kicking");
			System.out.println("Type 'p' for Punching");
			System.out.println("Begin ");
			do{
			    System.out.println(Player2.getName()+" type 'k' for Kicking or type 'p' for Punching");
				att2= scn.next().charAt(0);
				//no kick power and punch power it is the same as hitpoint
				System.out.println(" ");
				
				if(att2 == 'k' || att2 == 'K'){
					kick2=Player1.getHitpoints()-Player2.getKickPower();
					Player1.setHitpoints(kick2);
					g1= Player1.getStrength()-takedamage.nextInt(5);
					Player1.setStrength(g1);
					
					punch1=Player2.getHitpoints()-Player1.getPunchPower();
					Player2.setHitpoints(punch1);
					g2= Player2.getStrength()-takedamage.nextInt(5);
					Player2.setStrength(g2);
					
					Player1.setAlive();
					Player2.setAlive();
					
					if(g1<0 || g2<0){
						break;
					}
					
					
					Player2.showStats();
					System.out.println(" ");
					Player1.showStats();
					
				}
				else if (att2 == 'P' || att2 == 'p'){
					punch2=Player1.getHitpoints()-Player2.getPunchPower();
					Player1.setHitpoints(punch2);
					
					g1= Player1.getStrength()-takedamage.nextInt(5);
					Player1.setStrength(g1);
					
					kick1=Player2.getHitpoints()-Player1.getKickPower();
					Player2.setHitpoints(kick1);
					g2= Player2.getStrength()-takedamage.nextInt(5);
					Player2.setStrength(g2);
					
					Player1.setAlive();
					Player2.setAlive();
					
					if(g1<0 || g2<0){
						break;
					}
					else if(g1<-1 || g2<-1){
						break;
					}
					
					Player2.showStats();
					System.out.println(" ");
					Player1.showStats();
					
				}
				
				
			}while(keep == true);
			
			if(g2>g1){
				System.out.println("Game Over, Final Results:");
				Player1.showStats();
				System.out.println(" ");
				Player2.showStats();
				System.out.println(Player2.getName()+" is the winner");
			}
			else if(g1>g2){
				System.out.println("Game Over, Final Results:");
				Player1.showStats();
				System.out.println(" ");
				Player2.showStats();
				System.out.println(Player1.getName()+" is the winner");
			}
			else if(g1==g2){
				if(h1>h3){
				System.out.println("Game Over, Final Results:");
				Player2.showStats();
				System.out.println(" ");
				Player1.showStats();
				System.out.println(Player2.getName()+" is the winner");
				}
				else if(h1>h2){
				System.out.println("Game Over, Final Results:");
				Player2.showStats();
				System.out.println(" ");
				Player1.showStats();
				System.out.println(Player1.getName()+" is the winner");
				}
			}
			
		}
		else if (choice1=='c'|| choice1=='C'){
			System.out.println(Player3.getName()+" Vs "+Player2.getName());
			System.out.println("You will each get turns, your move choices are kick and punch ");
			System.out.println("Type 'k' for Kicking");
			System.out.println("Type 'p' for Punching");
			System.out.println("Begin ");
			do{
			    System.out.println(Player3.getName()+" type 'k' for Kicking or type 'p' for Punching");
				att3= scn.next().charAt(0);
				//no kick power and punch power it is the same as hitpoint
				System.out.println(" ");
				
				if(att3 == 'k' || att3 == 'K'){
					kick3=Player2.getHitpoints()-Player3.getKickPower();
					Player2.setHitpoints(kick3);
					g2= Player2.getStrength()-takedamage.nextInt(5);;
					Player2.setStrength(g2);
					
					punch2=Player3.getHitpoints()-Player2.getPunchPower();
					Player3.setHitpoints(punch2);
					g3= Player3.getStrength()-takedamage.nextInt(5);;
					Player3.setStrength(g3);
					
					Player2.setAlive();
					Player3.setAlive();
					
					if(g2<-1 || g3<-1){
						break;
					}
					
					Player3.showStats();
					System.out.println(" ");
					Player2.showStats();
					
					
				}
				else if (att3 == 'P' || att3 == 'p'){
					punch3=Player2.getHitpoints()-Player3.getPunchPower();
					Player2.setHitpoints(punch3);
					g2= Player2.getStrength()-takedamage.nextInt(5);;
					Player2.setStrength(g2);
					
					kick2=Player3.getHitpoints()-Player2.getKickPower();
					Player3.setHitpoints(kick2);
					g3= Player3.getStrength()-takedamage.nextInt(5);
					Player3.setStrength(g3);
					
					Player2.setAlive();
					Player3.setAlive();
					
					h2= Player2.getHitpoints();
				    h3= Player3.getHitpoints();
					
					if(g2<-1 || g3<-1){
						break;
					}
					else if(g3<-1 || g2<-1){
						break;
					}
					
					Player3.showStats();
					System.out.println(" ");
					Player2.showStats();
					
					
				}
				
				h2= Player2.getHitpoints();
				h3= Player3.getHitpoints();
				
				
			}while(keep == true);
			
			if(g2>g3){
				System.out.println("Game Over, Final Results:");
				Player3.setStrength(g3);
				Player2.setStrength(g2);
				Player2.showStats();
				System.out.println(" ");
				Player3.showStats();
				System.out.println(Player2.getName()+" is the winner");
			}
			else if(g3>g2){
				System.out.println("Game Over, Final Results:");
				Player3.setStrength(g3);
				Player2.setStrength(g2);
				Player2.showStats();
				System.out.println(" ");
				Player3.showStats();
				System.out.println(Player3.getName()+" is the winner");
			}
			
			else if(g3==g2){
				if(h2>h3){
				System.out.println("Game Over, Final Results:");
				Player2.showStats();
				System.out.println(" ");
				Player3.showStats();
				System.out.println(Player2.getName()+" is the winner");
				}
				else if(h3>h2){
				System.out.println("Game Over, Final Results:");
				Player2.showStats();
				System.out.println(" ");
				Player3.showStats();
				System.out.println(Player3.getName()+" is the winner");
				}
			}
		}
		else{
			System.out.println("Wrong input, the computer will choose a character for you.");
		}
		

	}
	
}

