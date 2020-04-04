public class Conversion {

    public String solution(int n) {
        int number [] = {1000, 990, 900, 500, 490, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String roman [] = {"M", "CMXC", "CM", "D", "CDXC", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder ans = new StringBuilder();
        int i = 0;
        while (n > 0 || number.length == (i-1))
        {
            while ((n - number[i]) >= 0)
            {
                n = n - number[i];
                ans.append(roman[i]);
            }
            i++;
        }
        return ans.toString();
    }
}