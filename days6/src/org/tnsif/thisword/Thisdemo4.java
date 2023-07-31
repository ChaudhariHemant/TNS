package org.tnsif.thisword;
class Director{
	String name;
	void print() {
		this.name="sunil Datt";
		dispaly(name);
	}
	void dispaly(String name) {
		System.out.println("Director name is" +name);
	}
}

public class Thisdemo4 {
	public static void main(String[] args) {
		Director d=new Director();
		d. print();
		
	}
}
