Test.assert_equals(high_and_low("4 5 29 54 4 0 -214 542 -64 1 -3 6 -6"), "542 -214");
Test.assert_equals(high_and_low("1 -1"), "1 -1");
Test.assert_equals(high_and_low("1 1"), "1 1");
Test.assert_equals(high_and_low("-1 -1"), "-1 -1");
Test.assert_equals(high_and_low("1 -1 0"), "1 -1");
Test.assert_equals(high_and_low("1 1 0"), "1 0");
Test.assert_equals(high_and_low("-1 -1 0"), "0 -1");
Test.assert_equals(high_and_low("42"), "42 42");
