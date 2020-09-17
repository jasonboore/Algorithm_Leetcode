package leetcode.easy.normal;

/**
 * 平方数之和
 */
public class SumofSquareNumbers {
    public static boolean judgeSquareSum(int c) {
        for (int i = 0; i <= Math.sqrt(c); i++) {
            double x = Math.sqrt(c - i * i);
            if(x == (int)x) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(judgeSquareSum(5));
    }
}
