/*
 * @lc app=leetcode.cn id=45 lang=java
 *
 * [45] 跳跃游戏 II
 */

// @lc code=start
class Solution {
    public int jump(int[] nums) {
        //剪枝，只有一个元素一定能到达
        if (nums.length == 1) {
            return 0;
        }
        int index = nums.length - 1;
        int count = 0;
        while (index > 0) {
            int tempIndex = index;
            //从后往前寻找，找到能到达index节点的最远节点，计数，并把index移过去
            for (int i = index - 1; i >= 0; i--) {
                if (i + nums[i] < index) {
                    continue;
                }
                tempIndex = i;
            }
            //如果确实有移动，增加计数，将index往前移
            if (tempIndex != index) {
                count++;
                index = tempIndex;
            }
        }
        return count;
    }
}
// @lc code=end

