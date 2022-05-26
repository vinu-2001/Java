package corejava;

import java.util.Scanner;
import java.util.HashSet;
import java.util.Iterator;

public class heshSetTestQ3 {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		HashSet<String> set = new HashSet<String>();
		System.out.print("Enter names to store in HashSet : ");
		for (int i = 0; i < 5; i++)
		{
			set.add(sc.next());
		}
		sc.close();
		System.out.println("Number of elements in HashSet is : " + set.size());
		Iterator<String> itr = set.iterator();

		while (itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
