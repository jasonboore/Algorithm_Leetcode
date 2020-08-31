package leetcode.easy.normal;

/**
 * 旋转数组
 */
public class RotateArray {
    public static void rotate(int[] nums, int k) {
        k = k % nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }
    public static void reverse(int[] nums, int L, int R) {
        while (L < R) {
            int temp = nums[L];
            nums[L++] = nums[R];
            nums[R--] = temp;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2};
        rotate(nums, 2);
        for (int num : nums) {
            System.out.print(num);
        }
    }
}
