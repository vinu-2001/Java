package corejava;

import java.util.PriorityQueue;

public class priorityQueue {

	 // Main Method
    public static void main(String args[])
    {
        // Creating empty priority queue
        PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();
  
        // Adding items to the pQueue using add()
        pQueue.add(10);
        pQueue.add(20);
        pQueue.add(15);
        pQueue.add(25);
  
        // Printing the top element of PriorityQueue
        System.out.println(pQueue.peek());
        System.out.println("------------------");
  
        // Printing the top element and removing it
        // from the PriorityQueue container
        System.out.println(pQueue.poll());
        System.out.println("------------------");
  
        // Printing the top element again
        System.out.println(pQueue.peek());
        System.out.println("------------------");
        System.out.println("Size of Queue : "+pQueue.size());
    }
}
