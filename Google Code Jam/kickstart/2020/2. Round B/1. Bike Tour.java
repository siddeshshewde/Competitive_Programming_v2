import java.util.Scanner;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;


public class Solution 
{
    Scanner read;

    public static void main (String args[])
    {
        Solution a = new Solution();
        a.start();
    }

    public void start()
    {
        try 
        {
            read = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
            solve();
        } 
        catch (Throwable t) 
        {
            t.printStackTrace();
        }
    }

    public void solve()
    {
        int t = read.nextInt();

        for (int i = 1 ; i <= t ; i++)
        {
            int n = read.nextInt();
            int [] height = new int [n];

            for (int j = 0 ; j < n ; j++)
            {
                height[j] = read.nextInt();
            }

            int peaks = 0;
            for (int j = 0 ; j < n-2 ; j++)
            {
                if (height[j] < height[j+1] && height[j+1] > height[j+2])
                {
                    peaks++;
                }
            }

            System.out.println(String.format("Case #%d: %d", i, peaks));
        }
    }
}