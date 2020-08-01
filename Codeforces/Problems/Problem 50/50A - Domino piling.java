/*
Problem      : Domino piling
Round        : 50A
Link         : https://codeforces.com/problemset/problem/50/A
Difficulty   : 1000
Category     : greedy, math
Time Limit   : 2s
Memory Limit : 256mb
Language     : Java
Time Taken   : 342ms
Memory       : 23200kb
*/



import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Problem50A
{

	BufferedReader reader;
	PrintWriter writer;
    StringTokenizer tok;


	public static void main (String args[])
	{
		Problem50A t = new Problem50A();
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
		int row  = readInt();
		int column  = readInt();
        writer.print(maxDominoes(row, column));
	}

	public static int maxDominoes(int row, int column)
	{
		return (row * column / 2);
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
