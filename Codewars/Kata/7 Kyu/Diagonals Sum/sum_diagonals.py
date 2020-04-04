def sum_diagonals(matrix) :
	sum = 0
	length = len(matrix)-1
	for i in range(len(matrix)) :
		sum = sum + matrix[i][i] + matrix[length][i]
		length = length - 1;
	return sum