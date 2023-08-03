/* 
Title:         Day 1: Calorie Counting
Link:          https://adventofcode.com/2022/day/1
Puzzle Input:  https://adventofcode.com/2022/day/1/input
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class day01p2
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new FileReader("input.in"));
        String s = br.readLine();
        List <Integer> calories = new ArrayList<>(); 
        int sum = 0;
        while (s != null)
        {
            if (s.isEmpty())
            {
                calories.add(sum);
                sum = 0;
                s = br.readLine();
                continue;
            }
            sum = sum + Integer.parseInt(s);
            s = br.readLine();
        }
        Collections.sort(calories, Collections.reverseOrder());
        System.out.print(calories.get(0) + calories.get(1) + calories.get(2));
    }
}