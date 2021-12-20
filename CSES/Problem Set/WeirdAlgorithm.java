/*
Title        : Weird Algorithm
Problem      : https://cses.fi/problemset/task/1068/
Time limit   : 1.00 s 
Memory limit : 512 MB
*/

import java.util.Scanner;

public class WeirdAlgorithm
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        double n = sc.nextDouble();
        sc.close();
        System.out.printf("%.0f ", n);
        
        while (n > 1)
        {
            if (n % 2 == 0)
            {
                n /= 2;
                System.out.printf("%.0f ", n);
            }
            else
            {
                n = n * 3 + 1;
                System.out.printf("%.0f ", n);
            }
        }
        return;
    }
}