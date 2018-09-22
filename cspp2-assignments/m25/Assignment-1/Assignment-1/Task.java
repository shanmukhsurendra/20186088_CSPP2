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
	public String getimportant() {
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
		if(this.important.equals("y")){
			this.important = "Important";
		}else{
			this.important = "Not Important";
		}
		if(this.urgent.equals("y")){
			this.urgent = "urgent";
		}else{
			this.urgent = "Not Urgent";
		}
		return getTaskTitle()+","+getPersonName()+","+getTimeToComplete()+","+this.important+
			","+getUrgent()+","+getStatus();
	}
}
