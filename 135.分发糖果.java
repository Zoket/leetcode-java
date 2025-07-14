/*
 * @lc app=leetcode.cn id=135 lang=java
 *
 * [135] 分发糖果
 */

// @lc code=start
class Solution {
    public int candy(int[] ratings) {
        int n = ratings.length;
        if (n == 1) {
            return 1;
        }
        int[] candy = new int[n];
        candy[0] = 1;
        //下降的忍受值
        int downPatience = 0;
        //连续下降计数
        int downCount = 0;
        int result = 0;
        for (int i = 1; i < n; i++) {
            if (ratings[i] > ratings[i - 1]) {
                //增长趋势，比前面的多一个
                candy[i] = candy[i - 1] + 1;
                downCount = 0;
            } else if (ratings[i] == ratings[i - 1]) {
                candy[i] = 1;
                downCount = 0;
            } else if (ratings[i] < ratings[i - 1]) {
                candy[i] = 0;
                if (downPatience == 0) {
                    //计算忍受值
                    downPatience = candy[i - 1] - 1;
                } else {
                    //忍受值不为0
                    downPatience--;
                    if (downPatience == 0) {
                        candy[i]++;
                    }
                }
                downCount++;
                candy[i] += downCount;
            }
        }
        for (int i = 0; i < n; i++) {
            result += candy[i];
        }
        return result;
    }
}
// @lc code=end

