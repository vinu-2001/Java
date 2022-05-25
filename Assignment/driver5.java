package corejava;

public class driver5 {
	public static void main(String[] args) {
		
		int[] intArr = new int[5];
		
		for (int i = 0; i < intArr.length; i++) 
		{
			intArr[i] = i * 2;
		}
		for (int i = 0; i < intArr.length; i++)
		{
			System.out.print(intArr[i]);
			if(i == intArr.length-1) 
			{
				break;
			}
			System.out.print( ", ");
			
		}
	}
}
