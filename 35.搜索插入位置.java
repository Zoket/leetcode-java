/*
 * @lc app=leetcode.cn id=35 lang=java
 *
 * [35] 搜索插入位置
 */

// @lc code=start
class Solution {
    public int searchInsert(int[] nums, int target) {
        int i = 0;
        while (i < nums.length) {
            if (nums[i] == target) {
                return i;
            } else if (nums[i] > target) {
                return i;
            } else if (nums[i] < target) {
                i++;
            }
        }
        return i;
    }
}
// @lc code=end

