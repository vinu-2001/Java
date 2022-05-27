package corejava;

import java.util.ArrayList;
import java.util.List;

public class javaBeanStudentThree {

	private int id;
	private String name;
	public List<javaBeanSubject> subjects;
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
	public List<javaBeanSubject> getSubjects() {
	return subjects;
	}
	public void setSubjects(List<javaBeanSubject> subjects) {
	this.subjects = subjects;
	}
	public static void main(String[] args) {
		javaBeanStudentThree student = new javaBeanStudentThree();
		List<javaBeanSubject> subjects = new ArrayList<javaBeanSubject>();
		javaBeanSubject subject1 = new javaBeanSubject();
		subject1.setCode(210);
		subject1.setName("English");
		subjects.add(subject1);
		javaBeanSubject subject2 = new javaBeanSubject();
		subject2.setCode(220);
		subject2.setName("Science");
		subjects.add(subject2);
		javaBeanSubject subject3 = new javaBeanSubject();
		subject3.setCode(230);
		subject3.setName("Computer");
		subjects.add(subject3);
		// setting bean values
		student.setId(101);
		student.setName("Praful");
		student.setSubjects(subjects);
		// getting bean value
		System.out.println("Student Id : " + student.getId());
		System.out.println("Student name : " + student.getName());
		List<javaBeanSubject> subjectList = student.getSubjects();
		for (int i = 0; i < subjectList.size(); i++) {
			javaBeanSubject subject = subjectList.get(i);
		System.out.println("Student subject " + (i + 1) + " : " + subject.getCode()
		+ " : " + subject.getName());
		}
		}
		}

	