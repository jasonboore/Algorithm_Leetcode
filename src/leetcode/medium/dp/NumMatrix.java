package leetcode.medium.dp;

/**
 * 二维区域和检索 - 矩阵不可变
 */
    public class NumMatrix {
        int[][] dp;
        public NumMatrix(int[][] matrix) {
            if(matrix.length == 0 || matrix[0].length == 0) {
                return;
            }
            dp = new int[matrix.length][matrix[0].length + 1];
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[0].length; j++) {
                    dp[i][j + 1] = dp[i][j] + matrix[i][j];
                }
            }
        }

        public int sumRegion(int row1, int col1, int row2, int col2) {
            int sum = 0;
            for (int i = row1; i <= row2; i++) {
                sum += dp[i][col2 + 1] - dp[i][col1];
            }
            return sum;
        }
}
