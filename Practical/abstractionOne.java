package corejava;

public class abstractionOne extends abstraction{

	public int Multiply(int n1,int n2){
		return n1*n2;
	}
		public int MultiplyOne(int n1,int n2,int n3) {
			return n1* n2 * n3;
		}
	
	public static void main(String[] args) {
		
		abstraction abs =new abstractionOne();
		
		System.out.println("Calling Multiply method: "+abs.Multiply(12,0));
		System.out.println("Calling MultiplyOne method: "+abs.MultiplyOne(12,12,1));       
		
		
	}

}