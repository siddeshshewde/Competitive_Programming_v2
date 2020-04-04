function countPositivesSumNegatives($input) {
    if ($input == null || count($input) == 0)
        return [];
    $p = $n = 0;
    foreach ($input as $i)
    {
        if ($i > 0)
            $p = $p + 1;
        else
            $n = $n + $i;
    }
    return [$p, $n];
}