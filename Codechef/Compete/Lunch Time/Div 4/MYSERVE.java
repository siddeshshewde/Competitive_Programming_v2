/*
Problem: MYSERVE
Contest: LTIME109D
Link: https://www.codechef.com/submit-v2/MYSERVE
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
        
        while (t-- > 0) 
        {
            int p = sc.nextInt();
            int q = sc.nextInt();
            int sum = p + q;
            if (sum % 2 == 1) 
            { 
                sum--; 
            } 
            sum /= 2;
            if (sum % 2 == 1) {
                System.out.println("bob");
            } else {
                System.out.println("alice");
            }

        }   
    }
}
