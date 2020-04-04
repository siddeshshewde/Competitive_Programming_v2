function sign(number){
  if( number < 0)
      return -1;
  else if (number > 0)
      return 1;
  else if (number == 0)
      return 0;
  else return NaN;
}