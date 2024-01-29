/*
Problem  : Reverse Linked List
Link     : https://leetcode.com/problems/reverse-linked-list/description/
*/

import java.util.*;

class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode result = null;
        ListNode current = head;

        while (current != null)
        {
            ListNode temp = current.next;
            current.next = result;
            result = current;
            current = temp;
        }
        return result;
    }
}

/*
Runtime: 0ms
Beats: 100% 
Memory: 42.04 MB
Beats: 17.76%
*/