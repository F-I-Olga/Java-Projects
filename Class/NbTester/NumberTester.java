/**
 * 
 * Olga Ingabire 
 * 
 *
 */
import java.security.SecureRandom; 
public class NumberTester {


	public static void main(String[] args) {
		
	SecureRandom sr = new SecureRandom();
	
	int [] arr= new int [10];
	
	for (int x=0; x<arr.length; x++){
		arr[x] = sr.nextInt(200)-50;
	}

	
	testFindIntegerMax(arr);
	testAddAllPositiveIntsTogether(arr);
	testGetTheIntAverage(arr);
	testIsNegativeValue(arr);

		
		//Call all your test methods here.
		//Call only the "test" methods.
	}

	//This method will not be graded
	//This method will be demonstrated in class
	public static void testSimpleMethod(){	
	}

	//This method should return exactly what it was given
	//This method is not graded and will be demonstrated in class
	public static int simpleMethod(int i){
		return i;
	}
	
	//I would like you to write 3 test cases to see if findIntegerMax is working correctly
	public static void testFindIntegerMax(int []x){
		boolean max= true;
		int f= findIntegerMax(x);

		for(int i=0; i<x.length; i++){
		    if(f<x[i]){
				max= false;
			}		
		}
		
		if (max==true){
			System.out.println("Max value is: "+f);
		}
		else
		System.out.println("Error, the method doesn't work");
	}
	
	//This method should take an array of integers and return the max array value
	//Implement it with an enhanced for loop and don't use a built in array method
	public static int findIntegerMax(int []x){
		int maxn= -100;
		for(int h:x){
			if(h> maxn){
				maxn= h;
			}
		}
		return maxn;
	}
	

	//I would like you to write 4 test cases that would test and make sure the addAllPositiveIntsTogether works correctly
	public static void testAddAllPositiveIntsTogether(int []x){
		long b= addAllPositiveIntsTogether(x);
		long Psum=0;
		long Nsum=0;
		int []y= new int[x.length];
		
		for(int i=0; i<y.length; i++){
			if(x[i]>=0){
				y[i]=x[i];
		    }
			else{
		    	Nsum=Nsum+x[i];	
			}
			
		}
		
		for(int h:y){
			Psum=Psum+h;
		}
		
		if(b==Psum){
			System.out.println("The sum of all positive values in the array is: "+b);
		}
		else if(b==Nsum){
			System.out.println("Error, the method doesn't work");
		}
		
	}
	
	//This method should add up all the positive numbers in the given array
	public static long addAllPositiveIntsTogether(int []x){
		long sum=0; 
		for(int i=0; i<x.length; i++){
			if(x[i]>=0){
				sum = sum+x[i];
			}
		}
		return sum;
	}
	
	
	//I would like you to write 5 test cases that would test and make sure the GetTheIntAverage method works correctly.
	//You cannot use any number that starts with 3 in your test cases
	public static void testGetTheIntAverage(int []x){	
	    int testavg= GetTheIntAverage(x);
		long Psum= addAllPositiveIntsTogether(x);
		int y= x.length;
		long sum=0, sum1=0;
		for(int i=0; i<x.length; i++){
			sum = sum+x[i];
			
		}
		
		for(int j=0; j<y; j++){
			if(x[j]<0){
				sum1 = sum1+x[j];
			}
		}
		
		long average= sum/y;
		long avg1= Psum/y;
		long avg2= sum1/y;
		
		if(average == testavg){
			System.out.println("The average of all values in the array is: "+average);
		}
		else if(average == avg1){
			System.out.println("Error, the method is only outputting tthe average of positive values");
		}
		else if(average == avg2){
			System.out.println("Error, the method is only outputting tthe average of negative values");
		}
		else if(average == 0){
			System.out.println("Error, the method is outputting an invalid value");
		}
		else
			System.out.println("Error, the method doesn't work");
	}
	
	//This method should return the int value average for all values in the int array sent to it
	public static int GetTheIntAverage(int []x){
		int avg;
		int sum=0;
		for(int i=0; i<x.length; i++){
			sum = sum+x[i];
		}
		
		avg= sum/x.length;
		
		return avg;
	}
	
	//I would like you to write 6 test cases that would test and make sure the IsNegativeValeu method works correctly.
	public static void testIsNegativeValue(int []x){
	  boolean negativity= false;
	  
	  for(int i=0; i<x.length; i++){
		if(x[i]<-100 && x[i]>-90){
			negativity= true; 
		}
		else if(x[i]<-80 && x[i]>-90){
			negativity= true; 
		}
		else if(x[i]<-70 && x[i]>-80){
			negativity= true;  
		}
		else if(x[i]<-60 && x[i]>-70){
			negativity= true;   
		}
		else if(x[i]<-50 && x[i]>-60){
			negativity= true;   
		}
		else if(x[i]<0 && x[i]>-50){
			negativity= true;   
		}
	  }
	  
	  boolean j= isNegativeValue(x);
	  
	  if(negativity == j){
		System.out.println("The array has negative values:  "+j);
	  }
	  else 
		 System.out.println("Error, he method is not working");
	}
	
	//This method checks an array and tests to see if it contains a negative value
	public static boolean isNegativeValue(int []x){
		int min = 200;
		for(int h:x){
			if(h<min){
				min= h;
			}
		}
		
		if (min<0)
			return true;
		else 
			return false;
	}
	
}