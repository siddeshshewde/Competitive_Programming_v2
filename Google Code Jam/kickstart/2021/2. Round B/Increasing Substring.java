/*
# Problem      : Increasing Substring
# Year         : 2021
# Round        : B
# Points       : 5pts. 7pts
# Description  : https://codingcompetitions.withgoogle.com/kickstart/round/0000000000435a5b/000000000077a882
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
        try {
            {
                br = new BufferedReader(new InputStreamReader(System.in));
                solve();
            }
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
            String a = ns();
            int counter = 0;
            System.out.print(String.format("Case #%d: ",i));

            for (int j = 0 ; j < n ; j++)
            {
                if (j == 0 || a.charAt(j) > a.charAt(j-1))
                {
                    counter++;
                    System.out.print(counter);
                }
                else
                {
                    counter = 1;
                    System.out.print(counter);
                }
                if (j < n-1)
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
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