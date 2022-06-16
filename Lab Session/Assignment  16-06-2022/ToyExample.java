/* Write a program to get the input as integer and create a method get Toy(int price) 
which uses switch case to display the toys with respect to price.
*/

package corejava;

import java.util.Scanner;

public class ToyExample
{
    //Creating multi-dimensional String array
    String[][] toys = new String [6][6];

    //constructor
    ToyExample()
    {

    toys [0][0]="1";
    toys[0][1]="Barbie Doll";

    toys [1][0]="2";
    toys [1][1] ="Hot Wheels";

    toys [2][0]="3";
    toys [2][1]="Doremon";

    toys [3][0]="4";
    toys [3][1]="Shinchan";

    toys [4][0]="5";
    toys[4][1]="Toyshine";

    }
    //Creating getToy function for switch case
    public static String getToy(int price)
    {
        String toyshop;
        switch(price)
        {
        //prices for toys in case value
            case 250: 
            	toyshop = "Barbie Doll";
                return toyshop;
            
            case 200:
            	toyshop= "Hot Wheels";
                return toyshop;
                
            case 150:
            	toyshop = "Doremon";
                return toyshop;
                
            case 230:
            	toyshop = "Shinchan";
                return toyshop;
                
            case 180:
            	toyshop = "Toyshine";
                return toyshop;
                
            default:
            	toyshop = "No Toys Available in this Range";
                return toyshop;
        }
    }
     //main method
    public static void main(String[] args) 
    { 
    	System.out.println("Enter the price for toy: ");
   	
     	//Creating Scanner class object
        Scanner sc = new Scanner (System.in); 
        int price = sc.nextInt ();
        System.out.println(getToy(price));
        sc.close();
    }
}