class Task extends Module {
	String taskName;

	public Task(int projectId, String projectName, String moduleName, String taskName) {
		super(projectId, projectName, moduleName);
		this.taskName = taskName;
	}

	protected void display() {
		super.display();
		System.out.println("Task Name: " + taskName);
	}
}