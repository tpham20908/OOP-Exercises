class Module extends Project {
	protected String moduleName;
	
	public Module(int projectId, String projectName, String moduleName) {
		super(projectId, projectName);
		this.moduleName = moduleName;
	}

	protected void display() {
		super.display();
		System.out.println("Module name: " + moduleName);
	}
}