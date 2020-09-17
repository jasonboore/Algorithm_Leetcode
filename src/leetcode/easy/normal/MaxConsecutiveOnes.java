package leetcode.easy.normal;

/**
 * 最大连续1的个数
 */
public class MaxConsecutiveOnes {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int i = 0;
        int len = nums.length;
        while (i < len) {
            int cur = 0;
            while (i < len && nums[i] == 0) i++;
            while (i < len && nums[i++] == 1) {
                cur++;
            }
            count = Math.max(cur, count);
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,0,1,1,1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }
}
