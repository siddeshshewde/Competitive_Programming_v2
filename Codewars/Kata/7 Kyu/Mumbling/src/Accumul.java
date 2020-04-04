public class Accumul
{    
    public static String accum(String s)
	{
    String a = s;
		String ans = "";
		int n = s.length();
		for (int i=0;i<n;i++)
		{
			char c = a.charAt(i);
			int k = 0;
			while (k<=i)
			{
				if (k==0)
				{
					ans = ans + Character.toUpperCase(c);
					k++;
					continue;
				}
				ans = ans + Character.toLowerCase(c);
				k++;
			}
			if (i<n-1)
				ans = ans + "-";
		}
		return ans;
    }
}