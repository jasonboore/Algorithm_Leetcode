package leetcode.medium.dp;

/**
 * 最小路径和
 */
public class MinimumPathSum {
    public static int minPathSum1(int[][] grid) {
        if(grid.length == 0) {
            return 0;
        }
        return process(0, 0, grid.length, grid[0].length, grid);
    }
    public static int process(int i, int j, int m, int n, int[][] grid) {
        if(i == m - 1 && j == n - 1) {
            return grid[i][j];
        }
        int minPath = Integer.MAX_VALUE;
        if(i < m - 1) {
            minPath = Math.min(minPath, process(i + 1, j, m, n , grid));
        }
        if(j < n - 1) {
            minPath = Math.min(minPath, process(i, j + 1, m, n , grid));
        }
        return grid[i][j] + minPath;
    }
    public static int minPathSum(int[][] grid) {
        if(grid.length == 0) {
            return 0;
        }
        int m = grid.length;
        int n = grid[0].length;
        int[] dp = new int[n];
        for (int i = n - 1; i > -1; i--) {
            dp[i] = i == n - 1 ? grid[m - 1][i] : grid[m - 1][i] + dp[i + 1];
        }
        for (int i = m - 2; i > -1; i--) {
            dp[n - 1] = grid[i][n - 1] + dp[n - 1];
            for (int j = n - 2; j > -1; j--) {
                dp[j] = Math.min(dp[j], dp[j + 1]) + grid[i][j];
            }
        }
        return dp[0];
    }

    public static void main(String[] args) {
        int[][] grid = {{1,3,1},{1,5,1},{4,2,1}};
        System.out.println(minPathSum(grid));
    }
}
