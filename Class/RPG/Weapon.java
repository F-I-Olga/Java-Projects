//Olga Ingabire
import java.security.SecureRandom;
public class Weapon extends Thing{
	protected int W_Strength;
	protected int W_Durability;
	SecureRandom pts= new SecureRandom();
	
	public void setWDurability(int W_Durability){
		this.W_Durability= W_Durability;
	}
	public void setWStrength(int W_Strength){
		this.W_Strength= W_Strength;
	}
	
	
	public int basicAttack(int x){
		int a= pts.nextInt(x);
		return a;
    }
	
}