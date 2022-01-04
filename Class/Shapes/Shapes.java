//Olga Ingabire

import java.lang.*;
public class Shapes{
private class Point{
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



//Olga Ingabire

private class Line
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



//Olga Ingabire

private class Square
{
	private Point p1;
	private Point p2;
	private Line l1;
	private Line l2;
	private Line l3;
	private Line l4;
	
	public void setSide1(Line l1){
		this.l1 = l1;
	}
	public void setSide2(Line l2){
		this.l2 = l2;
	}
	public void setSide3(Line l3){
		this.l3 = l3;
	}
	public void setSide4(Line l4){
		this.l4 = l4;
	}
	
	public Line getSide1(){
		return l1;
	}
	public Line getSide2(){
		return l2;
	}
	public Line getSide3(){
		return l3;
	}
	public Line getSide4(){
		return l4;
	}
	
	public void printSide1(Point p1, Point p2){
		//System.out.println("The coordinates of the First side are:");
		l1.printHorLine(p1,p2);
		
	}
	
	public void printSide2(Point p1, Point p2){
		//System.out.println("The coordinates of the Second side are:");
		l2.printVertLine(p1,p2);
		
	}
	public void printSide3(Point p1, Point p2){
		//System.out.println("The coordinates of the Third side are:");
		l3.printHorLine(p1,p2);
		
	}
	public void printSide4(Point p1, Point p2){
		//System.out.println("The coordinates of the Fourth side are:");
		l4.printVertLine(p1,p2);
		
	}
	
	public boolean isSquare(double l1, double l2, double l3, double l4){
		boolean isSide= false;
		if((l2==l4)&&(l1==l3)){
			isSide=true;
		}
		
		
		return isSide;
	}
	
	public static boolean isSquare1(double l1, double l2, double l3, double l4){
		boolean isSide= false;
		if((l2==l4)&&(l1==l3)){
			isSide=true;
		}
		
		
		return isSide;
	}
	
	public double getArea(double l, double w){
		return(l*w);
	}
	
	public Square(){
		l1 = getSide1();
		l2 = getSide2();
		l3 = getSide3();
		l4 = getSide4();
	}
	public Square(Line l1, Line l2, Line l3, Line l4){
		this.l1=l1;
		this.l2=l2;
		this.l3=l3;
		this.l4=l4;
	}
}

}
