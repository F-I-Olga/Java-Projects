//Ingabire Olga

public class Driver{
	public static void main(String[] args){
		Point p1= new Point(3,30);
		Point p2= new Point(33,30);
		Point p3= new Point(3,0);
	    Point p4= new Point(33,0);
		Line l1= new Line(p1,p2);
		Line l2= new Line(p2,p4);
		Line l3= new Line(p4,p3);
		Line l4= new Line(p3,p1);
		Square s1= new Square();
		Square s2= new Square(l1,l2,l3,l4);
		
		
		System.out.println("Do points p1 and p2 make a line?(Dynamic Method) \n"+l1.isLine(p1,p2));
		System.out.println(" ");
		System.out.println("Do points p3 and p4 make a line?(Static Method) \n"+l1.isLine1(p4,p3));
		System.out.println(" ");
		System.out.println("What is the length of line L1?(Dynamic Method) \n"+l1.LineLength(p1,p2)+" units");
		System.out.println(" ");
		System.out.println("What is the length of line L3?(Static Method) \n"+l3.LineLength1(p4,p3)+" units");
		System.out.println(" ");
		
		double a =l1.LineLength(p1,p2);
		double b =l2.LineLength1(p2,p4);
		double c =l3.LineLength(p4,p3);
		double d =l2.LineLength1(p3,p1);
		
		System.out.println("Do lines l1, l2, l3, and l4 form a square?(Dynamic Method) \n"+s2.isSquare(a,b,c,d));
		System.out.println(" ");
		System.out.println("Do lines l1, l2, l3, and l4 form a square?(Static Method) \n"+s2.isSquare1(a,b,c,d));
		System.out.println(" ");
		System.out.println("What is the area of the Square? \n"+s2.getArea(a,c)+" units");
		
		
		
	}
}