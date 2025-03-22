/*
 * @lc app=leetcode.cn id=86 lang=java
 *
 * [86] 分隔链表
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
    public ListNode partition(ListNode head, int x) {
        if (head == null) {
            return null;
        }
        ListNode left = new ListNode(), leftHead = left, right = new ListNode(), rightHead = right;
        ListNode pointer = head;
        while (pointer != null) {
            if (pointer.val < x) {
                left.next = pointer;
                left = pointer;
                pointer = pointer.next;
                left.next = null;
            } else {
                right.next = pointer;
                right = pointer;
                pointer = pointer.next;
                right.next = null;
            }
        }
        left.next = rightHead.next;
        return leftHead.next;
    }
}
// @lc code=end

