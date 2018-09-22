import java.util.*;
import java.io.*;
import java.util.Arrays;

class Task {
	public String taskTitle;
	public String personName;
	public String timeToComplete;
	public String important;
	public String urgent;
	public String status;
	Task(String taskTitle, String personName, String timeToComplete
	     , String important, String urgent, String status) {
		this.taskTitle = taskTitle;
		this.personName = personName;
		this.timeToComplete = timeToComplete;
		this.important = important;
		this.urgent = urgent;
		this.status = status;
	}
	Task(String taskTitle) {
		this.taskTitle = taskTitle;

	}
	/*void task1(String taskTitle1, String personName1,
	 String status1, String timeToComplete1, String important1, String urgent1){

	}*/
	public String getTaskTitle() {
		// if()
		return taskTitle;
	}
	public String getPersonName() {
		return personName;
	}
	public String getTimeToComplete() {
		return timeToComplete;
	}
	public String getImportant() {
		// if(getimportant().equals("y")){
		return important;
	}
	// return "Not Important";
	// }
	public String getUrgent() {
		// if(getUrgent().equals("y")){
		return urgent;
		// }
		// return "Not Urgent";
	}
	public String getStatus() {
		return status;
	}
	public String toString() {
		if (this.taskTitle.length() == 0 || Integer.parseInt(this.timeToComplete) < 0 || (!this.status.equals("todo") && !this.status.equals("done") )) {
			if (this.taskTitle.length() == 0) {
				return "Title not provided";
			}
			if (Integer.parseInt(this.timeToComplete) < 0) {
				return "Invalid timeToComplete " + this.timeToComplete;
			}
			if (!this.status.equals("todo") || !this.status.equals("done")) {
				// System.out.println("entering here");
				return "Invalid status " + this.status;
			}
		} else {
			if (this.important.equals("y")) {
				this.important = "Important";
			} else {
				this.important = "Not Important";
			}
			if (this.urgent.equals("y")) {
				this.urgent = "Urgent";
			} else {
				this.urgent = "Not Urgent";
			}
			return getTaskTitle() + ", " + getPersonName() + ", " + getTimeToComplete() + ", " + this.important +
			       ", " + getUrgent() + ", " + getStatus();
		}
		return null;
	}
}
/*class Todoist {
	ArrayList<Task> task1;
	String[] tasks;
	Todoist() {
		tasks = new String[10];
		int size = 0;
	}
	public void resize() {
		tasks = Arrays.copyOf(tasks, tasks.length * 2);
	}
	void addT(Task item) {
		task1.add(item);
	
	void addTask(Task item) {
		task1 = new ArrayList<>();
		task1.add(item);
		//String n = task1.get(0);
		System.out.println(task1.toString());
		//tasks.add();
		System.out.println(Arrays.toString(tasks));
	}
}
*/
class Todoist {
	Task[] tasks;
	int size;

	Todoist() {
		tasks = new Task[100];
		size = 0;
	}

	public void addTask(Task task) {
		if (tasks.length == size) {
			tasks = resize();
		}
		tasks[size++] = task;
	}

	public Task[] resize() {
		Task[] newList = new Task[tasks.length * 2];
		for (int i = 0; i < size; i++) {
			newList[i] = tasks[i];
		}
		return newList;
	}

	public String toString() {
		String s = "";
		for (int i = 0; i < size; i++) {
			s += tasks[i].getTaskTitle() + ", " + tasks[i].getPersonName() + ", " + tasks[i].getTimeToComplete() + ", " + tasks[i].getImportant() + ", " + tasks[i].getUrgent() + ", " + tasks[i].getStatus() + "\n";
		}
		return s.substring(0, s.length() - 1);
	}
	
	/*}
	public String getNextTask(String parameter) {
		for (int j = 0; j < tasks.length; j++) {
			if (tasks[j].getPersonName() == parameter) {
				if (tasks[j].getStatus() == "todo" && tasks[j].getImportant() == "Important"  && tasks[j].getUrgent() == "Urgent") {
					return tasks[j].getTaskTitle();
				}
			}
		}

		for (int j = 0; j < tasks.length; j++) {
			if (tasks[j].getPersonName() == parameter) {
				if (tasks[j].getStatus() == "todo" && tasks[j].getImportant() == "Important" && tasks[j].getUrgent() == "Urgent") {
					return tasks[j].getTaskTitle();
				}
			}
		}
		return "null";*/
	}