// WAP in java to perform all the Arithmetic operations(+,-,*,/,%)

package corejava;

public class ArithmetiOperations {

	public static void main(String[] args) {
		
		int num1, num2, add, sub, mul, div, mod; // Declaration
		
		num1 = 9 ; // Initialization
	    num2 = 3 ; // Initialization
	    
	    add = num1 + num2;
	    sub = num1 - num2;
	    mul = num1 * num2;
	    div = num1 / num2;
	    mod = num1 % num2;
	    
	    System.out.println("Addition of two numbers = " + add); // Printing Results
	    System.out.println("Subtraction of two numbers = " + sub);
	    System.out.println("Multiplication of two numbers = " + mul);
	    System.out.println("Division of two numbers = " + div);
	    System.out.println("Modulus of two numbers = " + mod);
	    
		

	}

}
