package corejava;



public class GarbageCollEx {

	public void finalize() {
		System.out.println("Garbage collected object");
	}

	public static void main(String args[]) {
		GarbageCollEx s1 = new GarbageCollEx();
		GarbageCollEx s2 = new GarbageCollEx();
		s1 = null;
		s2 = null;
		System.gc();
	}

}
