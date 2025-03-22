import java.util.ArrayList;
import java.util.List;
/*
 * @lc app=leetcode.cn id=15 lang=java
 *
 * [15] 三数之和
 */

// @lc code=start
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        quickSort(nums);
        int l = 0;
        int r = nums.length - 1;
        List<List<Integer>> result = new ArrayList<>();
        while (l < r) {
            for (int x = l + 1; x < r; x++) {
                if (nums[l] + nums[r] + nums[x] == 0) {
                    List<Integer> combination = new ArrayList<>();
                    combination.add(nums[l]);
                    combination.add(nums[r]);
                    combination.add(nums[x]);
                    result.add(combination);
                }
            }
            l++;
            r--;
        }
        return result;
    }

    private static void quickSort(int[] n) {
        sort(n, 0, n.length - 1);
    
    }

    private static void sort(int[] n, int l, int r) {
        if (l < r) {
            int index = partition(n, l, r);
            sort(n, l, index - 1);
            sort(n, index + 1, r);
        }
    }

    private static int partition(int[] n, int l, int r) {
        int p = n[l];
        int i = l;
        int j = r;
        while (i < j) {
            while (n[j] >= p && j > i) {
                j--;
            }
            while (n[i] <= p && i < j) {
                i++;
            }
            swap(n, i, j);
        }
        swap(n, l, i);
        return i;
    }

    private static void swap(int[] n, int i, int j) {
        int temp = n[i];
        n[i] = n[j];
        n[j] = temp;
    }
}
// @lc code=end

