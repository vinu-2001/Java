package corejava;

public class pyramidTestQ4 {

	public static void main(String[] args) {

		int n = 5;
		int m = 1;
		for (int i = 0; i <= 5; i++) {

			for (int j = 0; j <= n - i; j++) {
				System.out.print(" ");
			}

			for(int k=1 ; k<=m ; k++) {
				System.out.print("*");
			}
			System.out.println("");
			m=m+1;
			
		}

		
	}
}
