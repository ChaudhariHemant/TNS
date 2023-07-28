/*there are n people standing in a circle  waiting to the executed .
the counting out begins at some points in the circle 
and proceeds around the circle fix direction in each step a certain
no. of people skip and next person is executed. 
the elimination proceeds around the circle in the 
(which is becoming smaller and smaller as the executed people are removed ),
until only the last person remains, who is given freedom.
given the total no. of person 'N' and a no. 'K' which indicates that k-1 person are 
skip and the 'K'th person killed in the circle the task choose the person in the 
initial person that survived*/

package org.tnsif.dayfourchallenge;
import java.util.*;
public class CircleSurviveChallenge {
	 static int survive(int n, int k)
	    {
	        if (n == 1)
	            return 1;
	        else
	            return (survive(n - 1, k) + k - 1) % n + 1;
	    }

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		System.out.println(survive(n,k));

	}

}