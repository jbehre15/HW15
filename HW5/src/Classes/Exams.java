package Classes;

public class Exams {
	
	private int maxValue = 0;
	private ArrayList<Questions> questions;
	private ArrayList<Student> students;
	private ArrayList<Professor> professors;
	private Courses course;
	
	public boolean register(Student student) {
		
	}
	
	public void addQuestion(int id, String task, int value) {
		questions.add(new Question(id,task,value));
		maxValue = maxValue+value;
	}

	public int getMaxValue() {
		return maxValue;
	}

	public void setMaxValue(int maxValue) {
		this.maxValue = maxValue;
	}

	public ArrayList<Questions> getQuestions() {
		return questions;
	}

	public void setQuestions(ArrayList<Questions> questions) {
		this.questions = questions;
	}

	public ArrayList<Student> getRegisteredStudents() {
		return students;
	}

	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}

	public ArrayList<Professor> getProfessors() {
		return professors;
	}

	public void setProfessors(ArrayList<Professor> professors) {
		this.professors = professors;
	}

	public Courses getCourse() {
		return course;
	}

	public void setCourse(Courses course) {
		this.course = course;
	}

	public ArrayList<Student> getStudents() {
		return students;
	}
	
	
}
