/*
Problem: Find Character Case
URL: https://www.codingninjas.com/studio/problems/find-character-case_58513
*/

import java.util.Scanner;

public class Solution {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char a = sc.next().charAt(0);

        if( (a >= 'a' && a <= 'z') || (a >= 'A' && a <= 'Z'))
        {
            if(Character.toLowerCase(a) == a)
            {
                System.out.println("0");
            }
            else
            {
                System.out.println("1");
            }
        }
        else
        {
            System.out.println("-1");
        }

    }
}