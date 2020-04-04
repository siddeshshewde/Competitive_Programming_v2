/*
Title:
	nes and Zeros

Link:
	https://www.codewars.com/kata/578553c3a1b8d5c40300037c/train/java

Description:
	Given an array of ones and zeroes, convert the equivalent binary value to an integer.

	Eg: [0, 0, 0, 1] is treated as 0001 which is the binary representation of 1.

Examples:
	Testing: [0, 0, 0, 1] ==> 1
	Testing: [0, 0, 1, 0] ==> 2
	Testing: [0, 1, 0, 1] ==> 5
	Testing: [1, 0, 0, 1] ==> 9
	Testing: [0, 0, 1, 0] ==> 2
	Testing: [0, 1, 1, 0] ==> 6
	Testing: [1, 1, 1, 1] ==> 15
	Testing: [1, 0, 1, 1] ==> 11
	
	However, the arrays can have varying lengths, not just limited to 4.

*/

import java.util.List;

public class BinaryArrayToNumber
{
    public static int ConvertBinaryArrayToInt(List<Integer> binary)
	{
		int ans = 0;
		for (int i=0;i<4;i++)
		{
			int a = binary.get(i);
			switch (i)
			{
				case 0 : ans = ans + a*8; break;
				case 1 : ans = ans + a*4; break;
				case 2 : ans = ans + a*2; break;
				case 3 : ans = ans + a*1; break;
			}
		}
		return ans;
    }
}