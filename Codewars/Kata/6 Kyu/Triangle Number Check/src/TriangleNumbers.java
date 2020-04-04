public class TriangleNumbers
{
	public static Boolean isTriangleNumber(long number)
	{
		long sum = 0,i=0;
		while (true)
		{
			sum = sum + i;
			if (sum == number)
				return true;
			if (sum > number)
				return false;
			i++;
		}
    }
}
