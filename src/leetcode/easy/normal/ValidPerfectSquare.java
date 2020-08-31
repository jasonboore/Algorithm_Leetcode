package leetcode.easy.normal;

/**
 * 有效的完全平方数
 */
public class ValidPerfectSquare {
    public static boolean isPerfectSquare(int num) {
        if(num < 2) {
            return true;
        }
        long L = 2, R = num / 2, mid, temp;
        while (L <= R) {
            mid = (L + R) / 2;
            temp = mid * mid;
            if(temp == num) {
                return true;
            }
            if(temp < num) {
                L = mid + 1;
            }else {
                R = mid - 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPerfectSquare(808201));
    }
}
