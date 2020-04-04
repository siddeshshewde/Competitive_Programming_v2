import java.util.*;

class Kata {
    static String camelCase(final String string) {
        String [] str = string.split(" ");
        String result = "";
        for (int i = 0 ; i < str.length ; i++)
        {
            if (str[i].length() == 1)
            {
                result = result + str[i];
                continue;
            }
            if (str[i].length() == 0)
                continue;
            result = result + str[i].substring(0,1).toUpperCase() + str[i].substring(1);
        }
        return result;
    }   
}