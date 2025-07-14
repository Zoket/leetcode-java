/*
 * @lc app=leetcode.cn id=383 lang=java
 *
 * [383] 赎金信
 */

// @lc code=start
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : magazine.toCharArray()) {
            Integer oldValue = map.getOrDefault(c, 0);
            map.put(c, oldValue + 1);
        }
        for (char c : ransomNote.toCharArray()) {
            Integer i = map.get(c);
            if (Objects.isNull(i) || i == 0) {
                return false;
            } else {
                map.put(c, i - 1);
            }
        }
        return true; 
    }
}
// @lc code=end

