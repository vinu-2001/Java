package corejava;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufferWriterEx {
	
	public static void main(String[] args) throws Exception {     
		
	    FileWriter writer = new FileWriter("E:/myFile.txt");  
		
	    BufferedWriter buffer = new BufferedWriter(writer);  
		
	    buffer.write("Welcome to Mumbai. ");  
		
	    buffer.close();  
		
	    System.out.println("Success");  
		
	    } 
}
