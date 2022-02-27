/*
Problem     : Add Two Numbers
Difficulty  : Medium
URL         : https://leetcode.com/problems/add-two-numbers/
*/


/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */

/*
 * @param {ListNode} l1
 * @param {ListNode} l2
 * @return {ListNode}
 */

 var addTwoNumbers = function(l1, l2) {
    const answer = new ListNode(0);
    var node = answer;
    var carry = 0;
    while(l1 !== null || l2 !== null || carry !== 0) {
        var sum = 0;
        if (carry !== 0) {
            sum += carry;
        }
        carry = 0;
        if (l1 !== null) {
            sum += l1.val;
        }
        if (l2 !== null) {
            sum += l2.val;
        }
        if (sum > 9) {
            sum -= 10;
            carry = 1;
        }
        node.next = new ListNode(sum);
        node = node.next;
        if (l1 !== null) {
            l1 = l1.next;
        }
        if (l2 !== null) {
            l2 = l2.next;
        }
    }

    return answer.next;
};

/*
Runtime: 124 ms, faster than 75.47% of JavaScript online submissions for Add Two Numbers.
Memory Usage: 44.4 MB, less than 40.93% of JavaScript online submissions for Add Two Numbers.
*/