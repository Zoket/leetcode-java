/*
 * @lc app=leetcode.cn id=122 lang=java
 *
 * [122] 买卖股票的最佳时机 II
 */

// @lc code=start
class Solution {
    public int maxProfit(int[] prices) {
        int result = 0;
        //从第二个价格开始，计算每个价格和前一个相邻价格的趋势并累计
        for (int i = 1; i < prices.length; i++) {
            int trend = prices[i] - prices[i - 1];
            if (trend > 0) {
                result += trend;
            }
        }
        return result;
    }
}
// @lc code=end

