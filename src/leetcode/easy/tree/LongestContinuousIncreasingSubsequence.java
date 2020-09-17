package leetcode.easy.tree;

/**
 * 最长连续递增序列
 */
public class LongestContinuousIncreasingSubsequence {
    public static int findLengthOfLCIS(int[] nums) {
        if(nums.length == 0) {
            return 0;
        }
        if(nums.length < 2) {
            return 1;
        }
        int i1 = 0;
        int i2 = 1;
        int maxLength = 1;
        while (i2 < nums.length) {
            if(nums[i2] <= nums[i2 - 1]) {
                maxLength = Math.max(maxLength, i2 - i1);
                i1 = i2;
            }
            i2++;
        }
        maxLength = Math.max(i2 - i1, maxLength);
        return maxLength;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,5,4,7};
        System.out.println(findLengthOfLCIS(nums));
    }
}
