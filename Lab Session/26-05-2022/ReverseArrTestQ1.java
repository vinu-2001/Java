// Write a java program to reverse the array contents.

package corejava;

// Importing required Libraries 
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ReverseArrTestQ1 { 

	public static void main(String[] args) {

		// Creating a object of Scanner class
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the length of array : ");
		
		// Taking input from user
		Integer len = sc.nextInt();

		Integer a[] = new Integer[len];

		System.out.println("Enter " + len + " numbers to store in array");

		// Iterating scanner object for taking input by using for loop
		for (int i = 0; i < len; i++) {

			a[i] = sc.nextInt();
		}
		
		System.out.println("Array is : " + Arrays.toString(a));

		// Sorting array using Arrays class
		Arrays.sort(a, Collections.reverseOrder());

		// Printing output
		System.out.println("Reversed given Array : " + Arrays.toString(a));
		
		// Closing Scanner class  
		sc.close();

	}

}