/*
 * @lc app=leetcode.cn id=121 lang=java
 *
 * [121] 买卖股票的最佳时机
 */

// @lc code=start
class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int result = 0;
        //从第二个价格开始，计算每个价格和前一个相邻价格的趋势并累计
        for (int i = 1; i < prices.length; i++) {
            result += prices[i] - prices[i - 1];
            //如果累计为负，则这个方案作废，回归0
            if (result < 0) {
                result = 0;
            }
            //如果当前累计超出最大，则提取出来
            if (result > max) {
                max = result;
            }
        }
        return max;
    }
}
// @lc code=end

