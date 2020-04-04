/*
Title:
	Descending Order

Kata:
	https://www.codewars.com/kata/5467e4d82edf8bbf40000155/train/java

Description:
	Your task is to make a function that can take any non-negative integer as a argument and return it with its digits in descending order. Essentially, rearrange the digits to create the highest possible number.

Examples:
	Input: 21445 Output: 54421

	Input: 145263 Output: 654321

	Input: 123456789 Output: 987654321

*/


public class DescendingOrder {
    public static int sortDesc(final int num) {
        int[] digitsCount = new int[10]; //contains all digits from 0..9 to increment their count
        int number = num;
        while (number != 0) {
            int digit = number % 10;
            digitsCount[digit]++;
            number /= 10;
        }
        int result = 0;
        for (int digit = 9; digit >= 0; --digit) {
            int count = digitsCount[digit];
            for (int i = 0; i < count; ++i)
                result = result * 10 + digit;
        }
        return result;
    }
}	



/**
 * Other solution:
 * Source: https://www.codewars.com/kata/5467e4d82edf8bbf40000155/solutions/java
 *
 * Copyright belongs to the original author.
 * If it infringes on your rights and interests, please email me: siddesh.shewde@gmail.com
 */


import java.util.Comparator;
import java.util.stream.Collectors;

public class DescendingOrder {
    public static int sortDesc(final int num) {
        return Integer.parseInt(String.valueOf(num)
                                      .chars()
                                      .mapToObj(i -> String.valueOf(Character.getNumericValue(i)))
                                      .sorted(Comparator.reverseOrder())
                                      .collect(Collectors.joining()));
    }
}