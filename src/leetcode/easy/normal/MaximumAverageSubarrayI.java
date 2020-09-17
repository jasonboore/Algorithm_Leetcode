package leetcode.easy.normal;

/**
 * 子数组最大平均数 I
 */
public class MaximumAverageSubarrayI {
    public static double findMaxAverage(int[] nums, int k) {
        long sum = 0;
        int i = 0;
        while (i < k) {
            sum += nums[i++];
        }
        double res = sum;
        while (i < nums.length) {
            sum -= nums[i - k];
            sum += nums[i++];
            res = Math.max(res, sum);
        }
        return res / k;
    }

    public static void main(String[] args) {
        int[] nums = {1,12,-5,-6,50,3};
        System.out.println(findMaxAverage(nums, 4));
    }
}
