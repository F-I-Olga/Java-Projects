//OLGA INGABIRE
public class PoisonDagger extends Weapon {
	private int PDs= 64;
	private int PDd= 5;
	Hero h13= new Hero();
	int k=h13.getManna();
	public int getWDurability(){
		return PDd;
	}
	public int getWStrength(){
		return PDs;
	}
	public void die(){
		if(h13.getManna()>0){
			while (PDd<0){
				basicAttack(PDs);
			    PDd--;
				h13.setManna(k-=7);
			}
			
		}
		else{
			System.out.println("Hero lacks the strength to use this weapon");
		}
	}
}