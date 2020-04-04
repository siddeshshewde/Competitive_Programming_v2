def get_middle(s):
    ans = "";
    n=len(s);
    if (n%2==0):
        ans = ans + s[n/2-1];
        ans = ans + s[n/2];
        return ans;
    ans = ans +  s[n/2];
    return ans;