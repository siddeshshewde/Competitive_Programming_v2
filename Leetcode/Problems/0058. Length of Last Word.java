/*
Problem  : Length of Last Word
Link     : https://leetcode.com/problems/length-of-last-word/
*/


class Solution {
    public int lengthOfLastWord(String s) {
        int flag = 0, count = 0;

        for (int i = s.length()-1; i >= 0 ; i--)
        {
            if (flag == 0 && s.charAt(i) == ' ')
            {
                continue;
            }
            else
            {
                flag = 1;
                if (s.charAt(i) != ' ')
                {
                    count++;
                }
                else
                {
                    break;
                }
            }
        }
        return count;
    }
}
/*
Runtime: 0 ms
Beats: 100%
Memory: 40.7 MB
Beats: 64.49%
*/
