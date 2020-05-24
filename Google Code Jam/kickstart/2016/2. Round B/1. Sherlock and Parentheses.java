/*
# Problem      : Sherlock and Parentheses
# Year         : 2016
# Round        : B
# Points       : 4pts, 7pts
# Description  : https://codingcompetitions.withgoogle.com/kickstart/round/0000000000201c0c/0000000000201ca5


## Problem Statement
Sherlock and Watson have recently enrolled in a computer programming course. Today, the tutor taught them about 
the balanced parentheses problem. A string S consisting only of characters ( and/or ) is balanced if:
It is the empty string, or:
It has the form (S), where S is a balanced string, or:
It has the form S1S2, where S1 is a balanced string and S2 is a balanced string.

Sherlock coded up the solution very quickly and started bragging about how good he is, so Watson gave him a 
problem to test his knowledge. He asked Sherlock to generate a string S of L + R characters, in which there 
are a total of L left parentheses ( and a total of R right parentheses ). Moreover, the string must have as 
many different balanced non-empty substrings as possible. (Two substrings are considered different as long 
as they start and end at different indexes of the string, even if their content happens to be the same). 
Note that S itself does not have to be balanced.

Sherlock is sure that once he knows the maximum possible number of balanced non-empty substrings, he will be 
able to solve the problem. Can you help him find that maximum number?

## Input
The first line of the input gives the number of test cases, T. T test cases follow. Each test case consists 
of one line with two integers: L and R.

## Output
For each test case, output one line containing Case #x: y, where x is the test case number (starting from 1) 
and y is the answer, as described above.

## Limits
1 ≤ T ≤ 100.
Time limit: 20 seconds per test set.
Memory limit: 1GB.

## Small dataset (Test set 1 - Visible)
0 ≤ L ≤ 20.
0 ≤ R ≤ 20.
1 ≤ L + R ≤ 20.

## Large dataset (Test set 2 - Hidden)
0 ≤ L ≤ 105.
0 ≤ R ≤ 105.
1 ≤ L + R ≤ 105.

## Examples

Input
3
1 0
1 1
3 2

Output
Case #1: 0
Case #2: 1
Case #3: 3
 
In Case 1, the only possible string is (. There are no balanced non-empty substrings.
In Case 2, the optimal string is (). There is only one balanced non-empty substring: the entire string itself.
In Case 3, both strings ()()( and (()() give the same optimal answer.
For the case ()()(, for example, the three balanced substrings are () from indexes 1 to 2, () from indexes 3 to 4, and ()() from indexes 1 to 4.
*/


//Solution

import java.util.Scanner;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;


public class Solution
{
	Scanner read;

	public static void main(String args[])
	{
		Solution a = new Solution();
		a.start();
	}

	public void start()
	{
		try
		{
			read = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
			solve();
		}
		catch(Throwable t)
		{
			t.printStackTrace();
		}
	}

	public void solve()
	{
		int t = read.nextInt();
		for (int i = 1 ; i <= t ; i++)
		{
			long L = read.nextLong();
			long R = read.nextLong();

			long maximum_pairs = Math.min(L, R);

			long solution = maximum_pairs * (1 + maximum_pairs) / 2;

			System.out.println(String.format("Case #%d: %d", i, solution));

		}
	}
}
