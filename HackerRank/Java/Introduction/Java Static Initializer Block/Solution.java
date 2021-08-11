/*
Problem     : Java Static Initializer Block
Difficulty  : Easy
Max Score   : 10
URL         : https://www.hackerrank.com/challenges/java-static-initializer-block/problem
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static boolean flag = true;
    static Scanner in = new Scanner(System.in);
    static int B;
    static int H;
    
    static {
        B = Integer.parseInt(in.next());
        H = Integer.parseInt(in.next());
        in.close();
        
        if (B < 0 || H < 0)
        {
            flag = false;
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }

public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class

