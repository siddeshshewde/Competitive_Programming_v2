class Persist 
{
	public static int persistence(long n) 
	{
		int count = 0;

		if (n < 10)
			return count;

		while (n > 9)
		{
			long product = 1;
			while (n != 0)
			{
				product = product * (n % 10);
				n = n / 10;
			}
      count++;
			n = product;
		}

		return count;
	}
}