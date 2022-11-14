package Classes;

import java.util.ArrayList;

public class Courses {
	
	private int id;
	private String name;
	private int maxCapacity;
	private boolean isFull;
	private Professor[] professors = new Professor[3];
	private ArrayList<TA> tas;
	private ArrayList<Exams> exams;
	
	public ArrayList<Exams> getExams() {
		return exams;
	}

	public void setExams(ArrayList<Exams> exams) {
		this.exams = exams;
	}

	public Courses(int id, String name, int cap, Professor prof) {
		this.id = id;
		this.name = name;
		maxCapacity = cap;
		professors[0] = prof;
	}
	
	public Courses(int id, String name, int cap, Professor[] profs) {
		this.id = id;
		this.name = name;
		maxCapacity = cap;
		for(int i=0; i<profs.length; i++) {
			professors[i] = profs[i];
		}
	}
	
	public void enroll(Student student) {
		
	}
	
	public void apply(TA ta) {
		
	}
	
	public setTA(TA ta) {
		this.tas.add(ta);
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

	public int getMaxCapacity() {
		return maxCapacity;
	}

	public void setMaxCapacity(int maxCapacity) {
		this.maxCapacity = maxCapacity;
	}

	public boolean isFull() {
		return isFull;
	}

	public void setFull(boolean isFull) {
		this.isFull = isFull;
	}

	public Professor[] getProfessors() {
		return professors;
	}

	public void setProfessors(Professor[] professors) {
		this.professors = professors;
	}

	public ArrayList<TA> getTas() {
		return tas;
	}

	public void setTas(ArrayList<TA> tas) {
		this.tas = tas;
	}
	
	
}