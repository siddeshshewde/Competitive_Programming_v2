/*
# Problem      : Double or One Thing
# Year         : 2022
# Round        : Round 1A
# Points       : 10pts, 15pts
# Description  : https://codingcompetitions.withgoogle.com/codejam/round/0000000000877ba5/0000000000aa8e9c
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
        for (int k = 1 ; k <= t ; k++)
        {
            String word = ns();
            String result = "";

            for (int i = 0 ; i < word.length() ; i++)
            {
                result += word.charAt(i);
                for (int j = i+1 ; j < word.length() ; j++)
                {
                    if(word.charAt(j) > word.charAt(i) && i != word.length()-1)
                    {
                        result = "" + result + (char)word.charAt(i);
                        break;
                    }
                    else if (word.charAt(j) < word.charAt(i))
                    {
                        break;
                    }
                }
            }

            System.out.println(String.format("Case #%d: %s", k, result));
              
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