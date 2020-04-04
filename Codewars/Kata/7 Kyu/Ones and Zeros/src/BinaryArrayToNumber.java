import java.util.List;


public class BinaryArrayToNumber
{
    public static int ConvertBinaryArrayToInt(List<Integer> binary)
	{
		int ans = 0;
		for (int i=0;i<4;i++)
		{
			int a = binary.get(i);
			switch (i)
			{
				case 0 : ans = ans + a*8; break;
				case 1 : ans = ans + a*4; break;
				case 2 : ans = ans + a*2; break;
				case 3 : ans = ans + a*1; break;
			}
		}
		return ans;
    }
}