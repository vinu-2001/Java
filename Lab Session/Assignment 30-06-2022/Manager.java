package labsession;

class Manager extends Employee{
	//Parameterized constructor
	Manager(long id, String n, String a, long p, double s) {
		super(id, n, a, p, s);
	}
	//Declaring calculateTransportAllowance method that takes two parameters
	public double calculateTransportAllowance(Manager m, int a) {
		return 0.15 * getBasicSalary();
	}

	public static void main(String[] args) {

		Manager m = new Manager(126534, "Peter", "Chennai India", 237844, 65000.0);
		double salary = m.calculateSalary();
		System.out.println("Manager's Salary : " + salary);
		System.out.println("Manager's Transport Allowance (15%) : " + m.calculateTransportAllowance(m, 15));
	}

}
