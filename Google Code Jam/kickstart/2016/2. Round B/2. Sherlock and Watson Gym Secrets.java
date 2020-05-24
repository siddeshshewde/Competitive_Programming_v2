/*
# Problem      : Sherlock and Parentheses
# Year         : 2016
# Round        : B
# Points       : 6pts, 15pts
# Description  : https://codingcompetitions.withgoogle.com/kickstart/round/0000000000201c0c/0000000000201d32


## Problem Statement
Watson and Sherlock are gym buddies.

Their gym trainer has given them three numbers, A, B, and N, and has asked Watson and Sherlock to pick two different positive 
integers i and j, where i and j are both less than or equal to N. Watson is expected to eat exactly iA sprouts every day, and 
Sherlock is expected to eat exactly jB sprouts every day.

Watson and Sherlock have noticed that if the total number of sprouts eaten by them on a given day is divisible by a certain integer K, 
hen they get along well that day.

So, Watson and Sherlock need your help to determine how many such pairs of (i, j) exist, where i != j. As the number of pairs can 
be really high, please output it modulo 109+7 (1000000007).

## Input
The first line of the input gives the number of test cases, T. T test cases follow. Each test case consists of one line with 4 
integers A, B, N and K, as described above.

## Output
For each test case, output one line containing Case #x: y, where x is the test case number (starting from 1) and y is the required 
answer.

## Limits
1 ≤ T ≤ 100.
Time limit: 60 seconds per test set.
Memory limit: 1GB.
0 ≤ A ≤ 106.
0 ≤ B ≤ 106.

## Small dataset (Test set 1 - Visible)
1 ≤ K ≤ 10000.
1 ≤ N ≤ 1000.

## Large dataset (Test set 2 - Hidden)
1 ≤ K ≤ 100000.
1 ≤ N ≤ 1018.

## Examples

Input
3
1 1 5 3
1 2 4 5
1 1 2 2

Output
Case #1: 8
Case #2: 3
Case #3: 0
 
In Case 1, the possible pairs are (1, 2), (1, 5), (2, 1), (2, 4), (4, 2), (4, 5), (5, 1), and (5, 4). 
In Case 2, the possible pairs are (1, 2), (1, 3), and (4, 1). 
In Case 3, No possible pairs are there, as i != j.
*/


//Solution

import java.util.Scanner;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.lang.Math;

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
			int A     = read.nextInt();
			int B     = read.nextInt();
			long N    = read.nextLong();
			int K     = read.nextInt();
			int count = 0;

			for (int j = 1 ; j <= N ; j++)
			{
				for (int k = 1 ; k <= N ; k++)
				{
					if ((Math.pow(j, A) + Math.pow(k, B)) % K == 0 && j != k)
						count = (count + 1) % 1000000007;
				}
			}
			System.out.println(String.format("Case #%d: %d", t, count));
		}
	}
}