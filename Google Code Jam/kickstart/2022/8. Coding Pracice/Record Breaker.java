/*
# Problem      : Record Breaker
# Year         : 2022
# Round        : Coding Practice
# Points       : 5pts, 7pts
# Description  : https://codingcompetitions.withgoogle.com/kickstart/round/00000000008f49d7/0000000000bcf2ed
*/

import java.io.InputStreamReader;
import java.io.BufferedReader;
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
        catch(Throwable t)
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
            int a [] = new int [n];
            read();

            for (int j = 0 ; j < n ; j++)
            {
                a[j] = ni();
            }
            
            int max = a[0];
            int breaking_days = 0;

            for (int j = 0 ; j < n ; j++)
            {
                if (j == 0 && a[j] > a[j+1])
                {
                    breaking_days++;
                    continue;
                }
                else if (j == n-1)
                {
                    if (a[j] > max)
                    {
                        breaking_days++;
                    }
                    continue;
                }
                else if (a[j] > max)
                {
                    max = a[j];
                    if (a[j] > a[j+1])
                    {
                        breaking_days++;
                    }
                    continue;
                }
            }

            System.out.println(String.format("Case #%d: %d", i, breaking_days));
        }

    }

    public void read() throws Exception
    {
        st = new StringTokenizer(br.readLine());
    }

    public int ni() throws Exception
    {
        return Integer.parseInt(st.nextToken());
    }

    public String ns() throws Exception
    {
        String s = br.readLine();
        return s.length() == 0 ? br.readLine() : s;
    }
}
