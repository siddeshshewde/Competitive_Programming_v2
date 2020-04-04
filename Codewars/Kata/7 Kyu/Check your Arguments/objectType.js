function objectType(obj) { //if no arguments are passed, defaults to null
  return Object.prototype.toString.call(arguments.length == 0 ? null : obj);
}