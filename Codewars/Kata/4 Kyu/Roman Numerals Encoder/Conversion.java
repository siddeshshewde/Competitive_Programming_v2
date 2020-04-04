/*
Title:
    Roman Numerals Encoder

Kata:
    https://www.codewars.com/kata/51b62bf6a9c58071c600001b/train/java

Description:
    Create a function taking a positive integer as its parameter and returning a string containing the Roman Numeral representation of that integer.

    Modern Roman numerals are written by expressing each digit separately starting with the left most digit and skipping any digit with a value of zero. In Roman numerals 1990 is rendered: 1000=M, 900=CM, 90=XC; resulting in MCMXC. 2008 is written as 2000=MM, 8=VIII; or MMVIII. 1666 uses each Roman symbol in descending order: MDCLXVI.

Example:
    solution(1000); // should return "M"
    Help:

    Symbol    Value
    I          1
    V          5
    X          10
    L          50
    C          100
    D          500
    M          1,000
    Remember that there can't be more than 3 identical symbols in a row.

*/

public class Conversion {

    public String solution(int n) {
        int number [] = {1000, 990, 900, 500, 490, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String roman [] = {"M", "CMXC", "CM", "D", "CDXC", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder ans = new StringBuilder();
        int i = 0;
        while (n > 0 || number.length == (i-1))
        {
            while ((n - number[i]) >= 0)
            {
                n = n - number[i];
                ans.append(roman[i]);
            }
            i++;
        }
        return ans.toString();
    }
}