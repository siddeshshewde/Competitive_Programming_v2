public class Solution
{
    public static String repeatStr(final int repeat, final String string)
	{
		String ans = "";
		for (int i=0;i<repeat;i++)
			ans = ans + string;
		return ans;
    }
}
