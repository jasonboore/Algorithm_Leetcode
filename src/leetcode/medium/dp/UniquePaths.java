package leetcode.medium.dp;

/**
 * 不同路径
 */
public class UniquePaths {
    public static int uniquePaths1(int m, int n) {
        if(m == 1 || n == 1) {
            return 1;
        }
        return process(0, 0, m - 1, n - 1);
    }
    public static int process(int i, int j, int m, int n) {
        if(i == m || j == n) {
            return 1;
        }
        return process(i + 1, j, m, n) + process(i, j + 1, m, n);
    }
    public static int uniquePaths(int m, int n) {
        int[] dp = new int[m];
        for (int i = 0; i < m; i++) {
            dp[i] = 1;
        }
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                dp[j] = dp[j] + dp[j - 1];
            }
        }
        return dp[m - 1];
    }
    public static void main(String[] args) {
        System.out.println(uniquePaths(7, 3));
    }
}
