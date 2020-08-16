package leetcode.easy.normal;

/**
 * 加一
 */
public class PlusOne {
    public static int[] plusOne(int[] digits) {
        int add = 1;
        int temp;
        for (int i = digits.length - 1; i > -1; i--) {
            if(add == 0) {
                break;
            }else {
                temp = digits[i];
                digits[i] = (temp + add) % 10;
                add = (temp + add) / 10;
            }
        }
        if(add == 1) {
            digits = new int[digits.length + 1];
            digits[0] = 1;
        }
        return digits;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        for (int i : plusOne(nums)) {
            System.out.println(i);
        }
    }
}
