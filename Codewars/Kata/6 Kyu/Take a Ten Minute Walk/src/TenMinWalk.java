public class TenMinWalk
{
	public static boolean isValid(char[] walk)
	{
		int x = 0, y = 0;
    if(walk.length > 10)
        return false;
    if (walk.length <10)
        return false;
		for (int i=0;i<10;i++)
		{
			if (walk[i]=='n')
				x = x + 1;
			if (walk[i]=='s')
				x = x - 1;
			if (walk[i]=='e')
				y = y + 1;
			if (walk[i]=='w')
				y = y - 1;
		}
		if(x==0 && y==0)
			return true;
		else
			return false;
	}
}