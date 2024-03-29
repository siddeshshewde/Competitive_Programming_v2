/*
# Problem      : Sample Problem
# Year         : 2022
# Round        : Coding Practice
# Points       : 1pt
# Description  : https://codingcompetitions.withgoogle.com/kickstart/round/00000000008f49d7/0000000000bcee64
*/

import java.util.Scanner;

public class Solution
{

    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 1 ; i <= t ; i++)
        {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int a[] = new int [n];
            int sum = 0;

            for (int j = 0 ; j < n ; j++)
            {
                a[j] = sc.nextInt();
                sum += a[j];
            }
            sum = sum%m;
            System.out.print("Case #");
            System.out.print(i);
            System.out.print(": ");
            System.out.println(sum);
            
        }
    }

}
