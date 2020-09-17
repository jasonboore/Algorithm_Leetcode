package leetcode.easy.normal;

import java.util.Arrays;

/**
 * 数组拆分
 */
public class ArrayPartitionI {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int mins = 0;
        for (int i = 0; i < nums.length; i+=2) {
            mins += nums[i];
        }
        return mins;
    }
}
