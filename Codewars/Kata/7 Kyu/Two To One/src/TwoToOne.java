public class TwoToOne
{
    public static String longest (String s1, String s2)
	{
		String s = s1 + s2;
		return s.chars().distinct().sorted().collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();
	}
}