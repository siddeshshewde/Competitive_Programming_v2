public class Kata{
  public static double find_average(int[] array){
    double average = 0;
    for (int i = 0; i < array.length; i++)
    {
      average = average + array[i];
    }
    return average/array.length;
  }
}