package leetcode.easy.normal;

/**
 * 两数之和 II - 输入有序数组
 */
public class TwoSumII {
    public static int[] twoSum(int[] numbers, int target) {
        int L = 0, R = numbers.length - 1;
        while (L < R) {
            int sum = numbers[L] + numbers[R];
            if(sum == target) {
                return new int[]{L + 1, R + 1};
            }
            if(sum > target) {
                R--;
            }
            if(sum < target) {
                L++;
            }
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[] numbers = {2, 7, 11, 15};
        System.out.println(twoSum(numbers, 9)[0]);
        System.out.println(twoSum(numbers, 9)[1]);
    }
}
