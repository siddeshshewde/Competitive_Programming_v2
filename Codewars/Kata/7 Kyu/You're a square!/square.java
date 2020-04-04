/*
Title:
	You're a square!

Kata:
	https://www.codewars.com/kata/54c27a33fb7da0db0100040e/train/java

Description:
	You like building blocks. You especially like building blocks that are squares. And what you even like more, is to arrange them into a square of square building blocks!

	However, sometimes, you can't arrange them into a square. Instead, you end up with an ordinary rectangle! Those blasted things! If you just had a way to know, whether you're currently working in vain… Wait! That's it! You just have to check if your number of building blocks is a perfect square.

Task:
	Given an integral number, determine if it's a square number:

	In mathematics, a square number or perfect square is an integer that is the square of an integer; in other words, it is the product of some integer with itself.

	The tests will always use some integral number, so don't worry about that in dynamic typed languages.

Examples:
	isSquare(-1) returns   false
	isSquare(0)  returns   true
	isSquare(3)  returns   false
	isSquare(4)  returns   true
	isSquare(25) returns   true  
	isSquare(26) returns   false

*/

public class Square {
    public static boolean isSquare(int n) {
        int i = 2;
        
        if (n < 0) {
            return false;
        }
        
        if (n == 0 || n == 1) {
            return true;
        }
        
        while (i < n) {
            if (i * i == n) {
                return true;
            }
            i++;
        }
        
        return false;
    }
}







/**
 * Other solution:
 * Source: https://www.codewars.com/kata/54c27a33fb7da0db0100040e/solutions/java
 *
 * Copyright belongs to the original author.
 * If it infringes on your rights and interests, please email me: siddesh.shewde@gmail.com
 */

import static java.lang.Math.*;

public class Square {
    public static boolean isSquare(int n) {
        return Math.sqrt(n) % 1 == 0;
    }
}