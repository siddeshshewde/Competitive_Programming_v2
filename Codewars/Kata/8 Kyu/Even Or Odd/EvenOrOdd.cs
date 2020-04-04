using System;

namespace Solution
{
  public class SolutionClass
  {
    public static string EvenOrOdd(int number)
    {
       int n = number;
       if(n%2==0)
         return "Even";
       return "Odd";
    }
  }
}