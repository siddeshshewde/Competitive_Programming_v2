/*
Title:
	Two to One

Link:
	https://www.codewars.com/kata/5656b6906de340bd1b0000ac/train/java

Description:
	Take 2 strings s1 and s2 including only letters from ato z. Return a new sorted string, the longest possible, containing distinct letters,

	each taken only once - coming from s1 or s2.
	
Examples:
	a = "xyaabbbccccdefww"
	b = "xxxxyyyyabklmopq"
	longest(a, b) -> "abcdefklmopqwxy"

	a = "abcdefghijklmnopqrstuvwxyz"
	longest(a, a) -> "abcdefghijklmnopqrstuvwxyz"

*/

public class TwoToOne {
    public static String longest(String s1, String s2) {
        String s = s1 + s2;
        return s.chars().distinct().sorted().collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();
    }
}