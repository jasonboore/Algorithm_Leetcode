package leetcode.easy.normal;

import java.util.Arrays;

/**
 * 最小移动次数使数组元素相等
 */
public class MinimumMovestoEqualArrayElements {
    public static int minMoves(int[] nums) {
        Arrays.sort(nums);
        int moves = 0;
        for (int i = nums.length - 1; i > 0; i--) {
            moves += nums[i] - nums[0];
        }
        return moves;
    }

    public static void main(String[] args) {
        int[] nums = {13, 18, 3, 10, 35, 68, 50, 20};
        System.out.println(minMoves(nums));
    }
}
