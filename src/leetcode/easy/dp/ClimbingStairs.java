package leetcode.easy.dp;

/**
 * 爬楼梯
 */
public class ClimbingStairs {
    public static int climbStairs(int n) {
        int last1 = 1, last2 = 1;
        int temp;
        for (int i = 2; i <= n; i++) {
            temp = last2;
            last2 = last1 + temp;
            last1 = temp;
        }
        return last2;
    }
    public static int climbStairs1(int n) {
        int[] dp = new int[n + 1];
        dp[0] = dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    public static void main(String[] args) {
        System.out.println(climbStairs(6));
    }
}
