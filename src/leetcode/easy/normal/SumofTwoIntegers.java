package leetcode.easy.normal;

/**
 * 两整数之和
 */
public class SumofTwoIntegers {
    public static int getSum(int a, int b) {
        while (b != 0) {
            int temp = a;
            a = a ^ b;
            b = (temp & b) << 1;
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(getSum(16, 23));
    }
}
