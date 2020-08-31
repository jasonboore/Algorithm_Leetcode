package leetcode.easy.normal;

/**
 * 第一个错误版本
 */
public class FirstBadVersion {
    public static int firstBadVersion(int n) {
        int L = 1, R = n, mid;
        while (L < R) {
            mid = L + (R - L) / 2;
            if(isBadVersion(mid)) {
                R = mid;
            }else {
                L = mid + 1;
            }
        }
        return L;
    }
    public static boolean isBadVersion(int version) {
        //TODO 判断版本是否是错误的
        return true;
    }
}
