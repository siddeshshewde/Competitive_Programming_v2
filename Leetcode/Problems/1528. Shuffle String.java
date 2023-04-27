/*
Problem  : Shuffle String
Link     : https://leetcode.com/problems/shuffle-string
*/

import java.lang.String;

class Solution {
    public String restoreString(String s, int[] indices) {
        String a[];

        for (int i = 0 ; i < indices.length ; i++)
        {
            a[indices[i]] = s.charAt(i);
        }
        return new String(a);
    }
}
