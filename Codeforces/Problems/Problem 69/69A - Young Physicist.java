/*
Problem      : Young Physicist
Round        : 69A
Link         : https://codeforces.com/problemset/problem/69/A
Difficulty   : 1000
Category     : implementation, math
Time Limit   : 2s
Memory Limit : 256mb
Language     : Java
Time Taken   : 404ms
Memory       : 23800kb
*/


import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author siddesh.sh
 */
public class Problem69A {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        Scanner reader = new Scanner(new InputStreamReader(System.in));
        PrintWriter writer = new PrintWriter(System.out);
        
        int n = reader.nextInt();
        int a = 0, b = 0, c = 0;
        
        for (int i = 0 ; i < n ; i++)
        {
            a += reader.nextInt();
            b += reader.nextInt();
            c += reader.nextInt();
        }
        
        if (a==b && b==c && c==0)
            System.out.print("YES");
        else
            System.out.print("NO");
            
    }
    
}
