class Kata
{
	public static String getMiddle(String word)
	{
		String ans = "";
		if (word.length() < 2)
			return word;
		int n = word.length();
		if (n%2==0)
		{
			ans = ans + word.charAt(n/2-1);
			ans = ans + word.charAt(n/2);
			return ans;
		}
		ans = ans +  word.charAt(n/2);
		return ans;
	}
}