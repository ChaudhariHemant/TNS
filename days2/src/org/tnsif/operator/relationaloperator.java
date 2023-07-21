//program for relational operator
package org.tnsif.operator;

import java.util.Scanner;

public class relationaloperator {

	public static void main(String[] args) {
		/*/ TODO Auto-generated method stub
		System.out.println(5==8);
		System.out.println(4!=3);
		System.out.println(31!=7 && 3>=5 );
		System.out.println(31!=7 || 3>=5);
        System.out.println(!(31!=7 || 3>=5));
        System.out.println();
        //num+1=num2==:num1=num1*num2;*/
        
        /*int x=12,y=7;
        x-=y;// x=x-y
        System.out.println("sub is  "+x);
        x+=y;
        System.out.println("add is "+x);*/
		System.out.println();
		
		// bitwise operator;true=1 ,false=0;
//		int x=56,y=5;
//		System.out.println(x&y);
//		System.out.println(x|y);
//		System.out.println(x^y);
		
		/*int x=13,y=9;
		System.out.println(x&y);
		System.out.println(x|y);
		System.out.println(x^y);
		System.out.println(8>>1);
		System.out.println(8<<1);*/
		
		/*Scanner s=new Scanner(System.in);
	    int  num=s.nextInt();
	    String result=(num%2==0)?"even":"odd";
	    System.out.println("result is: "+result);
	    s.close();*/
	    
	    int x=23;
	    int y=6;
	    int res1=x++ + ++y;// 23+ 7
	    System.out.println(res1);
	    System.out.println(x);
	    System.out.println(y);
	    System.out.println();
	    int res2=x-- + --y;// 23+ 7
	    System.out.println(res2);//24 + 6//30
	    System.out.println(x);
	    System.out.println(y);
	    
		
		
		
		
		
		
		
		
        
		

	}

}
