/*
Problem      : Elephant
Round        : 617A
Link         : https://codeforces.com/problemset/problem/617/A
Difficulty   : 800
Category     : math
Time Limit   : 1s
Memory Limit : 256mb
Language     : Java
Time Taken   : 186ms
Memory       : 23800kb
*/


import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author siddesh.sh
 */
public class Problem617A {

    public static void main(String[] args)  {
        
        Scanner reader = new Scanner(new InputStreamReader(System.in));
        
        int n = reader.nextInt();
        
        if (n%5 == 0)
            System.out.print(n/5)
        else
            System.out.print((n/5)+1);
    }
    
}
