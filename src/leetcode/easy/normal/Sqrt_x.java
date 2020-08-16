package leetcode.easy.normal;

/**
 *  x 的平方根
 */
public class Sqrt_x {
    public static int mySqrt(int x) {
        int L = 0, R = x;
        int ans = -1;
        while (L <= R) {
            int mid = (L + R) / 2;
            if((long)mid * mid <= x) {
                ans = mid;
                L = mid + 1;
            }else {
                R = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int num = 8;
        System.out.println(mySqrt(num));
    }
}
