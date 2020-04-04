res1 = main_diagonal_product([[1,0],[0,1]])
res2 = main_diagonal_product([[1,2,3],[4,5,6],[7,8,9]])

Test.describe("main diagonal product:")

Test.it("main_diagonal_product([1,0],[0,1]) => 1")
Test.assert_equals(res1, 1)

Test.it("main_diagonal_product([1,2,3],[4,5,6],[7,8,9]) => 45")
Test.assert_equals(res2, 45)