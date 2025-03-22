/*
 * @lc app=leetcode.cn id=75 lang=java
 *
 * [75] 颜色分类
 */

// @lc code=start
class Solution {
    public void sortColors(int[] nums) {
        int left = 0, right = nums.length - 1, temp = 0;
        for (int i = 0; i <= right; i++) {
            while (i <= right && nums[i] == 2) {
                temp = nums[right];
                nums[right] = nums[i];
                nums[i] = temp;
                right--;
            }
            if (nums[i] == 0) {
                temp = nums[left];
                nums[left] = nums[i];
                nums[i] = temp;
                left++;
            }
        }
    }
}
// @lc code=end

