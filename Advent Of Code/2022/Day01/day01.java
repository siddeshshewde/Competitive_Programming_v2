/* 
Title:         Day 1: Calorie Counting
Link:          https://adventofcode.com/2022/day/1
Puzzle Input:  https://adventofcode.com/2022/day/1/input
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class day01
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new FileReader("input.in"));
        String s = br.readLine();
        int max = 0, sum = 0;
        while (s != null)
        {
            if (s.isEmpty())
            {
                if (sum > max)
                {
                    max = sum;
                }
                sum = 0;
                s = br.readLine();
                continue;
            }
            sum = sum + Integer.parseInt(s);
            s = br.readLine();
        }
        System.out.print(max);
    }
}