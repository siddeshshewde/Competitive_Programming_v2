/*
Problem     : Java End-of-file
Difficulty  : Easy
Max Score   : 10
URL         : https://www.hackerrank.com/challenges/java-end-of-file/problem
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int i = 1;
        while (sc.hasNextLine())
            {
            String s = sc.nextLine();
            System.out.println(i + " " + s);
            i++;
        }
    }
}