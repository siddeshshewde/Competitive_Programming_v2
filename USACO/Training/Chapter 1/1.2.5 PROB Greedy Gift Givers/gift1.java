/*
Title:
	Greedy Gift Givers

Link:
	https://train.usaco.org/usacoprob2?a=sR33WcbUPbP&S=gift1	
*/



/*
ID   : siddesh3
LANG : JAVA
TASK : gift1
PROG : gift1
*/

import java.util.*;
import java.io.*;

public class gift1
{
	public static void main(String args []) throws IOException
	{
		BufferedReader br = new BufferedReader(new FileReader("gift1.in"));
		PrintWriter out  = new PrintWriter(new FileWriter("gift1.out"));

		int friends = Integer.parseInt(br.readLine());
		LinkedHashMap <String, Integer> friendNames = new LinkedHashMap<String, Integer>();

		for (int i = 0 ; i < friends ; i++)
		{
			friendNames.put(br.readLine(), 0);
		}

		for (int i = 0 ; i < friends ; i++)
		{
			String giver = br.readLine();
			String a [] = br.readLine().split(" ");
			int amount = Integer.parseInt(a[0]);
			int takers = Integer.parseInt(a[1]);
			int split = 0;

			if (takers != 0)
				split = amount/takers;

			friendNames.put(giver, friendNames.get(giver) - split * takers);

			for (int j = 0 ; j < takers ; j++)
			{
				String taker = br.readLine();
				friendNames.put(taker, friendNames.get(taker) + split);
			}

		}

		for (String key : friendNames.keySet())
		{
			String r = key + " " + friendNames.get(key);
			out.println(r);
		}

		out.close();     //close the output file
		System.exit(0);  //don't omit this

	}

}