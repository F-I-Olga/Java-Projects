//Olga Ingabire

public class Character{
	private String Name ="Impyisi";
	private int strength=8;
	private int hitpoints=80;
	private boolean alive= true;
	private int kickPower = 7;
	private int punchPower= 9;
	
	
	public void setName(String Name){
	    this.Name=Name; // this.Name refers to the private one, Name is the variable in the class
	}
	
	
	public String getName(){
		return Name;
	}
	
	public void setHitpoints(int Hitpoints){
		if(Hitpoints > 0 && Hitpoints < 100){
			hitpoints = Hitpoints;
		}
		
		else if(Hitpoints < 1){
		    hitpoints = Hitpoints;
		}
		
		
	    
	}
	
	
	public int getHitpoints(){
		return hitpoints;
	}
 
	
	public void setStrength(int Strength){
		if(Strength>0 && Strength<11 ){
			strength=Strength;
		}
		

	}

	
	public int getStrength(){
		return strength;
	}
	
	public int getKickPower(){
		return kickPower;
	}
	
	public int getPunchPower(){
		return punchPower;
	}
	
	public void setAlive(){
		if(getStrength()<1){
			alive=false;
		}
	}
	
	public boolean getAlive(){
		return(alive);
	}
	
	public void showStats(){
		System.out.println("Name: "+Name);
		System.out.println("strength: "+strength);
		System.out.println("Hitpoints: " +hitpoints);
		System.out.println("Alive: "+alive);
		
	}
	

	public Character(String name){
		this.setName(name);

	    strength=5;
	    hitpoints=50;
	    alive= true;
		kickPower= 8;
		punchPower=5;
	}
	
	
	public Character(){
		getName();
		getStrength();
		getHitpoints();
		getKickPower();
		getPunchPower();
		getAlive();
	}
	
	public Character(String name, int Strength, int Hitpoints){
		setName(name);
		setHitpoints(Hitpoints);
		setStrength(Strength);
		kickPower= 4;
		punchPower=6;
		alive=true;
	}

	

	
}