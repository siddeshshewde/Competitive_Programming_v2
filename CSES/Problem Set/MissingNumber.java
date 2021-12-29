/*
Title        : Missing Number
Problem      : https://cses.fi/problemset/task/1083
Category     : Introductory Problems
Time limit   : 1.00 s 
Memory limit : 512 MB
*/

import java.util.*;
import java.io.*;

public class MissingNumber
{
    PrintWriter out;
    StringTokenizer st;
    BufferedReader br;
    final int imax = Integer.MAX_VALUE, imin = Integer.MIN_VALUE;
    final int mod = 1000000007;

    void solve() throws Exception {
        read();
        int n = ni();
        
        read();
        int a[] = new int[n+1];

        for (int i = 1 ; i < n ; i++)
        {
            a[new Integer(ni())] = 1;
        }
        
        for (int i = 1 ; i <= n ; i++)
        {
            if (a[i] == 0)
            {
                out.print(i);
                break;
            }
        }
    }

    public static void main(String[] args) throws Exception {
        new MissingNumber().run();
    }

    void run() throws Exception {
        out = new PrintWriter(System.out);
        br = new BufferedReader(new InputStreamReader(System.in));

        solve();
        out.flush();
    }

    void read() throws Exception {
        st = new StringTokenizer(br.readLine());
    }

    int ni() {
        return Integer.parseInt(st.nextToken());
    }

    long nl() {
        return Long.parseLong(st.nextToken());
    }

    double nd() {
        return Double.parseDouble(st.nextToken());
    }

    String ns() throws Exception {
        String s = br.readLine();
        return s.length() == 0 ? br.readLine() : s;
    }

    void print(int[] arr) {
        for (int i : arr)
            out.print(i + " ");
        out.println();
    }

    void print(long[] arr) {
        for (long i : arr)
            out.print(i + " ");
        out.println();
    }

    void print(int[][] arr) {
        for (int[] i : arr) {
            for (int j : i)
                out.print(j + " ");
            out.println();
        }
    }

    void print(long[][] arr) {
        for (long[] i : arr) {
            for (long j : i)
                out.print(j + " ");
            out.println();
        }
    }
}
