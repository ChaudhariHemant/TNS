package org.tnsif.thisword;
// use the refer the current instance if a class 
class Account{
	long accountNO;
	void setData(long accountNO) {
		this.accountNO=accountNO;
	}
	void display() {
		System.out.println(accountNO);
	}
}

public class ThiskeywordDemoname {
	public static void main(String[] args) {
		Account a=new Account();
		a.setData(84537989838L);
		a.display();
		
	}

}
