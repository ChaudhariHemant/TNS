package org.tnsif.multilevelinheritance;

public class Teamlead extends manager {
	private String leadName;
	private String projectName;

	public String getLeadName() {
		return leadName;
	}

	public void setLeadName(String leadName) {
		this.leadName = leadName;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public Teamlead(String deptname, String name, int empID,String leadName,String projectNmae ) {
		super(deptname, name, empID);
		// TODO Auto-generated constructor stub
		
		this.leadName=leadName;
		this.projectName=projectName;
		
		
	}

	@Override
	public String toString() {
		return "Teamlead [leadName=" + leadName + ", projectName=" + projectName + ", toString()=" + super.toString()
				+ "]";
	}

}
