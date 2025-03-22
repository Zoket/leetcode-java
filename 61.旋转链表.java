/*
 * @lc app=leetcode.cn id=61 lang=java
 *
 * [61] 旋转链表
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        ListNode pointer = head;
        int length = 0;
        if (pointer == null) {
            return null;
        }
        while (pointer.next != null) {
            pointer = pointer.next;
            length++;
        }
        int offset = length + 1 - (k % (length + 1));
        pointer.next = head;
        for (int i = 0; i < offset; i++) {
            pointer = pointer.next;
        }
        ListNode result = pointer.next;
        pointer.next = null;
        return result;
    }
}
// @lc code=end

