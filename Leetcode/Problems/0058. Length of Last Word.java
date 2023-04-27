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