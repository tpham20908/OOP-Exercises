class Project {
	protected int projectId;
	protected String projectName;

	public Project(int projectId, String projectName) {
		this.projectId = projectId;
		this.projectName = projectName;
	}

	protected void display() {
		System.out.println("Project ID: " + projectId);
		System.out.println("Project Name: " + projectName);
	}	
}