function cost (mins) { 
  if (mins <= 65)
  {
      return 30;
  }
  else
  {
      return 30+Math.ceil((mins - 65)/30) * 10;
  }
}