/*
# Problem      : K-Goodness String
# Year         : 2021
# Round        : A
# Points       : 12pts
# Description  : https://codingcompetitions.withgoogle.com/kickstart/round/0000000000436140/000000000068cca3
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
            int k = ni();
            String s = ns();
            int z = s.length()/2;           
            int changes = 0;

            for (int j = 0 ; j < z ; j++)
            {
                if (s.charAt(j) != s.charAt(s.length()-j-1))
                {
                    changes++;
                }
            }
            System.out.println(String.format("Case #%d: %d", i, Math.abs(changes-k)));
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