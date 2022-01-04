/*
* Olga Ingabire
*/
import java.text.DecimalFormat;
public class NumberTesterVersion2 {

	//NOTE: DO NOT TRY TO RUN THIS CLASS.  THERE IS NO MAIN METHOD
	

	//This method should return exactly what it was given
	public static int simpleMethod(int i){
		return i;
	}

	//A simple or operation, but with 3 values
	//this method should calculate the Conditional OR relationship  
	public static boolean findTheTruthUsingOrOperator(boolean a, boolean b, boolean c){
		boolean d= true;
		
	    if(a== false&&b== false&&c== false){
		   d= false;
	    }
	    else if(a== false&&b== false&&c== true){
		   d= true;
	    }
	    else if(a== false&&b== true&&c== false){
		    d= true;
	    }
	    else if(a== false&&b== true&&c== true){
	     	d= true;
	    }
	    else if(a== true&&b== false&&c== false){
	    	d= true;
	    }
	    else if(a== true&&b== false&&c== true){
		    d= true;
      	}	
	    else if(a== true&&b== true&&c== false){
	     	d= true;
	    }
	    else if(a== true&&b== true&&c== true){
		   d= true;
	    }
		
		return d;
	}
	
	//This method should return the first 5 numbers (as a positive int) after the decimal point.
	//For example, with 3.1415926535897932384 it would return 14159
	//Another example, 12345.5432112345 would return 54321
	public static int getTheFirst5NumbersAfterTheDecimalPoint(double a){
       String doubleAsString = String.valueOf(a);
        int indexOfDecimal = doubleAsString.indexOf(".");
		String dec = doubleAsString.substring(indexOfDecimal);
		String def = dec.substring(1,6);
		int fin = Integer.parseInt(def);
	
		
		return (fin);
	}

	//This method should look through the array and figure out how many 2's are in it
	public static int countHowManyTimesTheNumber2IsInTheArray(int [] theNumbers){
		int repeat = 0;
		
	    for(int j = 0; j <theNumbers.length; j++){
			if(theNumbers[j] == 2){
				repeat++;
			}
		}
		return repeat;
	}
	
	//This method should find the third positive integer in the array.
	public static int findTheThirdPositiveIntegerInTheArray(int [] theNumbers){
		int r=0;
		for(int j=0; j<theNumbers.length; j++){
			
			if(theNumbers[j]>=0){
				if(j==2){
					r=theNumbers[j];
				}
			}
		}
		
		return r;
	}


}
