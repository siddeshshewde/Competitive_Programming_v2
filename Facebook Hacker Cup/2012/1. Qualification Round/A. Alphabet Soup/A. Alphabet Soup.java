/*
# Problem      : Alphabet Soup
# Year         : 2012
# Round        : Qualification Round
# Problem      : A
# Points       : 100pts
# Description  : https://www.facebook.com/codingcompetitions/hacker-cup/2012/qualification-round/problems/A
# Time	       : 
# Space	       : 

## Problem Statement
Alfredo Spaghetti really likes soup, especially when it contains alphabet pasta. Every day he constructs a sentence from letters, 
places the letters into a bowl of broth and enjoys delicious alphabet soup.

Today, after constructing the sentence, Alfredo remembered that the Facebook Hacker Cup starts today! Thus, he decided to construct 
the phrase "HACKERCUP". As he already added the letters to the broth, he is stuck with the letters he originally selected. 
Help Alfredo determine how many times he can place the word "HACKERCUP" side-by-side using the letters in his soup.

## Input
The first line of the input file contains a single integer T: the number of test cases. T lines follow, each representing a single 
test case with a sequence of upper-case letters and spaces: the original sentence Alfredo constructed.

## Output
Output T lines, one for each test case. For each case, output "Case #t: n", where t is the test case number (starting from 1) and n 
is the number of times the word "HACKERCUP" can be placed side-by-side using the letters from the sentence.

## Constraints
1 < T ≤ 20
Sentences contain only the upper-case letters A-Z and the space character
Each sentence contains at least one letter, and contains at most 1,000 characters, including spaces

## Example
Input
5
WELCOME TO FACEBOOK HACKERCUP
CUP WITH LABEL HACKERCUP BELONGS TO HACKER
QUICK CUTE BROWN FOX JUMPS OVER THE LAZY DOG
MOVE FAST BE BOLD
HACK THE HACKERCUP

Output
Case #1: 1
Case #2: 2
Case #3: 1
Case #4: 0
Case #5: 1
*/

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;

public class alphabet_soup
{
    public static void main (String args []) 
    {
        alphabet_soup a = new alphabet_soup();
        a.start();
    }

    public void start()
    {
        try
        {
            BufferedReader read = new BufferedReader(new FileReader("input.txt"));
            PrintWriter write = new PrintWriter("output.txt");

            int t = Integer.parseInt(read.readLine());

            for (int i = 1 ; i <= t ; i++)
            {
                String line = read.readLine();
                char [] characters = line.toCharArray();
                int [] characterCount = {0,0,0,0,0,0,0,0};

                for (int j = 0 ; j < characters.length ; j++)
                {

                    switch(characters[j])
                    {
                        case 'H' : 
                            characterCount[0]++;
                            break;

                        case 'A' : 
                            characterCount[1]++;
                            break;

                        case 'C' : 
                            characterCount[2]++;
                            break;

                        case 'K' : 
                            characterCount[3]++;
                            break;

                        case 'E' : 
                            characterCount[4]++;
                            break;

                        case 'R' : 
                            characterCount[5]++;
                            break;

                        case 'U' : 
                            characterCount[6]++;
                            break;

                        case 'P' : 
                            characterCount[7]++;
                            break;

                        default:
                    }
                }

                characterCount[2] = characterCount[2] / 2;

                int minimum = characterCount[0];
                
                for (int j = 1 ; j < characterCount.length ; j++)
                {
                    if (characterCount[j] < minimum)
                    {
                        minimum = characterCount[j];
                    }
                }

                write.println("Case #" + i + ": " + minimum);
            }

            read.close();
            write.close();
    
        }
        catch (Throwable t) 
        {
            t.printStackTrace();
        }
   }
}