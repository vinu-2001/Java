//Write java program to read input.(Using BufferReader)
package corejava;

//Importing required packages
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadInputBufferReaderTestQ2 {

	  public static void main(String[] args) throws IOException 

	  {
		  System.out.print("Enter your Name: ");
	        //Enter data using BufferReader
	        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

	        // Reading data using readLine
	        String name = reader.readLine();
	        
	        // Printing the read line
	        System.out.println(name);        

	    }

	}
