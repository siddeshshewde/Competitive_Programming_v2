# TODO: Replace examples and use TDD development by writing your own tests
# These are some of the methods available:
#   test.expect(boolean, [optional] message)
#   test.assert_equals(actual, expected, [optional] message)
#   test.assert_not_equals(actual, expected, [optional] message)

# You can use Test.describe and Test.it to write BDD style test groupings

Test.assert_equals(multiply(1,1), 1)
Test.assert_equals(multiply(2,1), 2)
Test.assert_equals(multiply(2,2), 4)
Test.assert_equals(multiply(3,5), 15)
