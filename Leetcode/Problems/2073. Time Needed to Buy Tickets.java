/*
Problem     : Time Needed to Buy Tickets
URL         : https://leetcode.com/problems/time-needed-to-buy-tickets/
*/

class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int time = 0;
        while (true)
        {
            for (int i = 0 ; i < tickets.length ; i++)
            {
                if (tickets[i] > 0)
                {
                    tickets[i]--;
                    time++;
                }
                if (i == k && tickets[i] == 0)
                    return time;
            }
        }
    }
}

/*
Runtime: 2 ms
Beats: 45.54%
Memory: 40.98 MB
Beats: 71.56%
*/