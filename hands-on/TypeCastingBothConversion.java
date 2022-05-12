package corejava;

public class TypeCastingBothConversion {

	public static void main(String[] args) {
		
		
		// Implicit Conversion
		
		int i = 145;
		
		double d = i ;
		
		System.out.println("Integer value : " + i);
		System.out.println("Converion to Double : " + d);
		
		System.out.println("------------------------------------------");
		
		//Explicit Conversion
		
		double dd = 178.156;
		
		int ii =(int) dd ;
		
		System.out.println("Double value : " + dd);
		System.out.println("Converion to Integer : " + ii);

	}

}
