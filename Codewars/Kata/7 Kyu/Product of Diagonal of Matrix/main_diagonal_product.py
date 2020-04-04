def main_diagonal_product(mat):
    product = 1
    for i in range (0, len(mat)) :
        product = product * mat[i][i]
    return product