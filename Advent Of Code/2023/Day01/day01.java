/* 
Title:         Day 1: Trebuchet?!
Link:          https://adventofcode.com/2023/day/1
Puzzle Input:  https://adventofcode.com/2023/day/1/input
*/


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class day01
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader read = new BufferedReader(new FileReader("inputt.txt"));
        int totalSum = 0;
        String n;

        while ((n = read.readLine()) != null)
        {
            int sum = 0;
            
            for (char c : n.toCharArray())
            {
                if (Character.isDigit(c))
                {
                    sum = sum * 10 + Integer.parseInt(String.valueOf(c));
                    break;
                }
            }        

            for (int i = n.length()-1 ; i >= 0 ; i--)
            {
                if (Character.isDigit(n.charAt(i)))
                {
                    sum = sum * 10 + Integer.parseInt(String.valueOf(n.charAt(i)));
                    break;
                }
            }
            System.out.println(sum);
            totalSum += sum;
        }
        System.out.println(totalSum);
        read.close();
    }
}

/*
Lines of Code  : 40
Time           : 61ms
Solution       : 54331
*/