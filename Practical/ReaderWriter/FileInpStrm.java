package corejava;

//Importing required classes
import java.io.FileInputStream;

public class FileInpStrm {

	public static void main(String args[]) {
		// Exception handling with try and catch block
		try
		{
			// Creating object of a class and giving File location
			FileInputStream fin = new FileInputStream("E:\\myFile.txt");
			
			int i = 0;
			while ((i = fin.read()) != -1) {
				System.out.print((char) i);
				System.out.print(i);

			}
			fin.close();
		} 
		catch (Exception e) {
			System.out.println(e);
		}
	}
}
