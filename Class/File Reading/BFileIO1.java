//Demonstration code 
//Binary file writer
//Dr. Gary Cantrell
//11-6-18

import java.io.*;
import java.nio.ByteBuffer;

public class BFileIO1 {
    public static void main(String [] args) {

        // The name of the file to create.
        String fileName = "temp.txt";

		//A Try/Catch block is always important for file IO
        try {
            // Create a byte buffer that can be used to write out to a file
            byte[] buffer;
            
            //Now we need an output stream operator
            FileOutputStream outputStream = new FileOutputStream(fileName);
            
            //Create a string to store in our byte buffer
            String strBytes = "Hello there";
            
            //The string class has a built in byte array converter
            buffer = strBytes.getBytes();
                  
           //We can now write out the data using the stream and the buffer
            outputStream.write(buffer);
            System.out.println("Wrote " + buffer.length + " bytes");
            
            //Now let's add a totally different type
            //Here I'm using byte buffer to convert an integer value to a byte array
            buffer = ByteBuffer.allocate(4).putInt(42).array();
            
            //FileOutputStream uses a file pointer so we can just add to it
            outputStream.write(buffer);
            System.out.println("Wrote " + buffer.length + " bytes");
            
            //Ok let's add another string for the fun of it
            strBytes = "for the fun of it";
            buffer= strBytes.getBytes();
            
            //now we'll add that
            outputStream.write(buffer);
            System.out.println("Wrote " + buffer.length + " bytes");
            
            //How about a double?
            buffer = ByteBuffer.allocate(8).putDouble(3.141).array();
            
            //FileOutputStream uses a file pointer so we can just add to it
            outputStream.write(buffer);
            System.out.println("Wrote " + buffer.length + " bytes");
            
            //With file streams we need to close on exit
            outputStream.close();       

			//1. Check the resulting file in a hex editor and observe the results.
			//2. What would have been a more efficient way to structure the code above?
			//3. What's the problem with implementing that efficient way?
        }
        catch(IOException ex) {
            System.out.println("Error writing file '" + fileName + "'");

        }
    }
}
