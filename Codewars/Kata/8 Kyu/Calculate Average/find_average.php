function find_average($array) {
  $sum = 0;
  for ($i=0 ; $i<count($array) ; $i++)
    $sum = $sum + $array[$i];
  return $sum / count($array);
}