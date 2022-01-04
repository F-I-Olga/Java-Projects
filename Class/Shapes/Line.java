//Olga Ingabire
import java.lang.*;
public class Line
{
	private Point p1;
	private Point p2;
	
	public void setP1(Point p1){
		this.p1 = p1;
	}
	public void setP2(Point p2){
		this.p2 = p2;
	}
	public Point getP1(){
		return p1;
	}
	public Point getP2(){
		return p2;
	}
    
	public void printHorLine (Point p1, Point p2){
		
		int BoundX= p2.getX();
		int x=p1.getX(), y=p1.getY();
		
		//System.out.println("The coordinates of the Horizontal line are:");
		for(int i=x; i <= BoundX; i++){
			System.out.println("x= "+i+", y= "+y);
		}
		
	}
	
	public void printVertLine(Point p1, Point p2){
		int BoundY=p2.getY();
		int x=p1.getX(), y=p1.getY();
		
		//System.out.println("The coordinates of the vertical line are:");
		for(int j=y; j <= BoundY; j++){
			System.out.println("x= "+x+", y= "+j);
			//System.out.println("x= "+BoundX+", y= "+BoundY);
		
		}
	}
	
	public double LineLength(Point p1,Point p2){
		int x1=p1.getX(),x2=p2.getX(),y1=p1.getY(),y2=p1.getY();
	    double dis;
		
	    //dis=Math.sqrt(*(x2-x1) + (y2-y1)*(y2-y1));	
	    dis= Math.sqrt(Math.pow((x2-x1), 2)+Math.pow((y2-y1), 2));
		return dis;
	}
	
	public static double LineLength1(Point p1,Point p2){
		
	    double dis;
		
        dis= Math.sqrt(Math.pow((p2.getX()-p1.getX()), 2)+Math.pow((p2.getY()-p1.getY()), 2));
		return dis;
	}
	
	public boolean isLine(Point p1,Point p2){
		boolean det= true;
		
		if(LineLength(p1,p2)== 0){
			det= false;
		}
		
		return det;
	}
	
	public static boolean isLine1(Point p1,Point p2){
		boolean det= true;
		
		
		
		if(LineLength1(p1,p2)== 0){
			det= false;
		}
		
		return det;
	}
	
	public Line(){
		p1 = getP1();
		p2 = getP2();
	}
	public Line(Point p1, Point p2){
		this.p1=p1;
		this.p2=p2;
	}
}