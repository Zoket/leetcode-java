/*
 * @lc app=leetcode.cn id=13 lang=java
 *
 * [13] 罗马数字转整数
 */

// @lc code=start
class Solution {
    public int romanToInt(String s) {
        char[] chars = s.toCharArray();
        int result = 0;
        for (int i = 0; i < chars.length; i++) {
            switch (chars[i]) {
                case 'I':
                    result += 1;
                    break;
                case 'V':
                    if (i > 0 && chars[i - 1] == 'I') {
                        result += 3;
                    } else {
                        result += 5;
                    }
                    break;
                case 'X':
                    if (i > 0 && chars[i - 1] == 'I') {
                        result += 8;
                    } else {
                        result += 10;
                    }
                    break;
                case 'L':
                    if (i > 0 && chars[i - 1] == 'X') {
                        result += 30;
                    } else {
                        result += 50;
                    }
                    break;
                case 'C':
                    if (i > 0 && chars[i - 1] == 'X') {
                        result += 80;
                    } else {
                        result += 100;
                    }
                    break;
                case 'D':
                    if (i > 0 && chars[i - 1] == 'C') {
                        result += 300;
                    } else {
                        result += 500;
                    }
                    break;
                case 'M':
                    if (i > 0 && chars[i - 1] == 'C') {
                        result += 800;
                    } else {
                        result += 1000;
                    }
                    break;
            }
        }
        return result;
    }
}
// @lc code=end

