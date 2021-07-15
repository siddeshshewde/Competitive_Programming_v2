/*
Problem     : Java Output Formatting
Difficulty  : Easy
Max Score   : 10
URL         : https://www.hackerrank.com/challenges/java-output-formatting/problem
*/

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                String y = "" + String.valueOf(x);
                if (x < 100)
                    y = "0" + y;
                if (x < 10)
                    y = "0" + y;
                while (s1.length() < 15)
                    s1 += " ";
                System.out.println(s1 + y);
            }
            System.out.println("================================");

    }
}



