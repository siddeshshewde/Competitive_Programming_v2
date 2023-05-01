/*
Problem     : Average Salary Excluding the Minimum and Maximum Salary
Difficulty  : Easy
URL         : https://leetcode.com/problems/average-salary-excluding-the-minimum-and-maximum-salary/
*/

class Solution {
    public double average(int[] salary) {
        Arrays.sort(salary);
        double avg = 0;
        for(int i : salary)
        {
            avg += i;
        }
        return (avg-salary[0]-salary[salary.length-1])/(salary.length-2);
    }
}

/*
Runtime: 0 ms
Beats: 100%
Memory: 40.3 MB
Beats: 52.51%
*/