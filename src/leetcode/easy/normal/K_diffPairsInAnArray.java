package leetcode.easy.normal;

import java.util.Arrays;

/**
 * 数组中的K-diff数对
 */
public class K_diffPairsInAnArray {
    public static int findPairs(int[] nums, int k) {
        if(nums.length < 2 || k < 0) {
            return 0;
        }
        Arrays.sort(nums);
        int L = 0, R = 1;
        int count = 0;
        int pre = Integer.MAX_VALUE;
        while (R < nums.length && L < nums.length) {
            int val = nums[R] - nums[L];
            if(val == k && nums[L] != pre) {
                if(L != R) {
                    pre = nums[L];
                    L++;
                    count++;
                }
                R++;
            }else if(val > k) {
                L++;
            }else {
                R++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        System.out.println(findPairs(nums, -1));
    }
}
