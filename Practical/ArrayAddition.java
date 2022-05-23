package corejava;
import java.util.Scanner;
public class ArrayAddition {

	public static void main(String[] args) {
		//
		Scanner sc = new Scanner(System.in);
		
		int len; 
		
		System.out.println("Enter Array length \n");
		
		len=sc.nextInt(); 
		
		int a[]=new int[len]; 
	    System.out.println("Enter "+ len + " Element to store in Array\n" );
	    
	    for(int i=0; i<len; i++) 
		   {
		     a[i]=sc.nextInt();
		   }
		   
		   int sum=0;   
		   // Adding the Array's elements
		   for(int i=0;i<len;i++) {
			   sum+=a[i];
		   }
		   System.out.println("The sum of array :"+sum);

	}

}


