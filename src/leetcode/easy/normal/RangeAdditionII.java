package leetcode.easy.normal;

/**
 * 范围求和 II
 */
public class RangeAdditionII {
    public static int maxCount(int m, int n, int[][] ops) {
        for (int[] op : ops) {
            m = Math.min(m, op[0]);
            n = Math.min(n, op[1]);
        }
        return m * n;
    }

    public static void main(String[] args) {
        int m = 3, n = 3;
        int[][] operations = {{2,2},{3,3}};
        System.out.println(maxCount(m, n, operations));
    }
}
