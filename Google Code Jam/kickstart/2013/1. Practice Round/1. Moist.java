/*
# Problem      : Moist
# Year         : 2013
# Round        : Practice
# Points       : 4pts, 6pts
# Description  : https://codingcompetitions.withgoogle.com/kickstart/round/0000000000434944/0000000000434c05


## Problem Statement
Moist has a hobby -- collecting figure skating trading cards. His card collection has been growing, and it is now too large to keep in one disorganized pile. Moist needs to sort the cards in alphabetical order, so that he can find the cards that he wants on short notice whenever it is necessary.

The problem is -- Moist can't actually pick up the cards because they keep sliding out his hands, and the sweat causes permanent damage. Some of the cards are rather expensive, mind you. To facilitate the sorting, Moist has convinced Dr. Horrible to build him a sorting robot. However, in his rather horrible style, Dr. Horrible has decided to make the sorting robot charge Moist a fee of $1 whenever it has to move a trading card during the sorting process.

Moist has figured out that the robot's sorting mechanism is very primitive. It scans the deck of cards from top to bottom. Whenever it finds a card that is lexicographically smaller than the previous card, it moves that card to its correct place in the stack above. This operation costs $1, and the robot resumes scanning down towards the bottom of the deck, moving cards one by one until the entire deck is sorted in lexicographical order from top to bottom.

As wet luck would have it, Moist is almost broke, but keeping his trading cards in order is the only remaining joy in his miserable life. He needs to know how much it would cost him to use the robot to sort his deck of cards.


## Input
The first line of the input gives the number of test cases, T. T test cases follow. Each one starts with a line containing a single integer, N. The next N lines each contain the name of a figure skater, in order from the top of the deck to the bottom.

## Output
For each test case, output one line containing "Case #x: y", where x is the case number (starting from 1) and y is the number of dollars it would cost Moist to use the robot to sort his deck of trading cards.

## Limits
Time limit: 60 seconds per test set.
Memory limit: 1 GB.
1 ≤ T ≤ 100.
Each name will consist of only letters and the space character.
Each name will contain at most 100 characters.
No name with start or end with a space.
No name will appear more than once in the same test case.
Lexicographically, the space character comes first, then come the upper case letters, then the lower case letters.

##Test set 1
1 ≤ N ≤ 10.

##Test set 2
1 ≤ N ≤ 100.

## Examples

Input
2
2
Oksana Baiul
Michelle Kwan
3
Elvis Stojko
Evgeni Plushenko
Kristi Yamaguchi

Output
Case #1: 1
Case #2: 0

*/


//Solution


import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Solution
{

    Scanner read;

    public static void main (String args [])
    {
        Solution a = new Solution();
        a.start();
    }

    public void start ()
    {
        try 
        {
            read = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
            solve();
        }
        catch(Throwable t)
        {
            t.printStackTrace();
        }
    }

    public void solve()
    {
        int t = read.nextInt();

        for (int i = 1 ; i <= t ; i++)
        {
            int n = read.nextInt();
            String a [] = new String[n+1];
            int cost = 0;
            read.nextLine();

            for (int j = 0 ; j < n ; j++)
            {
                a[j] = read.nextLine();
            }

            for (int j = 0 ; j < n-1 ; j++)
            {
                if (a[j].compareTo(a[j+1]) > 0)
                {
                    cost += 1;
                    String temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }

            System.out.printf("Case #%d: %d\n", i, cost);

        }
    }
}