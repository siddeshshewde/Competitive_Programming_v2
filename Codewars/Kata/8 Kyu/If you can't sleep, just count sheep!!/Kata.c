#include <string.h>


char* count_sheep(int n) 
{
    char* str = (char*)malloc(n * 12);
    str[0] = '\0';
    for (int i = 1; i <= n; i++)
    {
        char s[13];
        sprintf(s, "%d sheep...", i);
        strcat(str, s);
    }
    return str;
}
