/*
Title:
    Day 2: I Was Told There Would Be No Math

Link:
    https://adventofcode.com/2015/day/2#

Description Part1:
	The elves are running low on wrapping paper, and so they need to submit an order for more. 
    They have a list of the dimensions (length l, width w, and height h) of each present, and only 
    want to order exactly as much as they need.

	Fortunately, every present is a box (a perfect right rectangular prism), which makes calculating 
	the required wrapping paper for each gift a little easier: find the surface area of the box, which 
	is 2*l*w + 2*w*h + 2*h*l. The elves also need a little extra paper for each present: the area of 
	the smallest side.

	All numbers in the elves' list are in feet. How many total square feet of wrapping paper should they order?

Example:
	A present with dimensions 2x3x4 requires 2*6 + 2*12 + 2*8 = 52 square feet of wrapping paper plus 6 square feet of slack, for a total of 58 square feet.
	A present with dimensions 1x1x10 requires 2*1 + 2*10 + 2*10 = 42 square feet of wrapping paper plus 1 square foot of slack, for a total of 43 square feet.
	

Description Part2:
    Now, given the same instructions, find the position of the first character that causes him to enter the basement (floor -1). 
    The first character in the instructions has position 1, the second character has position 2, and so on.
    What is the position of the character that causes Santa to first enter the basement?

Example:
    ) causes him to enter the basement at character position 1.
    ()()) causes him to enter the basement at character position 5.

Puzzle Input:
    https://adventofcode.com/2015/day/2/input
*/


//Solution

import java.util.*;
import java.io.*;


public class Day02
{
	public static void main(String args[]) throws IOException
	{
		long startTime = System.currentTimeMillis();
        System.out.println(startTime);
		Scanner br = new Scanner(new File("day02.in"));

		int shortestArea = 0;
		long totalArea = 0;

		while (br.hasNextLine())
		{
		    String [] dimensions = br.nextLine().split("x");
		    int [] d = new int [3];
		    int i=0;

		    for (String str : dimensions)
                d[i++] = Integer.parseInt(str);
		    
		    if (d[0] > 10000 && d[1] > 10000 && d[2] > 10000)
		        continue;
		        
			shortestArea = shortestArea(d, shortestArea);
			totalArea += totalArea(d, shortestArea);
		}
		
		long endTime = System.currentTimeMillis();
        System.out.println(endTime);
        System.out.println(endTime-startTime);
		System.out.println(totalArea);

	}

	public static int shortestArea(int [] d, int shortestArea)
	{
		if (d[0]*d[1] > d[1]*d[2])
		{
		    if (d[1]*d[2] > d[0]*d[2])
		    {
		        shortestArea = d[0]*d[2];
		    }
		    else
		    {
		        shortestArea = d[1]*d[2];        
		    }
		}
		else
		{
		    if (d[0]*d[1] > d[0]*d[2])
		    {
		        shortestArea = d[0]*d[2];
		    }
		    else
		    {
		        shortestArea = d[0]*d[1];        
		    }
		}
		return shortestArea;
	}

	public static int totalArea(int [] d, int shortestArea)
	{
		return 2 * (d[0]*d[1] + d[1]*d[2] + d[2]*d[0]) + shortestArea;
	}
}

/*
Lines of Code  : 70
Time           : 71ms
Solution Part1 : 1598415
Solution Part2 : 1797
*/