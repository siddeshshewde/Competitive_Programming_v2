/*
Problem     : Java Loops II
Difficulty  : Easy
Max Score   : 10
URL         : https://www.hackerrank.com/challenges/java-loops/problem
*/

import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int j=0;j<t;j++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            int sol = a + b;
            System.out.printf("%d ", sol);
            
            for(int i = 1 ; i < n ; i++)
            {
                sol = sol + (int)(Math.pow(2, i) * b);
                System.out.printf("%d ", sol);
            }
            System.out.println();
        }
        in.close();
    }
}