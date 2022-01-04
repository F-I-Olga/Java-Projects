//Game driver for testing inheritance demonstration files
//Dr. G
//10-5-18
//Edited 2-17-19
//Edited 2-27-20


//Now let's test our set up so far

import java.security.SecureRandom;
import java.util.*;

public class GameDriver
{
	public static void main(String [] args)
	{
		
		//We are going to create a test fight scenario involving a hero and a bad guy
		
		//Add the ability to take damage and to heal to our hero and bad guy
		
		//Create a Hero with strength 10 and hit points 100
		Hero h1= new Hero("Olga", 10,250);
		
		//Create 3 Bad guys with strength 5 and hit points 200
		Baddy b1= new Baddy("Cedric1",15,200);
		//Create a fight function that accepts a hero and a bad guy let them fight it out
		
		fight(h1,b1);
		
	}
	
	public static void fight(Hero sentHero, Baddy sentBaddy)
	{
		PoisonDagger w1= new PoisonDagger();
		GunDown w2= new GunDown();
		KatanaSword w3= new KatanaSword();
		SecureRandom sc= new SecureRandom();
	
		//Battle until the bad guys hit points are 0 or lower
		while (sentHero.isAlive() && sentBaddy.isAlive())
		{
			Scanner scn= new Scanner(System.in);
		    System.out.println("Choose an attack option");
		    System.out.println("1. No Weapon Attack");
		    System.out.println("2. Weapon Attack");
		    System.out.println("3. Special Weapon Attack");
		    int g= scn.nextInt();
		
		    switch(g){
			    case 1:
			    //Hero attacks
			    sentBaddy.takeDamage(sentHero.attack());
			
			    //bad guy attack if it is still alive
			    if (sentBaddy.isAlive())
			   {
				    sentHero.takeDamage(sentBaddy.attack());
			   }
			   sentHero.showStats();
			   sentBaddy.showStats();
			   break;
			
			   case 2:
			   System.out.println("Choose Your weapon");
			   System.out.println("1. Gun \nStrength: "+ w2.getWStrength()+"\nDurability: "+w2.getWDurability());
			   System.out.println("2. Katana\nStrength: "+ w3.getWStrength()+"\nDurability: "+w3.getWDurability());
			   int l= scn.nextInt();
			   if(l==1){
				   int AttackValue= sentHero.getHitPoints()+w2.getWStrength();
				    //Hero attacks
			        sentBaddy.takeDamage(sentHero.Weaponattack(AttackValue));
			        //bad guy attack if it is still alive
			        if (sentBaddy.isAlive())
			        {
				        sentHero.takeDamage(sentBaddy.attack());
			        }
					sentHero.showStats();
					sentBaddy.showStats();
			    }
			    else if(l==2){
			      	int AttackValue= sentHero.getHitPoints()+w3.getWStrength();
				    //Hero attacks
			        sentBaddy.takeDamage(sentHero.Weaponattack(AttackValue));
			        //bad guy attack if it is still alive
			        if (sentBaddy.isAlive())
			        {
			    	    sentHero.takeDamage(sentBaddy.attack());
			        }
					sentHero.showStats();
				    sentBaddy.showStats();
			    }
			    else{
			    	System.out.println("Wrong choice. Please select Weapon 1 or 2");
			    }
			    break;
			    case 3:
			    int  AttackValue= sentHero.getHitPoints()+w1.getWStrength();
				//Hero attacks
			    sentBaddy.takeDamage(sentHero.Weaponattack(AttackValue));
			    //bad guy attack if it is still alive
			    if (sentBaddy.isAlive())
			    {
				    sentHero.takeDamage(sentBaddy.attack());
			    }
				sentHero.showStats();
				sentBaddy.showStats();
			    break;
				
			    default:
			    System.out.println("Wrong choice. Please select Attack 1 or 2 or 3");
		    }
		}
		
		//show the outcome of the battle
		if(sentHero.isAlive()) 
		{
			System.out.println("Hero won");
			sentHero.showStats();
		}
		else
		{
			System.out.println("Bad Guy won");
		}	
	}
	
}