package corejava;

public class encapsulateOn {

	public static void main(String[] args) {
		
		//Creating objects of encapsOn
		encapsOn en = new encapsOn();
		
		en.setId(101);
		en.setName("Jolly");
		en.setAddress("New Maxico,Michel Street,Nolan field");
		
		System.out.println("Id     : "+en.getId());
		System.out.println("Name   : "+en.getName());
		System.out.println("Adress : "+en.getAddress());
		
		
	}

}