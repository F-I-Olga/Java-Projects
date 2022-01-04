//Ingabire Olga
/*
* Separate the following file into two class objects
* a driver class and a StringFunctionsClass.
* Then, implement each of the string functions. 
*/

public class StringLab {

	/**
	 * This method should take the string and print it to the screen with a space between each character in the string.
	 * For example, "Hello" should print
	 *    H e l l o
	 * to the screen 
	 * @param s
	 */
	public static void splitTheString(String s){
        String[] arrOfStr = s.split("", s.length()); 
  
        for (String a : arrOfStr){
            System.out.print(a+" "); 
        } 
		System.out.println(" "); 
	}
	
	
	/**
	 * This method accepts two strings and returns true if they are the same and false
	 * if they are different
	 */
	public static boolean compareString(String s1, String s2){
		boolean b= s1.equals(s2);
	    return b;	
	}
	
    /**
    * This method accepts two strings and returns true if s2 is part of s1.

    */
	public static boolean stringInString(String s1, String s2){
		boolean c= s1.contains(s2);
	    return c;
	}
	
	
	/**
	 * This method should print the following pattern.  Note that there are spaces at the first of the rows
	* If a 3 is given, it should print
	UUUS
	 UUS
	  US
	   S
	   number of rows = nb of Us, nested if loop, one that output the u and the main one that outputs s.
 
	* If a 5 is given, it should print
		UUUUUS
 		 UUUUS
  		  UUUS
  		   UUS
    	    US
     	     S	
    
	 */
	public static void printSUUPattern(int numOfUs){
		for(int i = numOfUs; i >= 0; --i) {
            for(int j = 1; j <= i; j++) {

                System.out.print("u");
            }
            System.out.println("s");
			System.out.println();
        }
		
	}


	/**
	 * Accept as input a String and print all characters in lower case
	 */
	public static void printLower(String s){
		System.out.println(s.toLowerCase());
	}
	
	/**
	* Accept as input a String and replace all 0's with o's and then print the string
	*/
	
	public static String replace0s(String s)
	{
		String h= s.replace('0', 'o');
		return h;
	}

}
