package leetcode.easy.normal;

/**
 * 错误的集合
 */
public class SetMismatch {
    public static int[] findErrorNums(int[] nums) {
        boolean[] flags = new boolean[nums.length + 1];
        int[] res = new int[2];
        for (int num : nums) {
            if(flags[num]) {
                res[0] = num;
                continue;
            }
            flags[num] = true;
        }
        for (int i = 1; i < flags.length; i++) {
            if(!flags[i]) {
                res[1] = i;
                break;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,2,4};
        for (int errorNum : findErrorNums(nums)) {
            System.out.println(errorNum);
        }
    }
}
