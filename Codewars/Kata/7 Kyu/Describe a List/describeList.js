function describeList(x) {
  if (x.length === 0)
      return "empty";
  if (x.length > 1)
      return "longer";
  else
      return "singleton";
}