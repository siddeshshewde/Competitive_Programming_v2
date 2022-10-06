/*
# Problem      : Palindromic Factors
# Year         : 2022
# Round        : B
# Points       : 6pts, 9pts
# Description  : https://codingcompetitions.withgoogle.com/kickstart/round/00000000008caa74/0000000000acee89
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
            int n = ni();
            System.out.println(String.format("Case #%d: %d", i, check_factors(n)));
        }
    }

    public int check_factors(int number) throws Exception
    {
        int count = 0;
        for (int i = 1; i <= number; ++i) 
        {

            if (number % i == 0) {
                if (check_palindrome(i))
                {
                    count++;
                }
            }
        }
        return count;
    }

    public boolean check_palindrome(int num) throws Exception
    {
        int originalNum = num;
        int reversedNum = 0;
        while (num != 0) 
        {
            int remainder = num % 10;
            reversedNum = reversedNum * 10 + remainder;
            num /= 10;
        }
          
        if (originalNum == reversedNum) 
        {
            return true;
        }
        else 
        {
            return false;
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