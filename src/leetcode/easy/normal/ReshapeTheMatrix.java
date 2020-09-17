package leetcode.easy.normal;

/**
 * 重塑矩阵
 */
public class ReshapeTheMatrix {
    public static int[][] matrixReshape(int[][] nums, int r, int c) {
        int row = nums.length;
        int col = nums[0].length;
        if(row * col != r * c) {
            return nums;
        }
        int[][] newNums = new int[r][c];
        int m = 0;
        int n = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                newNums[m][n++] = nums[i][j];
                if(n == c) {
                    n = 0;
                    m++;
                }
            }
        }
        return newNums;
    }

    public static void main(String[] args) {
        int[][] nums = {{1,2}, {3,4}};
        for (int[] ints : matrixReshape(nums, 1, 4)) {
            for (int anInt : ints) {
                System.out.print(anInt + "");
            }
            System.out.println();
        }
    }
}
