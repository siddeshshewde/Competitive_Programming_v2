/*
# Problem      : Square Counting
# Year         : 2017
# Round        : A
# Points       : 8pts, 17pts
# Description  : https://codingcompetitions.withgoogle.com/kickstart/round/0000000000201c97/0000000000201d25

## Problem Statement
Mr. Panda has recently fallen in love with a new game called Square Off, in which players compete to find as many different squares as possible on an evenly 
spaced rectangular grid of dots. To find a square, a player must identify four dots that form the vertices of a square. Each side of the square must have the same length, 
of course, but it does not matter what that length is, and the square does not necessarily need to be aligned with the axes of the grid. The player earns one point for 
every different square found in this way. Two squares are different if and only if their sets of four dots are different.

Mr. Panda has just been given a grid with R rows and C columns of dots. How many different squares can he find in this grid? Since the number might be very large, 
please output the answer modulo 109 + 7 (1000000007).

## Input
The first line of the input gives the number of test cases, T. T lines follow. 
Each line has two integers R and C: the number of dots in each row and column of the grid, respectively.

## Output
For each test case, output one line containing Case #x: y, where x is the test case number (starting from 1) and y is the number of different 
squares can be found in the grid.

## Limits
1 ≤ T ≤ 100.
Time limit: 20 seconds per test set.
Memory limit: 1GB.

Small dataset (Test set 1 - Visible)
2 ≤ R ≤ 1000.
2 ≤ C ≤ 1000.

Large dataset (Test set 2 - Hidden)
2 ≤ R ≤ 109.
2 ≤ C ≤ 109.

## Examples
Input
4
2 4
3 4
4 4
1000 500

Output
Case #1: 3
Case #2: 10
Case #3: 20
Case #4: 624937395
 
In Sample Case #1, you have a budget of 100 dollars. You can buy the 1st and 3rd houses for 20 + 40 = 60 dollars.
In Sample Case #2, you have a budget of 50 dollars. You can buy the 1st, 3rd and 4th houses for 30 + 10 + 10 = 50 dollars.
In Sample Case #3, you have a budget of 300 dollars. You cannot buy any houses (so the answer is 0).
Note: Unlike previous editions, in Kick Start 2020, all test sets are visible verdict test sets, meaning you receive instant feedback upon submission.
*/


//Solution


import java.util.Scanner;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.lang.Math;
import java.util.Arrays; 

public class Solution 
{
    Scanner read;

    public static void main(String args[])
    {
        Solution a = new Solution();
        a.start();
    }

    public void start()
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
            int N    = read.nextInt();
            int B    = read.nextInt();
            int A [] = new int [N];
            int solution = 0;

            for (int j = 1 ; j <= N ; j++)
            {
                A[j] = read.nextInt();
            }

            Arrays.sort(A);

            for (int j = 1 ; j <= N ; j++)
            {
                if (B < A[j])
                    break;
                solution += 1;
                B -= A[j];
            }

            System.out.println(String.format("Case #%d: %d", i, solution));
        }
    }
}
