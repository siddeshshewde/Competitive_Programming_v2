@test.describe("Fixed tests")
def fixed_tests():
    @test.it("Tests")
    def it_1():
        Test.assert_equals(split_and_add([1,2,3,4,5], 2), [5,10])
        Test.assert_equals(split_and_add([1,2,3,4,5], 3), [15])
        Test.assert_equals(split_and_add([15], 3), [15])
        Test.assert_equals(split_and_add([1,2,3,4], 1), [4,6])
        Test.assert_equals(split_and_add([1,2,3,4,5,6], 20), [21])
        Test.assert_equals(split_and_add([32,45,43,23,54,23,54,34], 2), [183, 125])
        Test.assert_equals(split_and_add([32,45,43,23,54,23,54,34], 0), [32,45,43,23,54,23,54,34])
        Test.assert_equals(split_and_add([3,234,25,345,45,34,234,235,345], 3), [305, 1195])
        Test.assert_equals(split_and_add([3,234,25,345,45,34,234,235,345,34,534,45,645,645,645,4656,45,3], 4), [1040, 7712])
        Test.assert_equals(split_and_add([23,345,345,345,34536,567,568,6,34536,54,7546,456], 20), [79327])

@test.describe("Random tests")
def random_tests():
    from random import randint as R, choice as C
    from math import log, ceil
    
    def solution(a, n):
        for i in range(min(n, ceil(log(len(a), 2)))):
            m, k = divmod(len(a), 2)
            a = [a[m]] * k + [a[i] + a[i+m+k] for i in range(m)]
        return a

    @test.it("Tests")
    def it_1():
        for _ in range(200):
            n = R(0, 6)
            m = R(0, n * 2)
            a = [R(1, 500) for _ in range(2**n + C([-1, 1]) * (R(0, 2**(n-1)) if n else 0))]
            result = solution(a, m)
            Test.assert_equals(split_and_add(a, m), result)
