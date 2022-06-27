// Create thread by using runnable interface
 package corejava;

public class ThreadExample1 implements Runnable {

	//Initiated run method for thread
		public void run() {
			System.out.println("Thread is running successfully.");
		}

	public static void main(String[] args) {
		
		ThreadExample1 th = new ThreadExample1();
		// Initializing Thread object 
		Thread tt = new Thread(th);

		// Invoking Thread 
		tt.start();
	}
}
