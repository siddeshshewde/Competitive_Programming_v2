#include <stdlib.h>

int nearest_sq(int n)
{
    if (n==1)
      return 1;
    int difference = n, solution = 0;
    
    for (int i = 1 ; i <= n ; i++)
    {
        if (difference >= (abs(n-i*i)))
        {
            difference = abs(n-i*i);
            solution = i*i;
        }
    }
    printf ("%i - %i",solution,n);
    return solution;
}
