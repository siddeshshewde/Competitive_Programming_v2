function shuffledArray($arr){
    $sum = array_sum($arr)/2;
    $k   = array_search($sum, $arr);
    unset($arr[$k]);
    sort($arr);
    return $arr;
}