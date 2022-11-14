package Classes;

import java.util.ArrayList;

public class Student {
	
	private int id;
	private String name;
	private ArrayList<Exams> exams;
	private ArrayList<Student> students;
	
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
	public ArrayList<Exams> getExams() {
		return exams;
	}
	public void setExams(ArrayList<Exams> exams) {
		this.exams = exams;
	}
	public ArrayList<Student> getStudents() {
		return students;
	}
	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}
}
