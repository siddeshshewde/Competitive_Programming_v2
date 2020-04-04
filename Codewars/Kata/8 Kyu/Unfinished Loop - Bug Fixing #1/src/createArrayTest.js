Test.describe("Fix Timmys Counter", function() {
  Test.it("Fixed Tests", function() {
    Test.assertSimilar(createArray(1),[1]);
    Test.assertSimilar(createArray(2),[1,2]);
    Test.assertSimilar(createArray(3),[1,2,3]);
    Test.assertSimilar(createArray(4),[1,2,3,4]);
    Test.assertSimilar(createArray(5),[1,2,3,4,5]);
  });
});