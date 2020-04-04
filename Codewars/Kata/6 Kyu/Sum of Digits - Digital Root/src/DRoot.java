public class DRoot
{
	public static int digital_root(int n)
	{
		int flag = 1;
		int sum = 0;
		while (flag == 1)
		{
			sum = 0;
			while (n != 0)
			{
				sum = sum + (n % 10);
				n = n / 10;
			}
			if (sum < 10)
				flag = 0;
			if (sum > 10)
				n = sum;
		}
		return sum;
	}
}