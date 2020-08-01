/*
Problem      : Watermelon
Round        : 4A
Link         : https://codeforces.com/problemset/problem/4/A
Difficulty   : 1300
Category     : brute force, math
Time Limit   : 1s
Memory Limit : 64mb
Language     : Java
Time Taken   : 342ms
Memory       : 22800kb
*/


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Problem4A
{

	BufferedReader reader;
	PrintWriter writer;
    StringTokenizer tok;


	public static void main (String args[])
	{
		Problem4A t = new Problem4A();
		t.run();
	}

	public void run()
	{
		try
		{
			reader = new BufferedReader(new InputStreamReader(System.in));
			writer = new PrintWriter(System.out);
			tok = null;

			solve();

			reader.close();
            writer.close();
		}
		catch(Throwable t)
		{
			t.printStackTrace();
			System.exit(1);
		}
	} 

	public void solve() throws IOException
	{
		int weight  = readInt();

		if (weight > 2 && weight % 2 == 0)
			writer.print("YES");
		else
			writer.print("NO");
	}





	public int readInt() throws IOException {
		return Integer.parseInt(readString());
	}

	public long readLong() throws IOException {
		return Long.parseLong(readString());
	}

	public double readDouble() throws IOException {
		return Double.parseDouble(readString());
	}

	public String readString() throws IOException {
		while (tok == null || !tok.hasMoreTokens()) {
			tok = new StringTokenizer(reader.readLine());
		}
		return tok.nextToken();
	}


}
