function distanceBetweenPoints(a,b){
  return Math.sqrt ( Math.pow (a.x - b.x, 2) + Math.pow (a.y - b.y, 2) + Math.pow (a.z - b.z, 2));
}