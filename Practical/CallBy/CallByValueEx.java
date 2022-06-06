//Java program show casing uses of call by value in this example 

package corejava;

// Importing java IO package
import java.io.*;

public class CallByValueEx {
	// Method to swap numbers
	static void swap(int a, int b) {
		// Creating a temporary variable in stack memory
		// and updating values in it.
		// Step 1
		int temp = a;
		// Step 2
		a = b;
		// Step 3
		b = temp;
		// Display message after swapping numbers
		System.out.println("after swapping x = " + a + " and y = " + b);
		// This variables vanishes as scope is over
	}
	// Main driver method
	public static void main(String[] args) {
		// Custom inputs/numbers to be swapped
		int x = 15;
		int y = 7;
		// Display message before swapping numbers
		System.out.println("before swapping x = " + x + " and y = " + y);
		// Using above created method to swap numbers
		swap(x, y);
	}
}