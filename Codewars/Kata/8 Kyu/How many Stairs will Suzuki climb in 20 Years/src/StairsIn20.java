public class Kata
{
    public static long stairsIn20(int[][] stairs)
    {
       int count = 0;
       for (int i=0;i<stairs.length;i++)
       {
         for (int j=0;j<stairs[i].length;j++)
         {
             count = count + stairs[i][j];
         }
       }
       return count*20;
    }
}