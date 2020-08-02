/*
Problem      : Soldier and Bananas
Round        : 546A
Link         : https://codeforces.com/problemset/problem/546/A
Difficulty   : 800
Category     : brute force, implementation, math
Time Limit   : 1s
Memory Limit : 256mb
Language     : Java
Time Taken   : 187ms
Memory       : 23800kb
*/


import java.util.Scanner;
import java.io.InputStreamReader;
/**
 *
 * @author siddesh.sh
 */
public class Problem546A {

    public static void main(String[] args) {
        
        Scanner reader = new Scanner(new InputStreamReader(System.in));
        
        int cost = reader.nextInt();
        int money = reader.nextInt();
        int n = reader.nextInt();
        
        int balance = cost * n * (n + 1) / 2;
        
        if (money - balance < 0)
            System.out.print(Math.abs(money-balance));
        else
            System.out.print(0);
    }
    
}

