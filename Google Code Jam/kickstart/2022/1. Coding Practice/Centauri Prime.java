/*
# Problem      : Centauri Prime
# Year         : 2022
# Round        : Practice Round
# Points       : 5pts, 7pts
# Description  : https://codingcompetitions.withgoogle.com/kickstart/round/00000000008f4332/0000000000941ec5
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
            String ruler = "";
            String kingdom = ns();

            if (kingdom.charAt(kingdom.length()-1) == 'y' || kingdom.charAt(kingdom.length()-1) == 'Y')
            {
                ruler = "nobody";
            }

            else if (isVowel(kingdom.charAt(kingdom.length()-1)))
            {
                ruler = "Alice";
            }

            else
            {
                ruler = "Bob";
            }

            System.out.println(String.format("Case #%d: %s is ruled by %s.", i, kingdom, ruler));
        }
    }

    public boolean isVowel(char c) {
        return "AEIOUaeiou".indexOf(c) != -1;
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