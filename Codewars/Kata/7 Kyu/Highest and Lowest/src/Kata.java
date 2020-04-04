public class Kata
{
	public static String HighAndLow(String numbers)
	{
		String [] str = numbers.split(" ");
		Integer []ints = new Integer[str.length];
		
		for (int i=0;i<str.length;i++)
		{
			ints[i] = Integer.parseInt(str[i]);
		}
		Integer max = ints[0];
		Integer min = ints[0];
		
		for (int i=0;i<ints.length;i++)
		{
			if(max<ints[i])
				max = ints[i];
			if(min>ints[i])
				min = ints[i];
		}
		return max.toString() + " " + min.toString();
	}
}