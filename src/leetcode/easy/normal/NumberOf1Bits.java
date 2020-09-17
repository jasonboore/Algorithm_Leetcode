package leetcode.easy.normal;

/**
 * 位1的个数
 */
public class NumberOf1Bits {
    public static int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            count++;
            n &= (n - 1);
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 0b11111111111111111111111111111101;
        System.out.println(hammingWeight(n));
    }
}
