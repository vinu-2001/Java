// write a program to print Fibonacci series of n terms where n is input by user:  0 1 1 2 3 5 8 13 21 34....

package corejava;

// Importing Scanner class 
import java.util.Scanner;

public class FibonacciTestQ2 {
	
	public static void main(String [] args) {
		// Creating object of Scanner class
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Fibonacci series : ");
		// Taking input from user
		int n = sc.nextInt();
		sc.close();
		// Initializing and Declaring variables
		int n1=0, n2=1, n3;
		// For loop for iterating numbers and adding to next number 
		for(int i=2; i<n ; i++) {
			n3 = n1 + n2;
			n1 = n2 ;
			n2 = n3;
			
			// Printing the Output
			System.out.print(" "+n3);
			
		}
		
	}

}