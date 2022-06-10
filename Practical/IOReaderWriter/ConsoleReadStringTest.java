package corejava;

//Importing required classes
import java.io.Console;  

public class ConsoleReadStringTest {

    public static void main(String[] args)
    {
    	try {
        // Create the console object
        Console cnsl = System.console();
        if (cnsl == null)
        {
            System.out.println("No console available");
            return;
        }
        // Read line
        String str = cnsl.readLine("Enter string : ");
        // Print
        System.out.println("You entered : " + str);
    }
    	catch(Exception e) {
    		System.out.println(e.getMessage());
    		}
    	}
}