package leetcode.easy.normal;

/**
 * 交替位二进制数
 */
public class BinaryNumberwithAlternatingBits {
    public static boolean hasAlternatingBits(int n) {
        n = n ^ (n >> 1);
        return (n & (n + 1)) == 0;
    }

    public static void main(String[] args) {
        int n = 7;
        System.out.println(hasAlternatingBits(n));
    }
}
