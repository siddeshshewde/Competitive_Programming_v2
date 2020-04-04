function isValidIP(string $str): bool
{
    $a = explode('.', $str);
    if (count($a) == 4)
    {
        foreach ($a as $n)
        {
            if ($n < 0 || $n > 255 || !ctype_digit($n))
            {
                return false;
            }
        }
    }
    else
    {
        return false;
    }
    return true;
}
