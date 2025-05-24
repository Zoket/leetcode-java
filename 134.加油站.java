/*
 * @lc app=leetcode.cn id=134 lang=java
 *
 * [134] 加油站
 */

// @lc code=start
class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        int[] reduce = new int[n];
        for (int i = 0; i < n; i++) {
            reduce[i] = gas[i] - cost[i];
        }
        //找reduce非负位置
        int noNegativeIndex = -1;
        //从上面的非负位置开始的累计，一旦出现负值则该非负位置无法到达，舍弃
        int noNegativeSum = 0;
        //整个reduce的累计，只要小于0则肯定无法完成
        int whole = 0;
        for (int i = 0; i < n; i++) {
            if (reduce[i] >= 0 && noNegativeIndex < 0) {
                noNegativeIndex = i;
            }
            if (noNegativeIndex != -1) {
                //非负位置找到，整个累计之外额外开启非负累计
                noNegativeSum += reduce[i];
                if (noNegativeSum < 0) {
                    //非负累计出现负值，无法到达，重置
                    noNegativeIndex = -1;
                    noNegativeSum = 0;
                }
            }
            whole += reduce[i];
        }
        
        if (whole >= 0 && noNegativeIndex != -1) {
            return noNegativeIndex;
        } else {
            return -1;
        }
    }
}
// @lc code=end

