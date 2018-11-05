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
			if (important.equals("y")) {
				important = "Important";
			} else {
				important = "Not Important";
			}
			if (urgent.equals("y")) {
				urgent = "Urgent";
			} else {
				urgent = "Not Urgent";
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
class Todoist{
	
	Task[] tasks;
	int size;

	Todoist() {
		tasks = new Task[25];
		size = 0;
	}

	public void addTask(Task t) {
		tasks[size++] = t;
	}

	public String toString() {
		if(size == 0){
			System.out.println("sdsf");
			return "";
		}
		for(int i = 0; i < size; i++) {
			if(tasks[i].taskTitle.equals(null)) {
				break;
			}
			if(tasks[i].timeToComplete.equals("0")) {
				break;
			}
			if(tasks[i].status.equals(null)) {
				break;
			}
			String ret = tasks[i].toString();
			System.out.println(ret);
		}
		return "";
	}
	public Task getNextTask(String name) {
		for(int i = 0; i < size; i++) {
			if(tasks[i].personName.equals(name)) {
				if(tasks[i].status.equals("todo") && tasks[i].important && (!tasks[i].urgent) && tasks[i].status.equals("todo")) {
					return tasks[i];
				}
				for(int j = i+1; j < size; j++) {
					if(tasks[j].personName.equals(name)) {
						Task t = tasks[j];
						if(t.important && (!t.urgent) && t.status.equals("todo") || t.important && (t.urgent) && t.status.equals("todo")) {
							return t;
						}
					}
				}	
			}
		}
		return null;
	}

	public Task[] getNextTask(String name, int count) {
		// System.out.println("1");
		Task[] ret = new Task[count];
		int i = 0;
		while(i < count) {
			ret[i] = getNextTask(name);
			i++;
		}
		return ret;
	}

	public int totalTime4Completion() {
		int total = 0;
		for(int i = 0; i < size; i++) {
			if(tasks[i].status.equals("todo"))
				total += tasks[i].Integer.parseInt(timeToComplete);
		}
		return total;
	}
}