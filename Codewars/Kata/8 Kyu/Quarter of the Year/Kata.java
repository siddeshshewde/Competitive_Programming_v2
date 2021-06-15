/*
Problem     : Quarter of the year
Difficulty  : 8 Kyu
URL         : https://www.codewars.com/kata/5ce9c1000bab0b001134f5af/train/java
*/

public class Kata 
{
    public static int quarterOf(int month) 
    {
        if (month > 9)
            return 4;
        if (month > 6)
            return 3;
        if (month > 3)
            return 2;
        return 1;
    }
}
