class Kata {
    static String alternateCase(final String string) {
        String ans = "";
        for (int i = 0 ; i < string.length() ; i++)
        {
            char c = string.charAt(i);
            if (Character.isUpperCase(c))
                c = Character.toLowerCase(c);
            else
                c = Character.toUpperCase(c);
            ans = ans + c;
        }
        return ans;
    }
}