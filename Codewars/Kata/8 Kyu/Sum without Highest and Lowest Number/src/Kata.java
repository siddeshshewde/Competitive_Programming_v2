public class Kata
{
  public static int sum(int[] numbers)
  {
    if (numbers == null || numbers.length == 0 || numbers.length == 1)
       { return 0;}
    int m,n,result;
    n = m = result = numbers[0];
    for (int i = 1; i < numbers.length; i++)
    {
        result = result + numbers[i];
        if (numbers[i] < m)
            m = numbers[i];
        if (numbers[i] > n)
            n = numbers[i];
    }
    return result - m - n;
  }
}