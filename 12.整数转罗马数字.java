/*
 * @lc app=leetcode.cn id=12 lang=java
 *
 * [12] 整数转罗马数字
 */

// @lc code=start
class Solution {
    public String intToRoman(int num) {
        StringBuilder sb = new StringBuilder();
        //M
        int y = num % 1000;
        int x = (num / 1000) > 3 ? 3 : num / 1000;
        for (int i = 0; i < x; i++) {
            sb.append("M");
        }
        num = num - x * 1000;
        //CM
        y = num % 900;
        x = num / 900;
        if (x > 0) {
            sb.append("CM");
        }
        num -= x * 900;
        //D
        y = num % 500;
        x = (num / 500) > 3 ? 3 : num / 500;
        for (int i = 0; i < x; i++) {
            sb.append("D");
        }
        num -= x * 500;
        //CD
        y = num % 400;
        x = num / 400;
        if (x > 0) {
            sb.append("CD");
        }
        num -= x * 400; 
        //C
        y = num % 100;
        x = (num / 100) > 3 ? 3 : num / 100;
        for (int i = 0; i < x; i++) {
            sb.append("C");
        }
        num -= x * 100;
        //XC
        y = num % 90;
        x = num / 90;
        if (x > 0) {
            sb.append("XC");
        }
        num -= x * 90; 
        //L
        y = num % 50;
        x = (num / 50) > 3 ? 3 : num / 50;
        for (int i = 0; i < x; i++) {
            sb.append("L");
        }
        num -= x * 50;
        //XL
        y = num % 40;
        x = num / 40;
        if (x > 0) {
            sb.append("XL");
        }
        num -= x * 40;

        //X
        y = num % 10;
        x = (num / 10) > 3 ? 3 : num / 10;
        for (int i = 0; i < x; i++) {
            sb.append("X");
        }
        num -= x * 10;
        //IX
        y = num % 9;
        x = num / 9;
        if (x > 0) {
            sb.append("IX");
        }
        num -= x * 9;


        //V
        y = num % 5;
        x = (num / 5) > 3 ? 3 : num / 5;
        for (int i = 0; i < x; i++) {
            sb.append("V");
        }
        num -= x * 5;
        //IV
        y = num % 4;
        x = num / 4;
        if (x > 0) {
            sb.append("IV");
        }
        num -= x * 4;

        //I
        for (int i = 0; i < num; i++) {
            sb.append("I");
        }
        return sb.toString();
    }
}
// @lc code=end

