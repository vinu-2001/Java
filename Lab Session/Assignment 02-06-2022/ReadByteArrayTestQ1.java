//Write a java program to read contents from a file into byte array.
package corejava;

//Importing required packages
import java.io.FileInputStream;
import java.io.InputStream;

public class ReadByteArrayTestQ1 {

	public static void main(String a[]) {
		
		// Taking file location in String variable
		String str = "D:\\myFile.txt";
		//Creating Object of InputStream class
		InputStream fins = null;
		// Exception handling using try and catch block
	try {
		//Giving location to FileInputStream
			fins = new FileInputStream(str);
			// Declaring byte array
			byte arr[] = new byte[1080];
			//Initialize and Declaring the read variable
			int read = 0;
			// Iterating array to print array content using while loop
			while ((read = fins.read(arr)) > 0) {
				System.out.println(new String(arr, 0, read - 1));
			}
			
		}
	catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}
}