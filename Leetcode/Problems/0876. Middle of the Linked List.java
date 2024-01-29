/*
Problem  : Middle of the Linked List
Link     : https://leetcode.com/problems/middle-of-the-linked-list/description/
*/

class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode test = head;
        int n = 0;
        while (test != null)
        {
            n++;
            test = test.next;
        }
        n = n / 2;
        ListNode result = head;
        
        while (n != 0)
        {
            n--;
            result = result.next;
        }
        return result;
    }
}

/*
Runtime: 0ms
Beats: 100% 
Memory: 41.28 MB
Beats: 17.76%
*/