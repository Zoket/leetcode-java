/*
 * @lc app=leetcode.cn id=88 lang=java
 *
 * [88] 合并两个有序数组
 */

// @lc code=start
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (m == 0) {
        for (int i = 0; i < n; i++) {
            nums1[i] = nums2[i];
        }
        return;
        }
        if (n == 0) {
        return;
        }
        int p1 = m - 1, p2 = n - 1, i = nums1.length - 1;
        while (p1 >= 0 || p2 >= 0) {
            int c = 0;
            if (p1 < 0) {
                c = nums2[p2--];
            } else if (p2 < 0) {
                c = nums1[p1--];
            } else if (nums2[p2] > nums1[p1]) {
                c = nums2[p2--];
            } else {
                c = nums1[p1--];
            }
            nums1[i] = c;
            i--;
        }
    }
}
// @lc code=end

