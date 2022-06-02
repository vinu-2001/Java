//Write a java program BufferWriter to write data to a File
package corejava;
//Importing required packages

import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufferWriterTestQ3 {

	public static void main(String[] args) throws Exception {     
		//Creating Object of FileWriter class and assigning location
	    FileWriter writer = new FileWriter("D:/myFile.txt");  
		// Creating Object of BufferedWriter class
	    BufferedWriter buffer = new BufferedWriter(writer);  
		//Writing the data to file using BufferWriter object
	    buffer.write("I like to play Cricket.");  
		//closing BufferWriter
	    buffer.close();  
		// Printing success 
	    System.out.println("Success");  
		
	    } 
}
