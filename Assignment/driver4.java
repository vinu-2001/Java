package corejava;

public class driver4 {

	public static void main(String[] args) {
		
		int[] intArr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		
		for (int i = 0; i < intArr.length; i += 4) 
		{
			
			System.out.println(" Value : " + intArr[i]);
			
		}
	}
}
