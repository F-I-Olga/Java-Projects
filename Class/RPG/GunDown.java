//OLGA INGABIRE
import java.security.SecureRandom;
public class GunDown extends Weapon {
	private int GDs= 43;
	private int GDd= 10;
	public int getWDurability(){
		return GDd;
	}
	public int getWStrength(){
		return GDs;
	}
	public void holes(){
		do{

			basicAttack(GDs);
			GDd--;
		}while(GDd>0);
	}
}