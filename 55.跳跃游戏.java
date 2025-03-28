/*
 * @lc app=leetcode.cn id=55 lang=java
 *
 * [55] 跳跃游戏
 */

// @lc code=start
class Solution {
    public boolean canJump(int[] nums) {
        //剪枝，只有一个元素一定能到达
        if (nums.length == 1) {
            return true;
        }
        //能到达的最远目的地
        int farthestDes = 0;
        //最后一个值无用，不做判断
        for (int i = 0; i < nums.length - 1; i++) {
            //当前指针所能到达的最远距离
            int tempDes = i + nums[i];
            //如果当前的值为0且最远目的地没越过当前指针，说明自己的前辈都没能跨过该处，由于自己为0无法向前跳跃，则直接返回false
            if (nums[i] == 0 && farthestDes <= tempDes) {
                return false;
            }
            //如果当前最远距离超过存储的最远目的地，则更新之
            if (tempDes > farthestDes) {
                farthestDes = tempDes;
                //更新后如果已经大于等于最后一个下标则满足条件，返回true
                if (farthestDes >= nums.length - 1) {
                    return true;
                }
            }
        }
        return false;
    }
}
// @lc code=end

