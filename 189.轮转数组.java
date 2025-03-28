/*
 * @lc app=leetcode.cn id=189 lang=java
 *
 * [189] 轮转数组
 */

// @lc code=start
class Solution {
    public void rotate(int[] nums, int k) {
        if (k == 0) {
            return;
        }
        int outIndex = 0, rightTemp;
        //控制总交换次数
        for (int i = 0; outIndex < nums.length; i++) {
            int leftTemp = nums[i];            
            int inIndex = i;
            //循环交换，直到inIndex回到初始位置，如果总交换次数还没完毕，则inIndex前移，继续交换
            do {
                int nextIndex = (inIndex + k) % nums.length;
                rightTemp = nums[nextIndex];
                nums[nextIndex] = leftTemp;
                leftTemp = rightTemp;
                inIndex = nextIndex;
                outIndex++;
            } while (inIndex != i);
        }
    }
}
// @lc code=end

