/*
Title:
	Find the odd int

Kata:
	https://www.codewars.com/kata/54da5a58ea159efa38000836/train/java

Description:
	Given an array, find the integer that appears an odd number of times.

	There will always be only one integer that appears an odd number of times.

*/


public class FindOdd {
    public static int findIt(int[] A) {

        int odd = 0;
        for (int i = 0; i < A.length; i++) {
            odd = odd ^ A[i];  // XOR will cancel out everytime you XOR with the same number so 1^1=0 but 1^1^1=1 so every pair should cancel out leaving the odd number out
        }

        return odd;
    }
}

