/*
 * @lc app=leetcode.cn id=14 lang=java
 *
 * [14] 最长公共前缀
 */

// @lc code=start
class Solution {
    public String longestCommonPrefix(String[] strs) {
        int l = 201;
        for (String str : strs) {
            l = Math.min(l, str.length());
        }
        if (l == 0) {
            return "";
        }
        int pointer = 0;
        for (int j = 0; j < l; j++) {
            char c = strs[0].charAt(j);
            boolean t = true;
            for (int i = 1; i < strs.length; i++) {
                if (strs[i].charAt(j) != c) {
                    t = false;
                    break;
                }
            }
            if (t) {
                pointer++;
            } else {
                break;
            }
        }
        return strs[0].substring(0, pointer);
    }
}
// @lc code=end

