/*
Problem     : Compare within margin
Difficulty  : 8 Kyu
URL         : https://www.codewars.com/kata/56453a12fcee9a6c4700009c/train/java
*/

public class Solution {

  public static int closeCompare(double a, double b) {
    if (Math.abs(a-b) <= 0)
      return 0;
    if (a < b)
      return -1;
    return 1;
  }
  
  public static int closeCompare(double a, double b, double margin) {
    if (Math.abs(a-b) <= margin)
      return 0;
    if (a < b)
      return -1;
    return 1;
  }
}