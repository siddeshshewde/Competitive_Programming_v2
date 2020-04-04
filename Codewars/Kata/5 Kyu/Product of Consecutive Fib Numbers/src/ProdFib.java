public class ProdFib
{	
	  public static long[] productFib(long prod)
    {
        long a = 1;
        long b = 1;
        while (a * b < prod)
        {
            b = a + b;
            a = b - a;
        }
        long f = 0;
        if (prod == a * b)
            f = 1;
        long ans [] = {a, b, f};
        return ans;
    }
}