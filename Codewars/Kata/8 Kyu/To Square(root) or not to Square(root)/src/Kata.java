public class Kata
{
  public static int[] squareOrSquareRoot(int[] array)
  {
    for (int i = 0; i < array.length; i++)
    {
      int n = (int)Math.sqrt(array[i]);
      array[i] = (n*n == array[i]) ?n : array[i]*array[i];
    }
    return array;
  }
}