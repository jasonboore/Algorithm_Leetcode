package leetcode.easy.normal;

/**
 * 单词规律
 */
public class MoveZeroes {
    public static void moveZeroes(int[] nums) {
        int slow = 0, fast = 0;
        while (fast != nums.length) {
            if(nums[fast] != 0) {
                swap(nums, slow++, fast);
            }
            fast++;
        }
    }
    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes(nums);
        for (int num : nums) {
            System.out.println(num + "-");
        }
    }
}
