#https://www.codewars.com/kata/101-dalmatians-squash-the-bugs-not-the-dogs/train/python

# 101 Dalmatians - squash the bugs, not the dogs!


#Your friend has been out shopping for puppies (what a time to be alive!)... He arrives back with multiple dogs, and you simply do not know how to respond!

#By repairing the function provided, you will find out exactly how you should respond, depending on the number of dogs he has.

#The number of dogs will always be a number and there will always be at least 1 dog.

def how_many_dalmatians(number):
  dogs = ["Hardly any", "More than a handful!", "Woah that's a lot of dogs!", "101 DALMATIONS!!!"];
  
  if number <= 10: 
      return dogs[0] 
  elif number <= 50:
      return dogs[1] 
  elif number == 101:
      return dogs[3] 
  else:
      return dogs[2]