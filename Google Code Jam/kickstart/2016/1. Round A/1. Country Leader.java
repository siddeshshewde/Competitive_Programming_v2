/*
# Problem      : Country Leader
# Year         : 2016
# Round        : A
# Points       : 4pts, 7pts
# Description  : https://codingcompetitions.withgoogle.com/kickstart/round/0000000000201ca2/0000000000201d30


## Problem Statement
The Constitution of a certain country states that the leader is the person with the name containing the greatest 
number of different alphabet letters. (The country uses the uppercase English alphabet from A through Z.) 
For example, the name GOOGLE has four different alphabet letters: E, G, L, and O. The name APAC CODE JAM has 
eight different letters. If the country only consists of these 2 persons, APAC CODE JAM would be the leader.

If there is a tie, the person whose name comes earliest in alphabetical order is the leader.

Given a list of names of the citizens of the country, can you determine who the leader is?

## Input
The first line of the input gives the number of test cases, T. T test cases follow. Each test case starts with 
a line with an interger N, the number of people in the country. Then N lines follow. The i-th line represents the 
name of the i-th person. Each name contains at most 20 characters and contains at least one alphabet letter.

## Output
For each test case, output one line containing Case #x: y, where x is the test case number (starting from 1) and 
y is the name of the leader.

## Limits
1 ≤ T ≤ 100.
Time limit: 20 seconds per test set.
Memory limit: 1GB.
1 ≤ N ≤ 100.

## Small dataset (Test set 1 - Visible)
Each name consists of at most 20 characters and only consists of the uppercase English letters A through Z.

## Large dataset (Test set 2 - Hidden)
Each name consists of at most 20 characters and only consists of the uppercase English letters A through Z and ' '(space).
All names start and end with alphabet letters.

## Examples

Input
2
3
ADAM
BOB
JOHNSON
2
A AB C
DEF

Output
Case #1: JOHNSON
Case #2: A AB C
 
In sample case #1, JOHNSON contains 5 different alphabet letters('H', 'J', 'N', 'O', 'S'), so he is the leader.

Sample case #2 would only appear in Large data set. The name DEF contains 3 different alphabet letters, the name A AB C 
also contains 3 different alphabet letters. A AB C comes alphabetically earlier so he is the leader.
*/


//Solution

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;


public class Solution
{

	Scanner read; 

	public static void main (String args[])
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
			int n = read.nextInt();
			String leaderName = "";
			int leaderScore = 0;
			read.nextLine();

			for (int j = 0 ; j < n ; j++)
			{
				String name = read.nextLine();
				String temp = name.replaceAll(" ","");
				HashSet<Character> names = new HashSet<Character>();  

				temp.chars().forEach(e -> names.add((char) e));

				if (names.size() > leaderScore)
				{
					leaderScore = names.size();
					leaderName = name;
				}
				else if (names.size() == leaderScore && leaderName.compareTo(name)>0)
				{
					leaderName = name;
				}

			}

			System.out.println(String.format("Case #%d: %s", i, leaderName));

		}
	}

}