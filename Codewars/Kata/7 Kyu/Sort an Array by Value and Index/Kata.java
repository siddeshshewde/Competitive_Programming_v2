public class Kata
{
  public static int[] sortByValueAndIndex(int[] array)
  {
    int a[] = new int[array.length];
    for (int i = 0; i < array.length; i++)
        a[i] = array[i] * (i+1);
    for (int i = 0; i < array.length; i++)
    {
        for (int j = i+1; j < array.length; j++)
        {
            if (a[j] < a[i])
            {
                int t = array[i];
                array[i] = array[j];
                array[j] = t;
                int t1 = a[i];
                a[i] = a[j];
                a[j] = t1;
            }
        }
    }
    return array;
  }
}