package corejava;

public class MyThread extends Thread {

	// Initiated run method for thread
	public void run() {
		int i = 0;
		while (i < 10) {
			System.out.println("Good Morning");
			try {
				Thread.sleep(200);
			} catch (InterruptedException i1) {
				i1.printStackTrace();
			}
			System.out.println("Welcome to Mumbai");
			i++;

		}
	}

	public static void main(String[] args) {

		MyThread th = new MyThread();
		// Invoking Thread
		th.start();

	}
}