package corejava;

import java.util.ArrayList;
import java.util.List;

public class javaBeanStudentTwo {

	private int id;
	private String name;
	public List<String> subjects;

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

	public List<String> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<String> subjects) {
		this.subjects = subjects;
	}

	public static void main(String[] args) {
		javaBeanStudentTwo student = new javaBeanStudentTwo();

		List<String> subjects = new ArrayList<String>();
		subjects.add("English");
		subjects.add("Science");
		subjects.add("Computer");
		// setting bean values
		student.setId(101);
		student.setName("Priya");
		student.setSubjects(subjects);
		// getting bean value
		System.out.println("Student Id : " + student.getId());
		System.out.println("Student name : " + student.getName());
		List<String> subjectList = student.getSubjects();
		for (int i = 0; i < subjectList.size(); i++) {
			System.out.println("Student subject " + (i + 1) + " : " + subjectList.get(i));
		}
	}
	}

