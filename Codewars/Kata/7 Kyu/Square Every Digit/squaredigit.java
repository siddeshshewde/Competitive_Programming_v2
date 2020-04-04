/*
Title:
	Square Every Digit

Kata:
	https://www.codewars.com/kata/546e2562b03326a88e000020/train/java

Description:
	Welcome. In this kata, you are asked to square every digit of a number.

	For example, if we run 9119 through the function, 811181 will come out, because 92 is 81 and 12 is 1.

	Note: The function accepts an integer and returns an integer
*/

public class SquareDigit {

    public int squareDigits(int n) {
        
        String s = n + "";
        String[] digits = s.split("");
        String output = "";

        for (String str: digits) {
            int i = Integer.parseInt(str);
            output += i * i;
        }
        
        return Integer.parseInt(output);
    }
}