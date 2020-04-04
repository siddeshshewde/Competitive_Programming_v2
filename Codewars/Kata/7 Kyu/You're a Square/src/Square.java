public class Square
{    
    public static boolean isSquare(int n)
	{        
		int i = 2;
		if (n < 0)
		{
			return false;
		}
		if (n == 0 || n == 1)
		{
			return true;
		}
		while (i<n)
		{
			if(i*i==n)
			{
				return true;
			}
			i++;      
		}
		return false;
	}
}