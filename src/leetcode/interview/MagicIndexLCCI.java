package leetcode.interview;

public class MagicIndexLCCI {
    public static int findMagicIndex(int[] nums) {
        return process(nums, 0, nums.length - 1);
    }

    private static int process(int[] nums, int left, int right) {
        if(left > right) {
            return -1;
        }
        int mid = (left + right) / 2;
        int leftIndex = process(nums, left, mid - 1);
        if(leftIndex != -1) {
            return leftIndex;
        }else if(nums[mid] == mid) {
            return mid;
        }
        return process(nums, mid + 1, right);
    }

    public static void main(String[] args) {
        int[] nums = {1,1,1};
        System.out.println(findMagicIndex(nums));
    }
}
