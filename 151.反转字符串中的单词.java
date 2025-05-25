/*
 * @lc app=leetcode.cn id=151 lang=java
 *
 * [151] 反转字符串中的单词
 */

// @lc code=start
class Solution {
    public String reverseWords(String s) {
        int a = -1;
        StringBuilder sb = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                //如果该字符是字母
                if (i == s.length() - 1 || s.charAt(i + 1) == ' ') {
                    //且是末位或后面是空格，那就是一个单词的结尾，开始拼接
                    a = i;
                }
                if (i == 0 || s.charAt(i - 1) == ' ') {
                    //且是首位或前面是空格，那就是一个单词的开头，s指针标志
                    if (!sb.isEmpty()) {
                        sb.append(' ');
                    }
                    sb.append(s, i, a + 1);
                }
            }
        }
        return sb.toString();
    }
}
// @lc code=end

