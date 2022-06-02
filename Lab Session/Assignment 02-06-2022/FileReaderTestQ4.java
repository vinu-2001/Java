//Java program to show the usage of IO FileReader Class
package corejava;
//Importing required packages

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTestQ4 {

	 public static void main(String args[]) throws IOException {
	      //Creating FileReader object
	      File file = new File("D:/myFile.txt");
	      // To read from the created file
	      FileReader reader = new FileReader(file);
	      char chars[] = new char[(int) file.length()];
	      //Reading data from the file
	      reader.read(chars);
	      //Printing output 
	      System.out.println(chars);
	      //Closing FileReader class
	      reader.close();
	   }
	}

