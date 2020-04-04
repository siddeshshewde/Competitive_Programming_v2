public class Diamond
{
	public static String print(int n)
	{
		int a=n;
		String ans = "";
		int space = n-1;
    		
		if (a%2==0 || a < 0)
		{
			return null;
		}
		for (int i = 1; i < a; i += 2)
		{
			for (int j = 0; j < a - 1 - i / 2; j++)
			{
				ans = ans + " ";
			}
			for (int j = 0; j < i; j++)
			{
				ans = ans + "*";
			}

			ans = ans + "\n";
		}
	
		for (int i = a; i > 0; i -= 2)
		{
			for (int j = 0; j < a -1 - i / 2; j++)
			{
				ans = ans + " ";
			}

			for (int j = 0; j < i; j++)
			{
				ans = ans + "*";
			}

			ans = ans + "\n";
		}
		return ans;
	}
}