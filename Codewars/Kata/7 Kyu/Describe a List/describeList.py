def describeList(list):
  if (len(list) == 0):
      return "empty";
  if (len(list) > 1):
      return "longer";
  else:
      return "singleton";