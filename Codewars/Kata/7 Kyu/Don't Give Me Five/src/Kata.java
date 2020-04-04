public class Kata
{
  public static int dontGiveMeFive(int start, int end)
  {
    int count = 0;
	for (int i=start;i<=end;i++)
	{
		int n = i;
		while (n != 0)
		{
			if (n%5==0 && n%10!=0)
				break;
			n = n / 10;
		}
		if (n == 0)
			count++;
	}
	return count;
  }
}