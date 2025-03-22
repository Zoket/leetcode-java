/*
 * @lc app=leetcode.cn id=20 lang=java
 *
 * [20] 有效的括号
 */
class Solution {

    public static boolean isValid(String s) {
        boolean returnFlag = true;
        char[] charQueue = new char[s.length() + 1];
        int top = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            switch (c) {
                case '(':
                    top++;
                    charQueue[top] = c;
                    break;

                case '[':
                    top++;
                    charQueue[top] = c;
                    break;

                case '{':
                    top++;
                    charQueue[top] = c;
                    break;

                case ')':
                    if (charQueue[top] == '(') top--;
                    else returnFlag = false;
                    break;

                case ']':
                    if (charQueue[top] == '[') top--;
                    else returnFlag = false;
                    break;

                case '}':
                    if (charQueue[top] == '{') top--;
                    else returnFlag = false;
                    break;
            
                default:
                    returnFlag = false;
                    break;
            }
            if (returnFlag == false) break;
            

        }
        if (returnFlag && top != 0) returnFlag = false;
        return returnFlag;
    }
}

