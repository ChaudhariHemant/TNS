package org.tnsif.ddecisionmaking;
import java.util.*;

public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner s=new Scanner(System.in);
        int age=s.nextInt();
        int weight=s.nextInt();
        if(age>=12) 
        {
        	if(weight>=40)
        	{    
        		System.out.println("eligible for bunjee jumping");
        		if(weight>110) {
        			System.out.println("extra ropes are added");
        		}
        	}
        	else 
        	{
        		System.out.println("not eligible");
        	}
        }
        else 
        {
        	System.out.println("not eligible");
        }
	}

}
