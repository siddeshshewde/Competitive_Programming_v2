public class BouncingBall
{
	public static int bouncingBall(double h, double bounce, double window)
	{
		if (bounce <= 0 || bounce >= 1 || h <= window || h == 0 || h < 0)
		{
			return -1;
		}
		int count = 0;
		while (h > window)
		{
			count = count + 1;
			h = h * bounce;
			if (h > window)
				count = count + 1;
		}
		return count;
	}
}
