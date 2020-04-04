public class Solution
{
	public int solution(int number)
	{
		int ans = 0;
		int n = number;
		for (int i=1;i<number;i++)
		{
			if (i%3==0 || i%5==0)
				ans += i;
		}
		return ans;
    }
}