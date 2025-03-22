/*
 * @lc app=leetcode.cn id=169 lang=java
 *
 * [169] 多数元素
 */

// @lc code=start
class Solution {
    public int majorityElement(int[] nums) {
        int r = nums.length / 2 + 1, max = 0;
        int[] values = new int[r];
        int[] counts = new int[r];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < r; j++) {
                if (values[j] == nums[i]) {
                    counts[j]++;
                    if (counts[j] > nums.length / 2) {
                        return values[j];
                    } else {
                        break;
                    }
                }
                if (j == r - 1) {
                    values[max] = nums[i];
                    counts[max] = 1;
                    max++;
                }
            }
        }
        return values[max - 1];
    }
}
// @lc code=end

