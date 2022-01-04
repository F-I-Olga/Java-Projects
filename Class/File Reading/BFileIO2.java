//Demonstration code 
//Binary file reader
//Dr. Gary Cantrell
//11-6-18

import java.io.*;
import java.util.Arrays;
import java.nio.ByteBuffer;

public class BFileIO2 {
    public static void main(String [] args) {

        // The name of the file to open.
        String fileName = "temp.txt";

        try {
            // Here's our buffer for reading the data
            // Why do we have to declare a size this time?
            byte[] buffer = new byte[1000];
            byte[] subBuffer; // sub array for reading in specific elements

            FileInputStream inputStream = new FileInputStream(fileName);

            int total = 0; //total bytes read
            int nRead = 0; //current bytes read
            
            //read returns the number of bytes read or -1 if it reaches the file's end
            //bytes are stored in the byte array argument sent
            while((nRead = inputStream.read(buffer)) != -1) {total += nRead;}   
            
            //create a sub buffer of the first stored string
            subBuffer = Arrays.copyOfRange(buffer, 0, 11);
            System.out.println(new String(subBuffer, "ASCII"));
            
            //create a sub buffer of the int stored
            subBuffer = Arrays.copyOfRange(buffer, 11, 15);
           	System.out.println(ByteBuffer.wrap(subBuffer).getInt());
           	
           	//create a sub buffer for the 2nd string stored
           	subBuffer = Arrays.copyOfRange(buffer, 15, 32);
           	System.out.println(new String(subBuffer, "ASCII"));
           
           //create a sub buffer the double
           subBuffer = Arrays.copyOfRange(buffer, 32, 40);
           System.out.println(ByteBuffer.wrap(subBuffer).getDouble());
          
            // Always close files.
            inputStream.close();        

            System.out.println("Read " + total + " bytes");
            
            //1. What does this teach you about binary file IO?
            //2. What do you have to know about the file you are reading?
            //3. What would happen if you were off by even 1 byte?
            
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '" + fileName + "'");                
        }
        catch(IOException ex) {
            System.out.println("Error reading file '"  + fileName + "'");                  
        }
    }
}