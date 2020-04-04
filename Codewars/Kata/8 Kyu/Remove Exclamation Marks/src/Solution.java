class Solution {
    static String removeExclamationMarks(String s) {
        String result = "";
        for (int i = 0 ; i < s.length() ; i++)
        {
            if (s.charAt(i) != '!')
                result = result + s.charAt(i);
        }
        return result;
    }
}