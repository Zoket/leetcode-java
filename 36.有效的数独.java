/*
 * @lc app=leetcode.cn id=36 lang=java
 *
 * [36] 有效的数独
 */

// @lc code=start
class Solution {
    public boolean isValidSudoku(char[][] board) {
        //0-8行是行，9-17是列，18-26是九宫格
        int[][] bMap = new int[27][9];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                int n = charToNumber(board[i][j]);
                if (n == 0) {
                    continue;
                }
                
                //分别计算行、列、九宫格内的对应位图值，并判断如果大于1则表示该位置的数字出现超过一次，则立即返回false
                if (++bMap[i][n - 1] > 1 
                        || ++bMap[j + 9][n - 1] > 1 
                        || ++bMap[(i / 3) * 3 + (j / 3) + 18][n - 1] > 1) {
                    return false;
                }
            }
        }
        return true;
    }

    public int charToNumber(char c) {
        return c == '.' ? 0 : (int) c - 48;
    }

}
// @lc code=end

