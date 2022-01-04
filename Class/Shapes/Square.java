//Olga Ingabire

public class Square
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
