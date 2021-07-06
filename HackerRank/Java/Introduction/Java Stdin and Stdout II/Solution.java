/*
Problem     : Java Stdin and Stdout II
Difficulty  : Easy
Max Score   : 10
URL         : https://www.hackerrank.com/challenges/java-stdin-stdout/problem
*/

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        Double d = scan.nextDouble();
        scan.nextLine();
        String s = scan.nextLine();

        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
