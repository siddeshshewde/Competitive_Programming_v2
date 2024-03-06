/*
# Problem      : Cheeseburger Corollary 1
# Year         : 2023
# Round        : Practice Round
# Points       : 8pts
# Problem      : A1
# Description  : https://www.facebook.com/codingcompetitions/hacker-cup/2023/practice-round/problems/A1
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

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
            int s = ni();
            int d = ni();
            int k = ni();
            String solution = s*2+d*2 >= k+1 && s+d*2 >= k ? "YES" : "NO";

            write.println("Case #" + i + ": " + solution);
        }
        read.close();
        write.close();
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