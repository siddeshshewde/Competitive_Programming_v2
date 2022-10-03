/*
# Problem      : Infinity Area
# Year         : 2022
# Round        : B
# Points       : 8pts
# Description  : https://codingcompetitions.withgoogle.com/kickstart/round/00000000008caa74/0000000000acf079
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.lang.Math.*;

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
            int R = ni();
            int A = ni();
            int B = ni();
            int radius = R;
            double area = Math.PI * radius * radius;
            double total_area = area;



            while (radius != 0)
            {
                radius = radius * A;
                area = Math.PI * radius * radius;
                total_area += area;

                radius = radius / B;
                area = Math.PI * radius * radius;
                total_area += area;
            }

            System.out.println(String.format("Case #%d: %f", i, total_area));
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