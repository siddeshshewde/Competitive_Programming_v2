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