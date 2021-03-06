package leetcode.easy.normal;

/**
 * 删除排序数组中的重复项
 */
public class RemoveDuplicatesFromSortedArray {
    public static int removeDuplicates(int[] nums) {
        if(nums.length == 0) {
            return 0;
        }
        int index = 0;
        for (int j = 1; j < nums.length; j++) {
            if(nums[index] == nums[j]) {
                continue;
            }
            nums[index + 1] = nums[j];
            index++;
        }
        return index + 1;
    }

    public static void main(String[] args) {
        int[] nums =  {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
    }
}
