package corejava;

public class driver

{
	public static void main(String[] args) {
		
		String[] strArr = new String[10];
		
		for (int i = strArr.length - 1; i >= 0; i--) 
		{
			
			strArr[i] = "Rupesh - " + (i - 1);
			
		}
		
		System.out.println(" Value : " + strArr[8]);
	}
}
