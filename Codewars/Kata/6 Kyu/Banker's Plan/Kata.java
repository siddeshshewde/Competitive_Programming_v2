public class BankerPlan {
    
    public static boolean fortune(int f0, double p, int c0, int n, double i) {
        

        for (int j = 0 ; j < n ; j++)
        {
        	f0 = (int)(f0 + (double)((double)(p/100*f0) - c0));
        	c0 = (int)(c0 + (double)(c0*i/100));

        	if (f0 <= 0 && j < n-1)
        	{
        		return false;
        	}
        }

        return true;
    }
}