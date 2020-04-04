/*
Title:
	String repeat

Kata:
	https://www.codewars.com/kata/57a0e5c372292dd76d000d7e/train/java

Description:
	Write a function called repeatString which repeats the given String src exactly count times.

Example:
	repeatStr(6, "I") // "IIIIII"
	repeatStr(5, "Hello") // "HelloHelloHelloHelloHello"

*/

public class Solution
{
    public static String repeatStr(final int repeat, final String string)
  	{
    	String ans = "";
    	for (int i=0;i<repeat;i++)
      		ans = ans + string;
    	return ans;
    }
}