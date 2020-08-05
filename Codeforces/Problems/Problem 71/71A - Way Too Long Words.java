/*
Problem      : Way Too Long Words
Round        : 71A
Link         : https://codeforces.com/problemset/problem/71/A
Difficulty   : 800
Category     : strings
Time Limit   : 1s
Memory Limit : 256mb
Language     : Java
Time Taken   : 218ms
Memory       : 24400kb
*/

import java.io.InputStreamReader;
import java.util.Scanner;
 
/**
 *
 * @author siddesh.sh
 */
public class Problem71A {
 
    public static void main(String[] args)  {
        
        Scanner reader = new Scanner(new InputStreamReader(System.in));
        
        int t = reader.nextInt();
        String n = "";
        
        for (int i = 0 ; i < t ; i++)
        {
            n = reader.next();
            
            if (n.length() > 10)
                System.out.println(n.charAt(0) + "" + (n.length()-2) + "" + n.charAt(n.length()-1));
            else
                System.out.println(n);
        }
    }
}