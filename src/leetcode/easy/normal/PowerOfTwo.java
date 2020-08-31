package leetcode.easy.normal;

public class PowerOfTwo {
    public static boolean isPowerOfTwo(int n) {
        if(n <= 0) {
            return false;
        }
        return (n & (n - 1)) == 0;
    }

    public static boolean isPowerOfTwo1(int n) {
        if(n <= 0) {
            return false;
        }
        return (n & (-n)) == n;
    }
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(16));
    }
}
