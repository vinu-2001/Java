// Write a program to print Half pyramid pattern
package corejava;

public class PyramidTestQ4 {

	public static void main(String[] args) {

		// Initializing and Declaring the variables 
		int n = 5;
		int m = 1;
		// main for loop for iteration
		for (int i = 0; i <= 5; i++) {

			// For loop for giving spaces
			for (int j = 0; j <= n - i; j++) {
				System.out.print(" ");
			}

			// For loop for printing *
			for(int k=1 ; k<=m ; k++) {
				System.out.print("*");
			}
			System.out.println("");
			// Assigning +1 operator to m  
			m=m+1;
			
		}

		
	}
}
