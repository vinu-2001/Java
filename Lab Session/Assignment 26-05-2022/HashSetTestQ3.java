// Write a java program to get the number of elements in a hash set.
package corejava;
// Importing Required libraries
import java.util.Scanner;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetTestQ3 {

	public static void main(String args[]) {

		// Creating object of scanner class
		Scanner sc = new Scanner(System.in);
		// Defining and crating the object of string HashSet
		HashSet<String> set = new HashSet<String>();
		System.out.print("Enter names to store in HashSet : ");
		// Taking input from user by using for loop
		for (int i = 0; i < 5; i++)
		{
			set.add(sc.next());
		}
		sc.close();
		// Printing the size of Hash set
		System.out.println("Number of elements in HashSet is : " + set.size());
		
		// Creating object of Iterator class
		Iterator<String> itr = set.iterator();
		
		// Printing the content of hash set Using while loop
		while (itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}