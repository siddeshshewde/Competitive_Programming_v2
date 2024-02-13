/*
Problem: Replace Spaces
URL: https://www.codingninjas.com/studio/problems/replace-spaces_1172172
*/

import java.util.* ;
import java.io.*; 
public class Solution {
	public static StringBuilder replaceSpaces(StringBuilder str) {
		String a = str.toString();
		a = a.replaceAll(" ","@40");
		StringBuilder sb = new StringBuilder();
		sb.append(a);
		return sb;
	}
}
