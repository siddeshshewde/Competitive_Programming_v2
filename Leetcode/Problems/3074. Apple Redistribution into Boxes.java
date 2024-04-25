/*
Problem     : Apple Redistribution into Boxes
Difficulty  : Easy
URL         : https://leetcode.com/problems/apple-redistribution-into-boxes
*/

class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int n = 0;
        int boxes = 0;
        int size = 0;
        for (int i = 0 ; i < apple.length ; i++)
        {
            n += apple[i];
        }
        Arrays.sort(capacity);
        for (int i = capacity.length-1 ; i >= 0 ; i--)
        {
            size += capacity[i];
            boxes++;
            if(size >= n)
            {
                return boxes;
            }
        }
        return 0;
    }
}

/*
Runtime: 2 ms
Beats: 28.83%
Memory: 42.03 MB
Beats: 66.47%
*/