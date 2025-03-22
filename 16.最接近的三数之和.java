/*
 * @lc app=leetcode.cn id=16 lang=java
 *
 * [16] 最接近的三数之和
 */

// @lc code=start
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int result = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int j = i + 1, k = nums.length - 1;
            while (j < k) {
                int t = nums[i] + nums[j] + nums[k];
                if (t == target) {
                    return t;
                }
                if (Math.abs(target - t) < Math.abs(target - result)) {
                    result = t;
                } else {
                    if (t > target) {
                        k--;
                    } else if (t < target) {
                        j++;
                    } else {
                        return t;
                    }
                }
            }
        }
        return result;
    }
}
// @lc code=end

