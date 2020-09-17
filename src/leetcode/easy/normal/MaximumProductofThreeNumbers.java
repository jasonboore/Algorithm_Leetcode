package leetcode.easy.normal;


/**
 * 三个数的最大乘积
 */
public class MaximumProductofThreeNumbers {
    public static int maximumProduct(int[] nums) {
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE, max3 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        for (int num : nums) {
            if(num <= min1) {
                min2 = min1;
                min1 = num;
            }else if(num < min2) {
                min2 = num;
            }
            if(num >= max1) {
                max3 = max2;
                max2 = max1;
                max1 = num;
            }else if(num >= max2) {
                max3 = max2;
                max2 = num;
            }else if(num > max3){
                max3 = num;
            }
        }
        return Math.max(min1 * min2 * max1, max1 * max2 * max3);
    }

    public static void main(String[] args) {
        int[] nums = {1000,1000,1000};
        System.out.println(maximumProduct(nums));
    }
}
