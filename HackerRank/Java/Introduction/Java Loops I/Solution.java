/*
Problem     : Java Loops I
Difficulty  : Easy
Max Score   : 10
URL         : https://www.hackerrank.com/challenges/java-loops-i/problem
*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        for (int i = 1 ; i < 11 ; i++)
        {
            System.out.printf("%d x %d = %d\n", N, i, N * i);
        }
        
        bufferedReader.close();
    }
}