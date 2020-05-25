/*

Title:
    Day 1: Not Quite Lisp

Link:
    https://adventofcode.com/2015/day/1#

Description:
   Santa is trying to deliver presents in a large apartment building, but he can't find the right floor - 
   the directions he got are a little confusing. He starts on the ground floor (floor 0) and then follows the 
   instructions one character at a time.

    An opening parenthesis, (, means he should go up one floor, and a closing parenthesis, ), means he should 
    go down one floor.

    The apartment building is very tall, and the basement is very deep; he will never find the top or bottom floors.

    To what floor do the instructions take Santa?

Example:
    (()) and ()() both result in floor 0.
    ((( and (()(()( both result in floor 3.
    ))((((( also results in floor 3.
    ()) and ))( both result in floor -1 (the first basement level).
    ))) and )())()) both result in floor -3.

Puzzle Input:
    https://adventofcode.com/2015/day/1/input

*/


//Solution

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Day01
{
    public static void main(String args[]) throws IOException
    {
        //long startTime = System.currentTimeMillis();
        //System.out.println(startTime);
        BufferedReader br = new BufferedReader(new FileReader("day01.in"));
        String input = br.readLine();
        int floor = 0;
        for (int i = 0 ; i < input.length() ; i++)
        {
            if (input.charAt(i) == '(')
                floor += 1;
            if (input.charAt(i) == ')')
                floor -= 1;
        }
        System.out.println(floor);
        //long endTime = System.currentTimeMillis();
        //System.out.println(endTime);
        //System.out.println(endTime-startTime);
    }
}



/*
Lines of Code : 17
Time : 5ms
Solution : 280
*/
