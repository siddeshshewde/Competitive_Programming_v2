/*
Problem     : Find the Peaks
Difficulty  : Easy
URL         : https://leetcode.com/problems/find-the-peaks/
*/

class Solution {
    public List<Integer> findPeaks(int[] mountain) {
        List<Integer> peaks = new ArrayList<>();
        for (int i = 1 ; i < mountain.length-1 ; i++)
        {
            if (mountain[i] > mountain[i-1] && mountain[i] > mountain[i+1])
            {
                peaks.add(i);
            }
        }
        return peaks;
    }
}

/*
Runtime: 1 ms
Beats: 100%
Memory: 43.42 MB
Beats: 93.24%
*/