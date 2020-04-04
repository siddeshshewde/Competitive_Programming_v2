/*
Title:
	Find the smallest integer in the array

Link:
	https://www.codewars.com/kata/55a2d7ebe362935a210000b2/train/java

Description:
	Given an array of integers your solution should find the smallest integer.

Example:
	Given [34, 15, 88, 2] your solution will return 2
	Given [34, -345, -1, 100] your solution will return -345
	
	You can assume, for the purpose of this kata, that the supplied array will not be empty.
*/

public class SmallestIntegerFinder {
    public static int findSmallestInt(int[] args) {
        int smallest = args[0];
        for (int i = 0; i < args.length; i++) {
            if (args[i] < smallest) {
                smallest = args[i];
            }
        }
        return smallest;
    }
}




/**
 * Other solution:
 * Source: https://www.codewars.com/kata/55a2d7ebe362935a210000b2/solutions/java
 *
 * Copyright belongs to the original author.
 * If it infringes on your rights and interests, please email me: siddesh.shewde@gmail.com
 */

import java.util.Arrays;
public class SmallestIntegerFinder {
    public static int findSmallestInt(int[] args) {
        Arrays.sort(args);
        return args[0];
    }
}