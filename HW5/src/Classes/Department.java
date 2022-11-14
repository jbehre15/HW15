package Classes;

import java.util.ArrayList;

public class Department {
	private String name;
	private ArrayList<Employee> employees;
	private ArrayList<Courses> courses;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList getEmployees() {
		return employees;
	}
	public void setEmployees(ArrayList employees) {
		employees = employees;
	}
	public ArrayList<Courses> getCourses() {
		return courses;
	}
	public void setCourses(ArrayList<Courses> courses) {
		this.courses = courses;
	}
	public void setEmployees(ArrayList<Employee> employees) {
		this.employees = employees;
	}
}
