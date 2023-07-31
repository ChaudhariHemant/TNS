package org.tnsif.instancedemo;
class RBI{
	protected String ifsccode="RBISONFJE0F";
}
class SBI extends RBI{
	public SBI() {
		super.ifsccode="RBIVCK584";
		String ifsccode="SBIJCJC";
		System.out.println(ifsccode);
		System.out.println(super.ifsccode);
		
	}
	
}


public class InstanceofDemp {
    public static void main(String[] args) {
    	SBI s=new SBI();
    	System.out.println(s instanceof SBI);
    	System.out.println(s instanceof RBI);
    	
    }
}
