package corejava;

public class absOneOn extends absOn{
	public int add(int n1,int n2) {
		return n1+n2;
	}
	public int sub(int n1,int n2) {
		return n1-n2;
	}
	public static void main(String[] args) {
		absOn a = new absOneOn();
		
		System.out.println("Addition    : "+a.add(10, 13));
		System.out.println("Subtraction : "+a.sub(12, 22));
	}

}