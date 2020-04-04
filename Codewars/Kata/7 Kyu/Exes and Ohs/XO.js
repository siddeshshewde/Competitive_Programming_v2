function XO(str) {
    var o = str.split('o').length;
    var x = str.split('x').length;
    var O = str.split('O').length;
    var X = str.split('X').length;
    return x + X == o + O ? true : false;
}