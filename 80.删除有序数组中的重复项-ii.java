/*
 * @lc app=leetcode.cn id=80 lang=java
 *
 * [80] 删除有序数组中的重复项 II
 */

// @lc code=start
class Solution {
    public int removeDuplicates(int[] nums) {
        int c = nums[0], count = 1, result = nums.length;
        for (int i = 1; i < nums.length; i++) {
            if (c == nums[i]) {
                if (++count > 2) {
                    while (c == nums[i] && i < result) {
                       int temp = nums[i];
                        for (int j = i + 1; j < result; j++) {
                            nums[j - 1] = nums[j];
                        }
                        nums[result - 1] = temp;
                        result--; 
                    }
                    c = nums[i];
                    count = 1;
                }
            } else {
                c = nums[i];
                count = 1;
            }
        }
        return result;
    }
}
// @lc code=end

