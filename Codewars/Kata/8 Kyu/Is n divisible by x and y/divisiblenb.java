/*
Title:
	Is n divisible by x and y?

Kata:
	https://www.codewars.com/kata/5545f109004975ea66000086/train/java

Description:
	Create a function that checks if a number n is divisible by two numbers x AND y. All inputs are positive, non-zero digits.

Example:
	n = 3, x = 1, y = 3 => true because 3 is divisible by 1 and 3
	n = 12, x = 2, y = 6 => true because 12 is divisible by 2 and 6
	n = 100, x = 5, y = 3 => false because 100 is not divisible by 3
	n = 12, x = 7, y = 5 => false because 12 is neither divisible by 7 nor 5

*/

public class DivisibleNb {
  	public static Boolean isDivisible(long n, long x, long y) {
      	if(n % x == 0 && n % y == 0) return true;
      	return false;
  	}
}