/*
 * @lc app=leetcode.cn id=125 lang=java
 *
 * [125] 验证回文串
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            while (left < right && group(s.charAt(left)) == 2) {
                left++;
            }
            while (right > left && group(s.charAt(right)) == 2) {
                right--;
            }
            if (group(s.charAt(left)) != group(s.charAt(right))) {
                return false;
            } else {
                int i = Math.abs(s.charAt(left) - s.charAt(right));
                if (i != 0 && i != 32) {
                    return false;
                }
            }
            left++;
            right--;
        }
        return true;
    }

     private int group(char c) {
        if (c >= 48 && c <= 57) {
            return 0;
        } else if ((c >= 65 && c <= 90) || (c >= 97 && c <= 122)) {
            return 1;
        } else {
            return 2;
        }
    }
}
// @lc code=end

