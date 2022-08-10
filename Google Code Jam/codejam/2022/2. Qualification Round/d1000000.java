/*
# Problem      : d1000000
# Year         : 2022
# Round        : Qualification Round
# Points       : 9pth, 11pts
# Description  : https://codingcompetitions.withgoogle.com/codejam/round/0000000000876ff1/0000000000a46471
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

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
            int n = ni();
            ArrayList<Integer> dice = new ArrayList<>();
            read();

            for (int j = 0 ; j < n ; j++)
            {
                int num = ni();
                dice.add(num);
            }

            Collections.sort(dice);
            
            int max = 1;

            for (int j = 0 ; j < n ; j++)
            {
                if (dice.get(j) >= max)
                {
                    max++;
                }
            }

            System.out.println(String.format("Case #%d: %d", i, max-1));
              
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