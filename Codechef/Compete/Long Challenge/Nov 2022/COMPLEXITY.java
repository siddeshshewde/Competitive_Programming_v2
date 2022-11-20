/*
Problem: COMPLEXITY
Contest: NOV221
Link: https://www.codechef.com/problems/COMPLEXITY
*/

import java.util.Scanner;

class codechef
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for ( int i = 1 ; i <= t ; i++)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a > b)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
