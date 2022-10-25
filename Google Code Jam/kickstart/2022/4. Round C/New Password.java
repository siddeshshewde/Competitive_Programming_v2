/*
# Problem      : New Password
# Year         : 2022
# Round        : C
# Points       : 4pts, 6pts
# Description  : https://codingcompetitions.withgoogle.com/kickstart/round/00000000008cb4d1/0000000000b20f15
*/

import java.lang.*;
import java.util.*;

public class Solution
{
    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 1 ; i <= t ; i++)
        {
            int n = sc.nextInt();
            String old_password = sc.next();
            boolean num = false;
            boolean upper = false;
            boolean lower = false;
            boolean digit = false;
            boolean special = false;
            String check = "#@*&";
            
            for (int j = 0 ; j < n ; j++)
            {
                if (Character.isUpperCase(old_password.charAt(j)))
                    upper = true;
                if (Character.isLowerCase(old_password.charAt(j)))
                    lower = true;
                if (Character.isDigit(old_password.charAt(j)))
                    digit = true;
                //if (check.contains(old_password.charAt(j)))
                if (check.indexOf(old_password.charAt(j)) >= 0)
                    special = true; 
            }

            if (n >= 7)
                num = true; 
            
            if (!upper)
                old_password += 'S';
            if (!lower)
                old_password += 'b';
            if (!digit)
                old_password += '1';
            if (!special)
                old_password += '*';
            if (!num)
            {
                while (old_password.length() < 7)
                {
                    old_password += 'b';
                }
            }
            
            System.out.println(String.format("Case #%d: %s", i, old_password));
        }
    }
}