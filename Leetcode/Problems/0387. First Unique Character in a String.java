/*
Problem  : First Unique Character in a String
Link     : https://leetcode.com/problems/first-unique-character-in-a-string/
*/

class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> hm=new HashMap<>();
        for(int i=0;i< s.length();i++){
            if(hm.containsKey(s.charAt(i))){
                hm.put(s.charAt(i), hm.get(s.charAt(i))+1);
            }else{
                hm.put(s.charAt(i),1);
            }
        }

        for(int i=0; i<s.length();i++){
            if(hm.containsKey(s.charAt(i)) && hm.get(s.charAt(i))==1) return i;
        }
        return -1;
    }
}

/*
Runtime: 55 ms
Beats: 6.66%
Memory: 43 MB
Beats: 52.82% 
*/
 