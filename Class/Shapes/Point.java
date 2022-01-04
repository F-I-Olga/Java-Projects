//Olga Ingabire

public class Point{
	private int x=0;
	private int y=0;
	
	public void setX(int x){
		this.x=x;
	}
	
	public void setY(int y){
		this.y=y;
	}
	
	public int getX(){
		return x;
	}
	
	public int getY(){
		return y;
	}
	
	public Point(){
		
		x=0;
		y=0;
	}
	
	public Point(int x, int y){
		
		this.x = x;
		this.y = y;
	}
	
    public void printPoint(){
	    System.out.println("x= "+x+ "\ny ="+ y);
	}
	
    public void printPoint(Point p1){
		System.out.println("x= "+x+ "\ny ="+ y);
	}
	
	public static boolean isEqual(Point p1, Point p2){
		return (p1.getX()== p2.getX() &&  p2.getY()== p1.getY());
	}
	
	public boolean isEqual(Point p1){
		return (p1.getX()== x &&  p1.getY()== y);
	}
}




