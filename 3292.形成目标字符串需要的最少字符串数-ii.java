/*
 * @lc app=leetcode.cn id=3292 lang=java
 *
 * [3292] 形成目标字符串需要的最少字符串数 II
 */

// @lc code=start
class Solution {
    public int minValidStrings(String[] words, String target) {
        int p = 0;
        int result = 0;
        while (p < target.length()) {
            int maxSubstringLength = 0;
            for (int i = 0; i < words.length; i++) {
                maxSubstringLength = Math.max(maxSubstringLength, findMaxCommonSubstring(words[i], target.substring(p)).length());
            }
            if (maxSubstringLength == 0) {
                return -1;
            } else {
                p += maxSubstringLength;
                result++;
            }
        }
        return result;
    }

    public String findMaxCommonSubstring(String a, String b) {
        int i = 0;
        while (i < Math.min(a.length(), b.length())) {
            if (a.charAt(i) == b.charAt(i)) {
                i++;
            } else {
                break;
            }
        }
        return a.substring(0, i);
    }
}
// @lc code=end

