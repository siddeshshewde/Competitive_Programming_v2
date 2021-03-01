/*
# Problem      : Captain Hammer
# Year         : 2013
# Round        : Practice
# Points       : 22pts
# Description  : https://codingcompetitions.withgoogle.com/kickstart/round/0000000000434944/0000000000434d9a


## Problem Statement
The Hamjet is a true marvel of aircraft engineering. It is a jet airplane with a single engine so powerful that it burns all of its fuel instantly during takeoff. The Hamjet doesn't have any wings because who needs them when the fuselage is made of a special Wonderflonium isotope that makes it impervious to harm.

Piloting the Hamjet is a not a job for your typical, meek-bodied superhero. That's why the Hamjet belongs to Captain Hammer, who is himself impervious to harm. The G-forces that the pilot endures when taking a trip in the Hamjet are legen-dary.

The Hamjet takes off at an angle of θ degrees up and a speed of V meters per second. V is a fixed value that is determined by the awesome power of the Hamjet engine and the capacity of its fuel tank. The destination is D meters away. Your job is to program the Hamjet's computer to calculate θ given V and D.

Fortunately, the Hamjet's Wondeflonium hull is impervious to air friction. Even more fortunately, the Hamjet doesn't fly too far or too high, so you can assume that the Earth is flat, and that the acceleration due to gravity is a constant 9.8 m/s2 down.

## Input
The first line of the input gives the number of test cases, T. T lines follow. Each line will contain two positive integers -- V and D.

## Output
For each test case, output one line containing "Case #x: θ", where x is the case number (starting from 1) and θ is in degrees up from the the horizontal. If there are several possible answers, output the smallest positive one.

An answer will be considered correct if it is within 10-6 of the exact answer, in absolute or relative error. See the FAQ for an explanation of what that means, and what formats of floating-point numbers we accept.


## Limits
Time limit: 60 seconds.
Memory limit: 1 GB.
1 ≤ T ≤ 4500;
1 ≤ V ≤ 300;
1 ≤ D ≤ 10000;
It is guaranteed that each test case will be solvable.


## Examples

Input
3
98 980
98 490
299 1234

Output
Case #1: 45.0000000
Case #2: 15.0000000
Case #3: 3.8870928
*/


//Solution

import java.util.Scanner;
import java.lang.Math;

public class Solution
{

    public static void main(String args[])
    {
        Scanner input = new Scanner( System.in);
        int t = input.nextInt();

        for(int i = 1 ; i <= t ; i++)
        {
            int v = input.nextInt();
            int d = input.nextInt();
            System.out.printf("Case #%d: %.7f\n", i , solve(v, d));
        }
    }

    public static double solve(int v, int d)
    {
        final double eps = 1e-6;
        double s = (9.8 * (double)(d) / (v * v));
        if (Math.abs(s - 1.0000000) < eps)
        {
            s = 1.0000000;
        }            

        if (Double.isNaN(Math.asin(s)))
            return (1.0000000 * 180 / (2 * Math.PI));
        return (Math.asin(s) * 180 / (2 * Math.PI));
    }
}