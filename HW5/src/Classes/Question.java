package Classes;

public class Question {
	
	private String task;
	private int id;
	private int maxValue;
	
	public Question(int id, String task, int value) {
		this.id = id;
		this.task = task;
		this.maxValue = value;
	}

	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getMaxValue() {
		return maxValue;
	}

	public void setMaxValue(int maxValue) {
		this.maxValue = maxValue;
	}
}
