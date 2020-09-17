package leetcode.easy.normal;

/**
 * 数字的补数
 */
public class NumberComplement {
    public static int findComplement(int num) {
        int cn = 0, n = num;
        while (n != 0) {
            n = n >> 1;
            cn++;
        }
        long temp = (1 << cn) - 1;
        return (int) (num ^ temp);
    }

    public static void main(String[] args) {
        System.out.println(findComplement(5));
    }
}
