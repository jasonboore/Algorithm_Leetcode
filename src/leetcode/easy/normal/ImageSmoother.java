package leetcode.easy.normal;

/**
 * 图片平滑器
 */
public class ImageSmoother {
    public static int[][] imageSmoother(int[][] M) {
        int row = M.length;
        int col = M[0].length;
        int count;
        int[][] image = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                count = 0;
                for (int k = i - 1; k <= i + 1; k++) {
                    for (int l = j - 1; l <= j + 1; l++) {
                        if(k > -1 && k < row && l > -1 && l < col) {
                            image[i][j] += M[k][l];
                            count++;
                        }
                    }
                }
                image[i][j] /= count;
            }
        }
        return image;
    }

    public static void main(String[] args) {
        int[][] M = {{1,1,1},{1,0,1},{1,1,1}};
        for (int[] ints : imageSmoother(M)) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}
