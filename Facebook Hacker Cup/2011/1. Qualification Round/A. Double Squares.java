/*
# Problem      : Double Squares
# Year         : 2011
# Round        : Qualification Round
# Problem      : A
# Points       : 100pts
# Description  : https://www.facebook.com/codingcompetitions/hacker-cup/2011/qualification-round/problems/A
# Time	       : 
# Space	       : 

## Problem Statement
A double-square number is an integer X which can be expressed as the sum of two perfect squares. 
For example, 10 is a double-square because 10 = 32 + 12. Your task in this problem is, given X, determine the number of ways in which it can be written as the sum of two squares. 
For example, 10 can only be written as 32 + 12 (we don't count 12 + 32 as being different). 
On the other hand, 25 can be written as 52 + 02 or as 42 + 32.

## Input
You should first read an integer N, the number of test cases. The next N lines will contain N values of X.

## Output
For each value of X, you should output the number of ways to write X as the sum of two squares.

## Constraints
0 ≤ X ≤ 2147483647
1 ≤ N ≤ 100

## Example

Input
5
10
25
3
0
1

Output
Case #1: 1
Case #2: 2
Case #3: 0
Case #4: 1
Case #5: 1

*/




*/

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;

/**
 *
 * @author siddesh.sh
 */

public class double_square 
{
	public static void main (String args[]) throws FileNotFoundException, IOException
	{
		BufferedReader br = new BufferedReader(new FileReader("input.txt"));
		PrintWriter pw = new PrintWriter(new FileWriter("output.txt"));

		int n = Integer.parseInt(br.readLine());

		for (int i = 1 ; i <= n ; i++)
		{
			int number = Integer.parseInt(br.readLine());
			
                        pw.println("Case #" + i + ": " + Solution.doubleSquare(number));
		}
		pw.close();
	}

	public static int doubleSquare(int number)
	{
		int count = 0;

		for (int i = 0 ; i <= Math.sqrt(number) ; i++)
		{
			for (int j = i ; j <= Math.sqrt(number) ; j++)
			{
				if (Math.pow(i,2) + Math.pow(j,2) == number)
					count++;
			}
		}
		return count;
	} 
}
