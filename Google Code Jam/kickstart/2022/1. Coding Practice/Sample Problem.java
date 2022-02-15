/*
# Problem      : Sample Problem
# Year         : 2022
# Round        : Practice Round
# Points       : 1pt
# Description  : https://codingcompetitions.withgoogle.com/kickstart/round/00000000008f4332/0000000000942404
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution
{
    BufferedReader br;
    StringTokenizer st;

    public static void main(String args[]) throws Exception
    {
        new Solution().start();
    }

    public void start() throws Exception
    {
        try
        {
            br = new BufferedReader(new InputStreamReader(System.in));
            solve();
        }
        catch (Throwable t)
        {
            t.printStackTrace();
        }
    }

    public void solve() throws Exception
    {
        read();
        int t = ni();
        
        for (int i = 1 ; i <= t ; i++)
        {
            read();
            int n = ni();
            int kids = ni();
            int candies = 0;
            read();

            for (int j = 0 ; j < n ; j++)
            {
                candies = candies + ni();
            }

            System.out.println(String.format("Case #%d: %d", i, candies%kids));
        }
    }

    void read() throws Exception
    {
        st = new StringTokenizer(br.readLine());
    }

    int ni()
    {
        return Integer.parseInt(st.nextToken());
    }

    String ns() throws Exception
    {
        String s = br.readLine();
        return s.length() == 0 ? br.readLine() : s;
    }
}
