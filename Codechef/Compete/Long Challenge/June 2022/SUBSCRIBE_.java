/*
Problem: SUBSCRIBE_
Contest: JUNE221D
Link: https://www.codechef.com/JUNE221D/problems/SUBSCRIBE_
*/

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for (int i = 1 ; i <= t ; i++)
		{
		    double a = sc.nextDouble();
		    int b = sc.nextInt();
            System.out.println((int)Math.ceil(a/6)*b);
		}
	}
}
