/*
 * @lc app=leetcode.cn id=18 lang=java
 *
 * [18] 四数之和
 */

// @lc code=start
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        int length = nums.length;
        List<List<Integer>> result = new ArrayList();
        for (int i = 0; i < length - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            if ((long)nums[i] + nums[i + 1] + nums[i + 2] + nums[i + 3] > target) {
                break;
            }
            if ((long)nums[i] + nums[length - 1] + nums[length - 2] + nums[length - 3] < target) {
                continue;
            }
            for (int j = i + 1; j < length - 2; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }
                if ((long)nums[i] + nums[j] + nums[j + 1] + nums[j + 2] > target) {
                    break;
                }
                if ((long)nums[i] + nums[j] + nums[length - 1] + nums[length -2] < target) {
                    continue;
                }
                int k = j + 1, l = length - 1;
                while (k < l) {
                    long temp = nums[i] + nums[j] + nums[k] + nums[l];
                    if (temp == target) {
                        result.add(Arrays.asList(nums[i], nums[j], nums[k], nums[l]));
                        k++;
                        while (k < l && nums[k] == nums[k - 1]) {
                            k++;
                        }
                        l--;
                        while (k < l && nums[l] == nums[l + 1]) {
                            l--;
                        }
                    } else if (temp > target) {
                        l--;
                    } else if (temp < target) {
                        k++;
                    }
                }
            }
        }
        return result;
    }
}
// @lc code=end

