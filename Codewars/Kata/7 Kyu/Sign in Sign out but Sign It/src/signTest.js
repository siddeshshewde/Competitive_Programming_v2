Test.assertEquals(sign(3),1);
Test.assertEquals(sign(-3),-1);
Test.assertEquals(sign("-3"),-1);
Test.assertEquals(sign(0),0);

Test.assertSimilar(sign(NaN),NaN);
Test.assertSimilar(sign("foo"),NaN);
Test.assertSimilar(sign(),NaN);
