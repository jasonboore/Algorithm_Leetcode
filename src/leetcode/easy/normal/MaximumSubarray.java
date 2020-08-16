package leetcode.easy.normal;

/**
 * 最大子序和
 */
public class MaximumSubarray {
    public static int maxSubArray(int[] nums) {
        if(nums.length == 0) {
            return 0;
        }
        int next = nums[nums.length - 1];
        int ans = next;
        for (int i = nums.length - 2; i >= 0; i--) {
            next = next > 0 ? nums[i] + next : nums[i];
            ans = Math.max(next, ans);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }
}
