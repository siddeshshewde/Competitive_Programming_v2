public class Solution {
  public static int century(int number) {
      if(number < 101 && number != 0)
          return 1;
      int solution = number / 100;
      if (number > (solution * 100))
          ++solution;
      return solution;
  }
}