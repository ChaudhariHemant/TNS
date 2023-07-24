package org.tnsif.ddecisionmaking;
import java.util.*;

public class IfElseExecutor {

	public static void main(String[] args) {
		// 
		//Scanner s=new Scanner(System.in);
		/*int age=s.nextInt();
		int weight=s.nextInt();
		if(age>18 && weight>50) {
			System.out.println("eligible to donate the blood ");
		}
		else
			{ 
			System.out.println("not eligible");
			}*/
		Scanner s=new Scanner(System.in);
		int age1=s.nextInt();
		int age2=s.nextInt();
		int age3=s.nextInt();
		if(age1> age2 && age1>age3)
		{
			System.out.println("Age1 is greator:" +age1);
		}
		else if(age2>age1 && age2>age3) {
			System.out.println("priti is greator:" +age2);
		}
		else {
			System.out.println("cable is grrator");
		}
		
		
		}

}
