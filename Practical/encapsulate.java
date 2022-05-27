package corejava;

public class encapsulate {

	public static void main(String[] args) {
		
		// Creating object of the encapsulation class
		encapsulation e = new encapsulation();
		//setting values to parameters
		e.setAge(15);
		e.setName("Madhav");
		e.setRollno(180);
		
		System.out.println("Name   : "+e.getName());
		System.out.println("RollNo : "+e.getRollno());
		System.out.println("Age    : "+e.getAge());
		
	}
}
