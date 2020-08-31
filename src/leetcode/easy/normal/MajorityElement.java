package leetcode.easy.normal;

/**
 * 多数元素
 */
public class MajorityElement {
    public static int majorityElement(int[] nums) {
        int count = 1;
        int candidata = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if(count == 0) {
                candidata = nums[i];
            }
            count += nums[i] == candidata ? 1 : -1;
        }
        return candidata;
    }

    public static void main(String[] args) {
        int[] nums = {3,2,3};
        System.out.println(majorityElement(nums));
    }
}
