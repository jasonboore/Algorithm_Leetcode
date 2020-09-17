package leetcode.medium.dp;

/**
 * 不同路径 II
 */
public class UniquePathsII {
    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[] dp = new int[n];
        for (int i = 0; i < n; i++) {
            if(obstacleGrid[0][i] == 1) {
                break;
            }
            dp[i] = 1;
        }
        for (int i = 1; i < m; i++) {
            if(obstacleGrid[i][0] == 1) {
                dp[0] = 0;
            }
            for (int j = 1; j < n; j++) {
                dp[j] = obstacleGrid[i][j] != 1 ? dp[j] + dp[j - 1] : 0;
            }
        }
        return dp[n - 1];
    }

    public static void main(String[] args) {
        int[][] nums = {{0,0},{1,1},{0,0}};
        System.out.println(uniquePathsWithObstacles(nums));
    }
}
