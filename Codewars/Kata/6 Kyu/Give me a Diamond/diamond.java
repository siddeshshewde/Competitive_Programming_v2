/*
Title:
	Give me a Diamond

Kata:
	https://www.codewars.com/kata/5503013e34137eeeaa001648/train/java

Description:
	Jamie is a programmer, and James' girlfriend. She likes diamonds, and wants a diamond string from James. Since James doesn't know how to make this happen, he needs your help.

Task:
	You need to return a string that looks like a diamond shape when printed on the screen, using asterisk (*) characters. Trailing spaces should be removed, and every line must be terminated with a newline character (\n).

	Return null/nil/None/... if the input is an even number or negative, as it is not possible to print a diamond of even or negative size.

Example:
	A size 3 diamond:

	 *
	***
	 *
	...which would appear as a string of " *\n***\n *\n"

	A size 5 diamond:

	  *
	 ***
	*****
	 ***
	  *
	...that is: " *\n ***\n*****\n ***\n *\n"

*/




public class Diamond
{
	public static String print(int n)
	{
		int a=n;
		String ans = "";
		int space = n-1;
    		
		if (a%2==0 || a < 0)
		{
			return null;
		}
		for (int i = 1; i < a; i += 2)
		{
			for (int j = 0; j < a - 1 - i / 2; j++)
			{
				ans = ans + " ";
			}
			for (int j = 0; j < i; j++)
			{
				ans = ans + "*";
			}

			ans = ans + "\n";
		}
	
		for (int i = a; i > 0; i -= 2)
		{
			for (int j = 0; j < a -1 - i / 2; j++)
			{
				ans = ans + " ";
			}

			for (int j = 0; j < i; j++)
			{
				ans = ans + "*";
			}

			ans = ans + "\n";
		}
		return ans;
	}
}