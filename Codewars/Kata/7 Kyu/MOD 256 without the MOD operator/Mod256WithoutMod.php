function mod256WithoutMod($number)
{
    if ($number > 0 and $number < 256)
          return $number;
      while ($number >= 256)
          $number = $number - 256;
      while ($number+256 <= 0)
          $number = $number + 256;
      return $number;
}