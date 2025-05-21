/*
 * @lc app=leetcode.cn id=238 lang=java
 *
 * [238] 除自身以外数组的乘积
 */

// @lc code=start
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int l = nums.length;
        int[] left = new int[l];
        int[] right = new int[l];
        int[] result = new int[l];

        left[0] = 1;
        for (int i = 1; i < l; i++) {
            left[i] = left[i - 1] * nums[i - 1];
        }

        right[l - 1] = 1;
        for (int i = l - 2; i >=0; i--) {
            right[i] = right[i + 1] * nums[i + 1];
        }

        for (int i = 0; i < l; i++) {
            result[i] = left[i] * right[i];
        }
        return result;
    }
}
// @lc code=end

