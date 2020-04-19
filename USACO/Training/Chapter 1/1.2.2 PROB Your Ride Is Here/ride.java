/*
Title:
	Your Ride Is Here

Link:
	https://train.usaco.org/usacoprob2?a=Di95zySl5wx&S=ride

*/



/*
ID   : siddesh3
LANG : JAVA
TASK : ride
PROG : ride
*/

import java.util.*;
import java.io.*;

public class ride 
{
	public static void main (String [] args) throws IOException
	{
		BufferedReader in = new BufferedReader(new FileReader("ride.in"));

		PrintWriter out = new PrintWriter(new FileWriter("ride.out"));

		//StringTokenizer st = new StringTokenizer(in.readLine());		

		long startTime = System.currentTimeMillis();

		if (getValue(in.readLine())%47 == getValue(in.readLine())%47)
			out.println("GO");
		else
			out.println("STAY");
		out.close();

		long endTime = System.currentTimeMillis();

		System.out.println(String.format("Runtime for program ride: %d ms", endTime - startTime));

	}

	public static int getValue(String a)
	{
		int a1 = 1;
		for (int i = 0 ; i < a.length() ; i++)
		{
			a1 = a1 * (a.charAt(i) - 'A' + 1);
		}
		return a1;
	}
}