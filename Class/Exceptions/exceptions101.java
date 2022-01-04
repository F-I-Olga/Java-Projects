//Ingabire Olga

import java.util.*;

public class exceptions101{
	public static void main (String[] args){
		int [] arr= {1,2,3,4,5};
		String a= null;
		String b = "Uzi n' ibindi ubu buzima wapi rwose";
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Below are the Exception options:");
		System.out.println("1. Arithmetic Exception");
		System.out.println("2. Arrray Index Out Of Bounds Exception");
		System.out.println("3. Null Pointer Exception");
		System.out.println("4. String Index Out Of Bounds Exception\n");
		System.out.println("Please choose the exception you'd like to see by entering 1, 2, 3, or 4");
		
		int choice= scn.nextInt();
		
		switch(choice){
			case 1:
			Arithmetic(10,0);
			break;
			case 2:
			Arrray_Index_Out_Of_Bounds(arr);
			break;
			case 3:
			Null_Pointer(a);
			break;
			case 4:
			String_Index_Out_Of_Bounds(b);
			break;
			default:
			System.out.println("Wrong number, please enter 1, 2, 3, or 4");
		}
		
	}
	
	public static void Arithmetic(int x, int y){
		System.out.println(" ");
		System.out.println("Arithmetic Exception:");
		
		try{
		    
		    int div = x/y;
		    System.out.println(x+"/"+x+"= "+div);
		}
		
		catch (ArithmeticException E) {
		    System.out.println("Division by "+y+" is undefined");
		    System.out.println(E);
	    }
	}
	
	public static void Arrray_Index_Out_Of_Bounds(int []arr){
		System.out.println(" ");
		System.out.println("Arrray Index Out Of Bounds Exception:");
		
		try {
            for (int i= 0; i<=(arr.length); i++) {
                System.out.println("Value in Index "+i+" :");
                System.out.println(arr[i]);
            }
        } 
		
		catch (ArrayIndexOutOfBoundsException E) {
		   System.out.println("Array index is greater than array length");
           System.out.println(E);
		}
	}
	
	public static void Null_Pointer(String a){
		System.out.println(" ");
		System.out.println("Null Pointer Exception:");
		
		try {
            System.out.println("First character: " + a.charAt(0));
        } 
		
		catch (NullPointerException E) {
		   System.out.println("The string has null value");
           System.out.println(E);
		}
	}
	
	public static void String_Index_Out_Of_Bounds(String b){
		System.out.println(" ");
		System.out.println("String Index Out Of Bounds Exception:");
		
		try {
            System.out.println("Length of the String: "+b.length());
            for(int i=0; i<=b.length(); i++) {
            System.out.println(b.charAt(i));
			}
        } 
		
		catch (StringIndexOutOfBoundsException E) {
		   System.out.println("The index of the character you are trying to access is greater than string length");
           System.out.println(E);
		}
	}
}