def mod256_without_mod(number):
  if (number >= 0) :
      if number < 256 :
          return number
      else :
          return mod256_without_mod(number-256)
  else :
        return mod256_without_mod(number+256)