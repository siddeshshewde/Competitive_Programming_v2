class Arge
{
    public static int nbYear(int p0, double percent, int aug, int p)
    {
        int years = 0;
        double a=p0;
        while (a < p)
        {
            a = a + a * percent / 100 + aug;
            years++;
        }
        return years;
    }
}