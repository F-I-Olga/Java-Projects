//Simple file copy application using input and output streams
//CS 1410
//March 26th, 2019
//Dr. G

import java.util.Scanner;
import java.io.*;

public class FileCopy
{

	public static void main(String [] args)
	{
		//hard coded test set
        String inputFile = "";
        String outputFile = "";
 
        try 
        	{
            	InputStream inputStream = new FileInputStream(inputFile);
            	OutputStream outputStream = new FileOutputStream(outputFile);
 
 				//input stream returns bytes in the form of integer values
            	int byteRead;
            	
           		while ((byteRead = inputStream.read()) != -1) 
           	 	{
            		outputStream.write(byteRead);
           		}
        	} 
        catch (IOException ex) 
       		{
            	ex.printStackTrace();
      		}
      }
}


//1. Analize the above code to determine its function
//2. Does it matter the type of file that is copied?
//3. How much data is it reading at a time?
//4. Have it output bytes read. Why is the first byte 50 instead of 2?
//5. How could we get rid of the hard coding?
