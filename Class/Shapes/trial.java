public class trial{
	public static void main (String[] args){
		int BoundX= 5, BoundY=5;
		int x=1, y=1;
		
		System.out.println("The coordinates of the horizontal line are:");
		for(int i=x; i <= BoundX; i++){
			System.out.println("x= "+i+", y= "+y);
		}
		
		System.out.println("The coordinates of the vertical line are:");
		for(int j=y; j <= BoundY; j++){
			System.out.println("x= "+x+", y= "+j);
			//y++;
		}
		
		System.out.println("The coordinates of the Square are:");
		for(int i=x; i <= BoundX; i++){
			System.out.println("x= "+i+", y= "+y);
		}
		
		for(int h=BoundX; h>= x; h--){
			System.out.println("x= "+h+", y= "+BoundY);
		}
		
		for(int j=y; j < BoundY; j++){
			System.out.println("x= "+x+", y= "+j);
		}
		
		for(int k=BoundY; k >= y; k--){
			System.out.println("x= "+BoundX+", y= "+k);
		}
		
		Point p1= new Point(3,8);
		Point p2= new Point(8,15);
		
		
		
	}
}