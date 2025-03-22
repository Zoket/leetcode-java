/*
 * @lc app=leetcode.cn id=19 lang=java
 *
 * [19] 删除链表的倒数第 N 个结点
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return null;
        }
        int length = 1;
        ListNode p = head;
        while (p.next != null) {
            p = p.next;
            length++;
        }
        if (length == n) {
            return head.next;
        }
        ListNode parent = head;
        for (int i = 0; i < length - n - 1; i++) {
            parent = parent.next;
        }
        parent.next = parent.next.next;
        return head;
        }
    }
// @lc code=end

