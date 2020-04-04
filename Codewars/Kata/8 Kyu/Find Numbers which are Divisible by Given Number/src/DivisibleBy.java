public class EvenNumbers {
  public static int[] divisibleBy(int[] numbers, int divider) {
      int k = 0,count=0;
      
      for (int i=0;i<numbers.length;i++)
      {
          if(numbers[i]%divider==0)
              count++;
      }
      int a [] = new int [count];
      for (int i=0;i<numbers.length;i++)
      {
          if (numbers[i] % divider == 0)
          {
              a[k] = (int)numbers[i];
              k++;
          }
      }
      
      return a;
  }
}