package leetcode.medium;

/**
 * 整数拆分
 */
public class IntegerBreak {
    public static int integerBreak(int n) {
        if(n <= 3) {
            return n - 1;
        }
        return process(n);
    }
    public static int process(int n){
        if(n == 1) {
            return 1;
        }
        int max = n;
        for (int i = 1; i < n; i++) {
            max = Integer.max(process(n - i) * i, max);
        }
        return max;
    }
    public static int integerBreak1(int n){
        int dp[] = new int[n + 1];
        for (int i = 2; i <= n; i++) {
            int curMax = 0;
            for (int j = 1; j < i; j++) {
                curMax = Math.max(curMax, Math.max(j * (i - j), j * dp[i - j]));
            }
            dp[i] = curMax;
        }
        return dp[n];
    }
    public static void main(String[] args) {
        System.out.println(integerBreak1(58));
    }
}
