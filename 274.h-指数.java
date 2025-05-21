/*
 * @lc app=leetcode.cn id=274 lang=java
 *
 * [274] H 指数
 */

// @lc code=start
class Solution {
    public int hIndex(int[] citations) {
        int h = 0;
        Arrays.sort(citations);
        for (int i = citations.length - 1; i >= 0; i--) {
            if (citations[i] >= citations.length - i) {
                h = citations.length - i;
            } else {
                break;
            }
        }
        return h;
    }
}
// @lc code=end

