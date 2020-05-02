/*

Problem      : Theatre Square
Round        : 1A
Link         : https://codeforces.com/problemset/problem/1/A
Difficulty   : 1300
Category     : math

Time Limit   : 1s
Memory Limit : 256mb
Language     : Java

Time Taken   : 171ms
Memory       : 0kb
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Problem1A
{

	BufferedReader reader;
	PrintWriter writer;
    StringTokenizer tok;


	public static void main (String args[])
	{
		Problem1A t = new Problem1A();
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
		long length  = readInt();
		long breadth = readInt();
		long side    = readInt();

		long countLength  = length/side;
		long countBreadth = breadth/side;

		if(length%side != 0)
			countLength++;
		
		if(breadth%side != 0)
			countBreadth++;

		writer.println(countLength*countBreadth);
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

