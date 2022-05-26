package corejava;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class reverseArrTest { 

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the length of array : ");

		Integer len = sc.nextInt();

		Integer a[] = new Integer[len];

		System.out.println("Enter " + len + " numbers to store in array");

		for (int i = 0; i < len; i++) {

			a[i] = sc.nextInt();
		}
		System.out.println("Array is : " + Arrays.toString(a));

		Arrays.sort(a, Collections.reverseOrder());

		System.out.println("Sorted Array in Descending order : " + Arrays.toString(a));
		
		sc.close();

	}

}
