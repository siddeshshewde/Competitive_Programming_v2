/*
Problem: ALTERADD
Contest: JUNE221D
Link: https://www.codechef.com/JUNE221D/problems/ALTERADD
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
		    int ans = (b-a)%3;
		    
		    if (ans == 2)
		        System.out.println("NO");
		    else 
		        System.out.println("Yes");
		}       
	}
}
