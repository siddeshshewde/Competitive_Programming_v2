/*
# Problem      : Studious Student
# Year         : 2011
# Round        : Qualification Round
# Problem      : C
# Points       : 100pts
# Description  : https://www.facebook.com/codingcompetitions/hacker-cup/2011/qualification-round/problems/C
# Time         : 
# Space        : 

## Problem Statement
You've been given a list of words to study and memorize. Being a diligent student of language and the arts, 
you've decided to not study them at all and instead make up pointless games based on them. One game you've 
come up with is to see how you can concatenate the words to generate the lexicographically lowest possible 
string.

## Input
As input for playing this game you will receive a text file containing an integer N, 
the number of word sets you need to play your game against. This will be followed by N word sets, 
each starting with an integer M, the number of words in the set, followed by M words. 
All tokens in the input will be separated by some whitespace and, aside from N and M, 
will consist entirely of lowercase letters.

## Output
Your submission should contain the lexicographically shortest strings for each corresponding word set, 
one per line and in order.

## Constraints
1 ≤ N ≤ 100
1 ≤ M ≤ 9
1 ≤ all word lengths ≤ 10

## Example

Input
5
6 facebook hacker cup for studious students
5 k duz q rc lvraw
5 mybea zdr yubx xe dyroiy
5 jibw ji jp bw jibw
5 uiuy hopji li j dcyi

Output
Case #1: cupfacebookforhackerstudentsstudious
Case #2: duzklvrawqrc
Case #3: dyroiymybeaxeyubxzdr
Case #4: bwjibwjibwjijp
Case #5: dcyihopjijliuiuy

*/


*/

package studious_student;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author siddesh.sh
 */
public class Studious_student 
{
    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws IOException, FileNotFoundException
    {
        //BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
        PrintWriter writer = new PrintWriter(new FileWriter("output.txt"));
        Scanner reader = new Scanner(new File("input.txt")); 
        int numTests = reader.nextInt();
        
        for (int i = 1 ; i <= numTests ; i++)
        {
            int numWords = reader.nextInt();
            List<String> words = new ArrayList<>();
            
            for (int j = 0 ; j < numWords ; j++)
            {
                words.add(reader.next());
            }
            
            Collections.sort(words);
            
            writer.print("Case #" + i + ": ");
            
            for (String word : words)
            {
                writer.print(word);
            }
            writer.println();
        }
        writer.close();
    }   
}
