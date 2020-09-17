package leetcode.medium.dp;

/**
 * 一和零
 */
public class OnesAndZeroes {
    public static int findMaxForm(String[] strs, int m, int n) {
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 0; i < strs.length; i++) {
            int[] count = countZerosAndOnes(strs[i]);
            for (int j = m; j > -1; j--) {
                for (int k = n; k > -1; k--) {
                    if(count[0] <= j && count[1] <= k) {
                        dp[j][k] = Math.max(dp[j][k], 1 + dp[j - count[0]][k - count[1]]);
                    }
                }
            }
        }
        return dp[m][n];
    }
    public static int[] countZerosAndOnes(String s) {
        int[] count = new int[2];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            count[c - '0']++;
        }
        return count;
    }

    public static void main(String[] args) {
        String[] Array = {"10", "0", "1"};
        System.out.println(findMaxForm(Array, 1, 1));
    }
}
