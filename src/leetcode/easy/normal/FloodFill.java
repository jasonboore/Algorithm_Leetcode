package leetcode.easy.normal;

/**
 * 岛屿的周长
 */
public class FloodFill {
    public static int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        mark(image, sr, sc, image.length, image[0].length, image[sr][sc]);
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[0].length; j++) {
                if(image[i][j] == -1) {
                    image[i][j] = newColor;
                }
            }
        }
        return image;
    }
    public static void mark(int[][] image, int row, int col, int m, int n, int newColor) {
        if(row < 0 || row > m - 1 || col < 0 || col > n - 1 || image[row][col] != newColor) {
            return;
        }
        image[row][col] = -1;
        mark(image, row - 1, col, m, n, newColor);
        mark(image, row + 1, col, m, n, newColor);
        mark(image, row, col - 1, m, n, newColor);
        mark(image, row, col + 1, m, n, newColor);
    }

    public static void main(String[] args) {
        int[][] nums = {{1,1,1},{1,1,0},{1,0,1}};
        for (int[] ints : floodFill(nums, 1, 1, 2)) {
            for (int anInt : ints) {
                System.out.print(anInt);
            }
            System.out.println();
        }
    }
}
