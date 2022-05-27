package corejava;

import java.io.Serializable;

class javaBeanEmp implements Serializable {
	
	private int id;
	private String name;
	
	public javaBeanEmp() {
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public static void main(String [] args)
	{
		javaBeanEmp e = new javaBeanEmp();
		e.setName("Mayank");
		e.setId(01);
		System.out.println("Id   : "+e.getId());
		System.out.println("Name : "+ e.getName());
	}
}
