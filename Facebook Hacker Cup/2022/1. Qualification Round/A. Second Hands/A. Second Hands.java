/*
# Problem      : Second Hands
# Year         : 2022
# Round        : Qualification Round
# Points       : 9pts
# Problem      : A
# Description  : https://www.facebook.com/codingcompetitions/hacker-cup/2022/qualification-round/problems/A
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.lang.Exception;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.HashMap;

public class Solution
{
    BufferedReader read;
    StringTokenizer st;
    PrintWriter write;
    public static void main(String args[]) throws Exception
    {
        new Solution().start();
    }

    public void start() throws Exception
    {
        try
        {
            read = new BufferedReader(new FileReader("input.txt"));
            write = new PrintWriter("output.txt");
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
            int a [] = new int [n];
            read();

            for (int j = 0 ; j < n ; j++)
            {
                a[j] = ni();
            }
            
            if (k*2 < n || CountMax(a) > 2)
            {
                write.println("Case #" + i + ": " + "NO");
            }
            else
            {
                write.println("Case #" + i + ": " + "YES");
            }
        }

        read.close();
        write.close();
    }

    public int CountMax(int [] a)
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        int max = 0;
        for (int i = 0 ; i < a.length ; i++)
        {
            if (map.containsKey(a[i]))
            {
                map.put(a[i], map.get(a[i]) + 1);
            }
            else
            {
                map.put(a[i], 1);
            }
            if (map.get(a[i]) > max)
            {
                max = map.get(a[i]);
            }
        }
        return max;
    }

    public void read() throws Exception
    {
        st  = new StringTokenizer(read.readLine());
    }

    public int ni() throws Exception
    {
        return Integer.parseInt(st.nextToken());
    }

    public String ns() throws Exception
    {
        String s = read.readLine();
        return s.length() == 0 ? read.readLine(): s;
    }
}