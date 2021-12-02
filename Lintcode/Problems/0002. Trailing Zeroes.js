/*
Problem     : Trailing Zeroes
Difficulty  : Easy
URL         : https://www.lintcode.com/problem/2/
*/

export class Solution {

    /**
     * trailingZeros
     *
     * @param n: A long integer
     * @return: An integer, denote the number of trailing zeros in n!
     */
    trailingZeros(n) {
        let fact = 1;
        for (let i = 1 ; i <= n ; i++)
        {
            fact *= i;
        }
        let zero = 0;
        while (true)
        {
            if (fact % 10 == 0)
            {
                zero += 1;
                fact = parseInt(fact / 10);
            }
            else
            {
                return zero;
            }
        }
    }  
}

/*
time cost: 102ms
memory cost: 9.23MB
beat percent: 37.60%
*/