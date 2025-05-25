/*
 * @lc app=leetcode.cn id=58 lang=java
 *
 * [58] 最后一个单词的长度
 */

// @lc code=start
class Solution {
    public int lengthOfLastWord(String s) {
        char[] chars = s.toCharArray();
        boolean start = false;
        int count = 0;
        for (int i = chars.length - 1; i >=0; i--) {
            if (chars[i] != ' ') {
                if (!start) {
                    start = true;
                    count++;
                } else {
                    count++;
                }
            } else {
                if (start) {
                    return count;
                }
            }
        }
        return count;
    }
}
// @lc code=end

