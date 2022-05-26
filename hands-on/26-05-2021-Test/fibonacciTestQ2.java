package corejava;

import java.util.Scanner;

public class fibonacciTestQ2 {
	
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Fibonacci series : ");
		int n = sc.nextInt();
		sc.close();
		int n1=0, n2=1, n3;
		
		for(int i=2; i<n ; i++) {
			n3 = n1 + n2;
			n1 = n2 ;
			n2 = n3;
			
			System.out.print(" "+n3);
			
		}
		
	}

}
