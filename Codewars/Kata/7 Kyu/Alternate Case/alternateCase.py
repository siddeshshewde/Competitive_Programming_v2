def alternateCase(s):
        ans = "";
        for i in s :
            if (i.isupper()) :
                i = i.lower();
            else :
                i = i.upper();
            ans = ans + i;
        return ans;