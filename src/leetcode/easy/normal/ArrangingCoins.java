package leetcode.easy.normal;

/**
 * 排列硬币
 */
public class ArrangingCoins {
    public static int arrangeCoins(int n) {
        return process(1, n);
    }
    public static int process(int row, int n) {
        if(n < row) {
            return 0;
        }
        return 1 + process(row + 1, n - row);
    }
    public static int arrangeCoins1(int n) {
        int low = 0, high = n;
        while (low <= high) {
            long mid = (high - low) / 2 + low;
            long cost = (mid + 1) * mid / 2;
            if(cost == n) {
                return (int) mid;
            }else if(cost < n) {
                low = (int) (mid + 1);
            }else {
                high = (int) (mid - 1);
            }
        }
        return high;
    }


    public static void main(String[] args) {
        int n = 8;
        System.out.println(arrangeCoins(n));
    }
}
