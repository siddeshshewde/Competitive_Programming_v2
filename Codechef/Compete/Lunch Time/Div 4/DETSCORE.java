/*
Problem: DETSCORE
Contest: LTIME109D
Link: https://www.codechef.com/submit-v2/DETSCORE
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
		
		for (int i = 1 ; i <= t; i++)
		{
		    int a = sc.nextInt();
		    int b = sc.nextInt();
	        System.out.println(a/10*b);
		}      
	}
}
