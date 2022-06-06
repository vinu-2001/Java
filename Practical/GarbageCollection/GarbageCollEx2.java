package corejava;

public class GarbageCollEx2 {
	public static void main(String[] args)
	{

	String s = new String("RR");
	s = null;
	System.gc();
	System.out.println("Main has Completed");
	}
public void finalize()
{
System.out.println("finalize method overridden");
}
}
