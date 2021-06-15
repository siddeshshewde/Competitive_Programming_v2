/*
Problem     : Find the Squares
Difficulty  : 7 Kyu
URL         : https://www.codewars.com/kata/60908bc1d5811f0025474291/train/java
*/

public class Solution
{
    public static String findSquares(int n)
    {
        for (double i = 0 ; ; i++)
        {
            if ((i+1)*(i+1) - i*i == n)
            {
                String answer = String.format("%.0f", (i+1)*(i+1)) + "-" + String.format("%.0f", i*i);
                return answer;
            }
        }
    }
}