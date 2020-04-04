function elimination($arr){
    $count = array_search(2, array_count_values($arr));
    return ($count === false) ? null : $count;
}