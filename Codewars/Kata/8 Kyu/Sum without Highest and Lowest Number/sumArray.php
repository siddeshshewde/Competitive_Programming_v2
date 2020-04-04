function sumArray($array) {
    if ($array == null || count($array) == 0 || count($array) == 1)
       { return 0;}
    $n = $m = $result = $array[0];
    for ($i = 1; $i < count($array); $i++)
    {
        $result = $result + $array[$i];
        if ($array[$i] < $m)
            $m = $array[$i];
        if ($array[$i] > $n)
            $n = $array[$i];
    }
    return $result - $m - $n;
}