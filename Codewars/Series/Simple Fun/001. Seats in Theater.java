/*
Series      : Simple Fun 
Problem     : #1: Seats in Theater
Difficulty  : 8 Kyu
URL         : https://www.codewars.com/kata/588417e576933b0ec9000045/train/java
*/

public class Kata 
{
  public static int seatsInTheater(int nCols, int nRows, int col, int row) 
  {
    return (nCols-col+1) * (nRows-row);
  }
}