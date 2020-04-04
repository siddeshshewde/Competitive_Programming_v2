function getRealFloor(n)
{
    if(n < 1)
        return n;
    if(n < 13)
        return n-1;
    if(n > 13)
        return n-2;
}