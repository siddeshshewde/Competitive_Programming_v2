/*
Problem     : Valid Parentheses
Difficulty  : Easy
URL         : https://leetcode.com/problems/valid-parentheses
*/

class Solution {
    public boolean isValid(String s) {
        Stack<Character> a = new Stack<Character>();
        for (int i = 0 ; i < s.length() ; i++)
        {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{')
            {
                a.push(s.charAt(i));
            }
            else 
            {
                if (a.empty())
                    return false;
                char ch = a.pop();
                if (ch == '(' && s.charAt(i) != ')')
                    return false;
                else if (ch == '{' && s.charAt(i) != '}')
                    return false;
                else if (ch == '[' && s.charAt(i) != ']')
                    return false;
            }
            
            System.out.println(i);
            System.out.println(s.charAt(i));
        }
        if (a.empty())
            return true;
        return false;
    }
}

/*
Runtime: 32 ms
Beats: 5.1%
Memory: 43.2 MB
Beats: 5.22%
*/