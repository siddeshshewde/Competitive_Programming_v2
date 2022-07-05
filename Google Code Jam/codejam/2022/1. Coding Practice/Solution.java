/*
# Problem      : H-index
# Year         : 2022
# Round        : Practice Round
# Points       : 6pts, 8pts
# Description  : https://codingcompetitions.withgoogle.com/kickstart/round/00000000008f4332/0000000000941e56
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
            read();
            int t = ni();

            for (int i = 1 ; i <= t ; i++)
            {
                read();
                int n = ni();
                read();
                int [] a = new int [n];

                for (int j = 0 ; j < n ; j++)
                {
                    a[j] = ni();
                }

                System.out.print(String.format("Case #%d:", i));
                int citations = 0;
                
                for (int j = 1 ; j <= n ; j++)
                {
                    for (int k = 0 ; k < j ; k++)
                    {
                        if (a[k] >= n)
                        {
                            citations += 1;
                        }
                    }
                    if ()
                    System.out.print(" " + citations);
                }
                System.out.println();
            }
        }
        catch (Throwable t)
        {
            t.printStackTrace();
        }
    }

    public void solve() throws Exception
    {

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