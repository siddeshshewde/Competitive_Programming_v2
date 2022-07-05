/*
# Problem      : Punched Cards
# Year         : 2022
# Round        : Qualification Round
# Points       : 11pts
# Description  : https://codingcompetitions.withgoogle.com/codejam/round/0000000000876ff1/0000000000a4621b
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    BufferedReader br;
    StringTokenizer st;
    public static void main (String args[]) throws Exception
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
            int r = ni();
            int c = ni();

            System.out.println(String.format("Case #%d: ", i));

            for (int j = 0 ; j <= r ; j++)
            {
                for (int k = 0 ; k < c ; k++)
                {
                    if ( j == 0 && k == 0)
                    {
                        System.out.print("..");
                    }
                    else
                    {
                        System.out.print("+-");
                    }
                }
                
                if (i == t)
                {
                    System.out.print("+");
                }
                else
                {
                    System.out.print("+\n");
                }
                
                if (j < r)
                {
                    for (int k = 0 ; k < c ; k++)
                    {
                        if ( j == 0 && k == 0)
                        {
                            System.out.print("..");
                        }
                        else
                        {
                            System.out.print("|.");
                        }
                    }
                    System.out.print("|\n");
                }
            }
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
