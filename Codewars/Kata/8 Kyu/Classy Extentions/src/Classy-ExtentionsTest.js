Test.describe('Fixed Tests', _ => {
  var cat = new Cat('Mr Whiskers');
  Test.assertEquals(cat.speak(),'Mr Whiskers meows.')
  cat = new Cat('Lamp');
  Test.assertEquals(cat.speak(),'Lamp meows.')
  cat = new Cat('$$Money Bags$$');
  Test.assertEquals(cat.speak(),'$$Money Bags$$ meows.')
});