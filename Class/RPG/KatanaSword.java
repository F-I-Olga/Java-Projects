//OLGA INGABIRE
import java.security.SecureRandom;
public class KatanaSword extends Weapon {
	private int KSs= 32;
	private int KSd= 27;
	public int getWDurability(){
		return KSd;
	}
	public int getWStrength(){
		return KSs;
	}
	public void cut(){
		do{
			basicAttack(KSs);
			KSd-=3;
		}while(KSd>0);
	}
}