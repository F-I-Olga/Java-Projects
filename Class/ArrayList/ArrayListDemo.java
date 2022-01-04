/*
Demonstration of ArrayList and example of abstract class and interface use 
11-17-2020
Dr. G
*/


//An array list implements list and extends collection
//For more information: https://www.geeksforgeeks.org/arraylist-in-java/

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo{

    public static void main(String []args){
        
        //Notice right off the bat you don't have to designate a size
        //Infact based on the declaration what do you notice?
        ArrayList<String> animals = new ArrayList<String>();
        
        
        //Anything in there?
        //Array list have a built in dynamic size method
        System.out.println(animals.size());
        
        //Let's add some strings with the add method
        //What do you think is happening in the background?
        animals.add("Tiger");
        animals.add("Dog");
        animals.add("Giraffe");
        animals.add("Snake");
        
        //Anything in there now?
        System.out.println(animals.size());
        
        //Access a specific element with get(index); 
        System.out.println(animals.get(2));
      //
	  System.out.println(animals);	
	  
        Collections.sort(animals);
	    for(int x=0; x<animals.size(); x++){
			System.out.println(animals.get(x));
	    }
		//How about a for loop that will print the whole collection
		
        //Alright now let's cheat. System.out.println will actually accept an array list
        
        
        //Because ArrayList is a child of collections we can use collections
        //methods on arraylists including the static sort method
  
        System.out.println();
		
         
        //What else is there? Being a list we can change things out with set(index, element)
       
        System.out.println();
        
        //Let's remove something instead with remove(index)
        
        System.out.println();
        
        //Or just get rid of the entire thing with clear
        
        System.out.println();
        
        //What's the size now?
        //What's happening in memory?
        
  
        
    }
}