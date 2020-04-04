describe("Arbitrary values", function () {
  it("should return a correct value for floors lower than 13", function() {
    Test.assertEquals(getRealFloor(1), 0);
    Test.assertEquals(getRealFloor(0), 0);
    Test.assertEquals(getRealFloor(5), 4);
    Test.assertEquals(getRealFloor(10), 9);
    Test.assertEquals(getRealFloor(12), 11);
  });
  
  it("should return a correct value for floors greater than 13", function() {
    Test.assertEquals(getRealFloor(14), 12);
    Test.assertEquals(getRealFloor(15), 13);
    Test.assertEquals(getRealFloor(37), 35);
    Test.assertEquals(getRealFloor(200), 198);
  });
  
  it("should return a correct value for basement floors", function() {
    Test.assertEquals(getRealFloor(-2), -2);
    Test.assertEquals(getRealFloor(-5), -5);
  });
});

describe("Random tests", function () {
  var theRealOne = function (n) {
    if (n == 0) {
      return 0;
    }
    if (n < 0) {
      return - 1 + theRealOne(n + 1);
    }
    if (n == 1) {
      return 0;
    }
    if (n == 13) {
      return theRealOne(n - 1);
    } else {
      return 1 + theRealOne(n - 1);
    }
  };
  
  it("should work for random values", function() {
    var values = [];
    
    for (var i = 0; i < 200; i++) {
      var e = Math.round(Math.random() * 300);
      e += e==13;
      e *= (Math.round(Math.random()) == 1) ? 1 : -1;
      values.push(e);
    }
      
    for (var i = 0; i < values.length; i++) {
      var n = values[i];
      Test.assertEquals(getRealFloor(n), theRealOne(n));
    }
  });
});
