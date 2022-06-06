package corejava;

import java.util.Scanner;

public class CallByRefSwap {
	
	 Scanner sc = new Scanner(System.in);
	 
	 int a = sc.nextInt();
	 int b = sc.nextInt();
	 int temp;
	    void call(CallByRefSwap c) {
	        c.temp = c.a;
	        c.a = c.b;
	        c.b = c.temp;
	        System.out.println("After Swap a : "+ a +" After Swap b : "+ b );
	    }  
	        public static void main(String [] args) {
	        	CallByRefSwap c = new CallByRefSwap();
	        	
	        	System.out.println("Before Swap a : "+ c.a +" Before Swap b : "+ c.b);
	        	c.call(c);
	        	
	        	
	        }

}
