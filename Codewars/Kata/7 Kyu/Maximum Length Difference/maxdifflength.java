/*
Title:
	Maximum Length Difference

Kata:
	https://www.codewars.com/kata/5663f5305102699bad000056/train/java

Description:
	You are given two arrays a1 and a2 of strings. Each string is composed with letters from a to z. Let x be any string in the first array and y be any string in the second array.

	Find max(abs(length(x) − length(y)))

	If a1 and/or a2 are empty return -1 in each language except in Haskell (F#) where you will return Nothing (None).

Example:
	a1 = ["hoqq", "bbllkw", "oox", "ejjuyyy", "plmiis", "xxxzgpsssa", "xxwwkktt", "znnnnfqknaz", "qqquuhii", "dvvvwz"]
	a2 = ["cccooommaaqqoxii", "gggqaffhhh", "tttoowwwmmww"]
	mxdiflg(a1, a2) --> 13

*/


class MaxDiffLength
{
	public static int mxdiflg (String [] a1, String[] a2)
	{
		if (a1.length == 0 || a2.length == 0)
		{
			return -1;
		}
		int max = 0;
		for (int i = 0; i < a1.length; i++)
		{
			for (int j = 0; j < a2.length; j++)
			{
				if (max < Math.abs(a1[i].length() - a2[j].length()))
        {
					max = Math.abs(a1[i].length() - a2[j].length());
        }
			}
		}
		return max;
	}
}