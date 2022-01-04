/*
* Olga Ingabire
* Rutijana Cedric
*/
public class Bike{
	
	private int Initial_cost= 4500;
	private int Repair_cost= 2500;
	private int Maintenance_cost= 300;
	
	public void setInitial_cost(int d){
		if(d<4500){
			Initial_cost= 5000;
		}
		else
			Initial_cost=d;
	}
	
	public void setRepair_cost(int e){
		if(e<2500){
			Repair_cost= 3000;
		}
		else
			Repair_cost=e;
	}
	
	public void setMaintenance_cost(int f){
		if(f<300){
			Maintenance_cost= 500;
		}
		else
			Maintenance_cost=f;
	}
	
	public int getInitial_cost(){
		return Initial_cost;
	}
	public int getRepair_cost(){
		return Repair_cost;
	}
	public int getMaintenance_cost(){
		return Maintenance_cost;
	}
	public void showcosts(){
		System.out.println("The initial cost is "+getInitial_cost());
		System.out.println("The Repair_cost is "+getRepair_cost());
		System.out.println("The Maintenance_cost is "+getMaintenance_cost());
	}
	
	public Bike(){
      //showcosts(); shows results twice.
	}
	
	public Bike(int I_cost, int R_cost, int M_cost){
		//System.out.println("Price Created");
		setInitial_cost(I_cost);
		setRepair_cost(R_cost);
		setMaintenance_cost(M_cost);
	}
	
}