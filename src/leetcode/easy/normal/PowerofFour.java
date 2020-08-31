package leetcode.easy.normal;

/**
 * 4的幂
 */
public class PowerofFour {
    public static boolean isPowerOfFour(int num) {
        if(num < 1) {
            return false;
        }
        return ((num & (num - 1)) == 0) && (num & 0xaaaaaaaa) == 0;
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfFour(20));
    }
}
