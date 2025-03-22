import Solution.ListNode;

/*
 * @lc app=leetcode.cn id=148 lang=java
 *
 * [148] 排序链表
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {



    public ListNode sortList(ListNode head) {
        ListNode resultHead = null;
        ListNode headTemp = head;
        while (headTemp != null) {
            if (resultHead == null) {
                resultHead = new ListNode(headTemp.val);
                headTemp = headTemp.next;
            } else {
                ListNode resultTemp = resultHead;
                while (resultTemp != null) {
                    //处理头节点大于输入节点的情况
                    if (resultTemp.val > headTemp.val) {
                        ListNode temp = headTemp;
                        headTemp = headTemp.next;
                        temp.next = resultTemp;
                        resultHead = temp;
                        break;
                    } else if (resultTemp.next == null || resultTemp.next.val >= headTemp.val) {
                        ListNode temp = headTemp;
                        headTemp = headTemp.next;
                        temp.next = resultTemp.next;
                        resultTemp.next = temp;
                        break;
                    } else {
                        resultTemp = resultTemp.next;
                        continue;
                    }
                }
            }
            
        }
        return resultHead;
    }


}
// @lc code=end

