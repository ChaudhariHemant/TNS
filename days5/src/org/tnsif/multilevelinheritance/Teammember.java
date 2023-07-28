package org.tnsif.multilevelinheritance;

public class Teammember extends Teamlead{
	private int size;
	private int duration;
	public int getSize() {
		return size;
	}


	public void setSize(int size) {
		this.size = size;
	}


	public int getDuration() {
		return duration;
	}


	public void setDuration(int duration) {
		this.duration = duration;
	}


	
	
	

	public Teammember(String deptname, String name, int empID, String leadName, String projectNmae,int size,int duration) {
		super(deptname, name, empID, leadName, projectNmae);
		// TODO Auto-generated constructor stub
		this.size=size;
		this.duration=duration;
	}
	

	@Override
	public String toString() {
		return "Teammember [size=" + size + ", duration=" + duration + ", toString()=" + super.toString() + "]";
	}
	

}
