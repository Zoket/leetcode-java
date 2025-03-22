/*
 * @lc app=leetcode.cn id=27 lang=java
 *
 * [27] 移除元素
 */

// @lc code=start
class Solution {
    public int removeElement(int[] nums, int val) {
        int k = nums.length;
        int j = 0;
        while (j < k) {
            if (nums[j] == val) {
                nums[j] = nums[k - 1];
                k--;
            } else {
                j++;
            }
        }
        return k;
    }
}
// @lc code=end

