/*
Problem     : Java List
Difficulty  : Easy
Max Score   : 10
URL         : https://www.hackerrank.com/challenges/java-list/problem
*/
                        
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < size; i++) {
            list.add(in.nextInt());
        }
        int commandCount = in.nextInt();
        for (int i = 0; i < commandCount; i++) {
            in.nextLine();
            String command = in.nextLine();
            if (command.equals("Insert")) {
                int index = in.nextInt();
                int value = in.nextInt();
                list.add(index, value);
            } else {
                int index = in.nextInt();
                list.remove(index);
            }
        }
        int count = 0;
        for (Integer number : list) {
            System.out.print(number);
            if (count != list.size() - 1) {
                System.out.print(" ");
            }
            count++;
        }
    }
}
