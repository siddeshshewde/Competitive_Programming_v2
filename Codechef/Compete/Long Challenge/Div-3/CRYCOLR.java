/*
Problem: CRYCOLR
Contest: JAN222C
Link: https://www.codechef.com/JAN222C/problems/CRYCOLR 
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
        
        for (int i = 0 ; i < t ; i++)
        {
            int n = sc.nextInt();
            int m[][] = new int [3][3];
            int ans = 0;
            
            for (int j = 0 ; j < 3 ; j++)
            {
                m[j][0] = sc.nextInt();
                m[j][1] = sc.nextInt();
                m[j][2] = sc.nextInt();
            }
            
            if (m[0][0] == m[1][1] && m[1][1] == m[2][2] && m[2][2] == n)
            {
                System.out.println(0);
            }
            else
            {
                System.out.println(Math.max(m[0][1]+m[0][2]+m[1][2], m[1][0]+m[2][0]+m[2][1]));
            }
        }
        return;
	}
}
