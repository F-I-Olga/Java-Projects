/*
* Olga Ingabire
* Rutijana Cedric
*/
public class Alarm{
	
	private int hr= 4;
	private int min= 30;
	private int sec= 25;
	
	public void sethour(int d){
		if(d>10){
			hr= 2;
		}
		else
			hr=d;
	}
	
	public void setminute(int e){
		if(e>30){
			min= 15;
		}
		else
			min=e;
	}
	
	public void setsecond(int f){
		if(f<25){
			sec= 30;
		}
		else
			sec=f;
	}
	
	public int gethour(){
		return hr;
	}
	public int getminute(){
		return min;
	}
	public int getsecond(){
		return sec;
	}
	public void showtime(){
		System.out.println("The Alarm is set for "+gethour()+":"+getminute()+":"+getsecond());
		
	}
	
	public Alarm(){
		
	}
	
	public Alarm(int h, int m, int s){
		//System.out.println("New alarm set");
		
		sethour(h);
		setminute(m);
		setsecond(s);
	}
	
	
}