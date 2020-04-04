def solution(number):
	ans = 0;
	for i in range (1,number,1):
		if (i%3==0 or i%5==0):
			ans += i
	return ans;