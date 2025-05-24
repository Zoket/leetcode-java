class Solution {
    public int maximumScore(int[] cards, int cnt) {
        Arrays.sort(cards);
        int result = 0;
        //cnt中最小的奇数索引
        int cntJIndex = -1;
        //cnt中最小的偶数索引
        int cntOIndex = -1;

        int point = cards.length - 1;
        while (cnt > 0) {
            result += cards[point];
            if (cards[point] % 2 == 0) {
                cntOIndex = point;
            } else {
                cntJIndex = point;
            }
            point--;
            cnt--;
        }
        if (result % 2 != 0) {
            //不是偶数，需要更新
            //其余数字中最大的奇数索引，用于替换偶数
            int frontJIndex = -1;
            //其余数字中最大的偶数索引，用于替换奇数
            int frontOIndex = -1;
            for (int i = 0; i <= point; i++) {
                if (cards[i] % 2 == 0) {
                    frontOIndex = i;
                } else {
                    frontJIndex = i;
                }
            }

            if (cntJIndex != -1 && frontOIndex != -1) {
                
            }
            int a = cntJIndex != -1 && frontOIndex != -1 ? 
            result - cards[cntJIndex] + cards[frontOIndex] : 0;
            int b = cntOIndex != -1 && frontJIndex != -1 ?
            result - cards[cntOIndex] + cards[frontJIndex] : 0;
            return Math.max(a, b);

        }
        return result;
    }
}