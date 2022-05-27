package corejava;

class encapsulation {
	// private variables declared 
		// these can only be accessed by 
		// public methods of class
	private String name;
	private int rollno;
	private int age;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public static void main(String[] args) {
		

	}

}
