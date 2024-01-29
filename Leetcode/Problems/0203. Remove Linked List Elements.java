/*
Problem  : Remove Linked List Elements
Link     : https://leetcode.com/problems/remove-linked-list-elements/description/
*/

class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null)
            return head;

        ListNode result = new ListNode(0);
        result.next = head;
        ListNode current = result;

        while (current.next != null)
        {
            if (current.next.val == val)
            {
                current.next = current.next.next;
                continue;
            }
            current = current.next;
        }
        return result.next;
    }
}

/*
Runtime: 1ms
Beats: 91.39% 
Memory: 45.24 MB
Beats: 65.66%
*/