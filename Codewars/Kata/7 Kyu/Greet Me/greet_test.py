@test.describe('Example Tests')
def example_tests():
    test.assert_equals(greet('riley'), 'Hello Riley!')
    test.assert_equals(greet('molly'), "Hello Molly!")
    test.assert_equals(greet('BILLY'), "Hello Billy!")

from random import randint, choices
import string

@test.describe('Random Tests')
def random_tests():

    def generate_random_case(chars=string.ascii_letters, min_name_length=1, max_name_length=10): 
        return ''.join(choices(chars, k=randint( min_name_length, max_name_length)))      

    def _greet_solution(name): 
        return f"Hello {name.capitalize()}!"

    def _do_one_test():
        name = generate_random_case()
        expected = _greet_solution(name)
        actual = greet(name)
        test.assert_equals(actual, expected)

    @test.it('Random Test Cases')
    def random_test_cases():
        for _ in range(100):
            _do_one_test()