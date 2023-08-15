/* 
Title:         Day 2: Rock Paper Scissors
Link:          https://adventofcode.com/2022/day/2
Puzzle Input:  https://adventofcode.com/2022/day/2/input
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class day02p1
{
    public static void main (String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new FileReader("input.in"));
        String s = br.readLine();
        String [] game = {};
        int total_points = 0;
        while (s != null)
        {
            game = s.split(" ");
            total_points += winner(game[0], game[1]);
            s = br.readLine();
        }
        System.out.print(total_points);
    }

    public static int winner (String a, String b)
    {
        int sum = 0;
        
        if (b.equals("X")) 
        {
            sum += 1;
        }
        else if(b.equals("Y"))
        {
            sum += 2;
        }    
        else
        {
            sum += 3;
        }   
        if((a.equals("A") && b.equals("X")) || (a.equals("B") && b.equals("Y")) || (a.equals("C") && b.equals("Z")))
        {
            sum += 3;
        }

        else if ((a.equals("A") && b.equals("Y")) || (a.equals("B") && b.equals("Z")) || (a.equals("C") && b.equals("X")))
        {
            sum += 6;
        }
        return sum;
    }
}