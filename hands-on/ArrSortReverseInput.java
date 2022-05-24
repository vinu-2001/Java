package corejava;

import java.util.Collections;
import java.util.Arrays;
import java.util.Scanner;



public class ArrSortReverseInput {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter three name to save in array : ");
		
		String arr [] = new String[3];
		
		
		 for(int i=0; i<3; i++) 
		   {
		     arr[i]=sc.next();
		   }
		   
		   System.out.println("Array is : \t"+ Arrays.toString(arr) );
		   
		   Arrays.sort(arr);
		   
		   System.out.println("Sorted Array in Ascending order : \t"+ Arrays.toString(arr));
		   
		   Arrays.sort(arr, Collections.reverseOrder());
		   
		   System.out.println("Sorted Array in Descending order : "+ Arrays.toString(arr));
		   
		   System.out.println("------------------------------------------");
		   
		   
		   System.out.println("Enter the length of array : ");
		   
		   Integer len = sc.nextInt();
		   
		   Integer a[] = new Integer[len];
		   
		   System.out.println("Enter "+len+" numbers to store in array");
		   
		   for(int i=0; i<len ; i++) {
			   
			   a[i] = sc.nextInt();
			   }
           System.out.println("Array is : \t"+ Arrays.toString(a) );
		   
		   Arrays.sort(a);
		   
		   System.out.println("Sorted Array in Ascending order : \t"+ Arrays.toString(a));
		   
		   Arrays.sort(a, Collections.reverseOrder());
		   
		   System.out.println("Sorted Array in Descending order : "+ Arrays.toString(a));

	}

}
