public class Kata
{
    public static int[] countPositivesSumNegatives(int[] input)
    {
        if (input == null || input.length == 0)
            return new int[] {};
        int n = 0, result = 0;
        for (int i : input)
        {
            if (i > 0)
                n++;
            if (i < 0)
                result += i;
        }
        return new int[] {n, result};
    }
}