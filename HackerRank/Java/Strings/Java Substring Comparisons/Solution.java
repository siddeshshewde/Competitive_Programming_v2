/*
Problem     : Java Substring Comparisons
Difficulty  : Easy
Max Score   : 10
URL         : https://www.hackerrank.com/challenges/java-string-compare/problem
*/

import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0,k);
        String largest = s.substring(0,k);
        
        for (int i = 0 ; i <= s.length()-k ; i++)
        {
            String a = s.substring(i,k+i);
            
            if (smallest.compareTo(a) > 0)
                smallest = a;
            if (largest.compareTo(a) < 0)
                largest = a;
        }
        
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}