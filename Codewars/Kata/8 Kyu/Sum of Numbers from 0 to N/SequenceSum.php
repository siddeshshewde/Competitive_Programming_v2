class SequenceSum {
  public function showSequence($count) {
     if ($count == 0)
         return "0=0";
     if ($count < 0)
         return $count."<0";
     $result = "";
     $sum = 0;
     for ($i = 0 ; $i <= $count ; $i++)
     {
         if ($i != $count)
         {
             $result = $result.$i."+";
             $sum = $sum + $i;
         }
         else
         {
             $result = $result.$i;
             $sum = $sum + $i;
         }
     }
     return $result." = ".$sum;
  }
}