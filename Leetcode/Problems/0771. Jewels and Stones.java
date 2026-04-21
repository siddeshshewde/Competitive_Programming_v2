/*
Problem     : Jewels and Stones
URL         : https://leetcode.com/problems/jewels-and-stones/description/
*/

class Solution {
    public int numJewelsInStones(String jewels, String stones) {
    Set<Character> jewelSet = new HashSet<>();
    for (char j : jewels.toCharArray()) {
        jewelSet.add(j);
    }
    
    int count = 0;
    for (char s : stones.toCharArray()) {
        if (jewelSet.contains(s)) {
            count++;
        }
    }
    return count;
    }
}

/*
Runtime: 1 ms
Beats: 64.25%
Memory: 43.48 MB 
Beats: 11.93%
*/