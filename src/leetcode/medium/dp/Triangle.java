package leetcode.medium.dp;

import java.util.ArrayList;
import java.util.List;

/**
 * 三角形最小路径和
 */
public class Triangle {
    public static int minimumTotal(List<List<Integer>> triangle) {
        int[] dp = new int[triangle.size() + 1];
        for (int i = triangle.size() - 1; i > -1; i--) {
            for (int j = 0; j < triangle.get(i).size(); j++) {
                int cur = triangle.get(i).get(j) + Math.min(dp[j], dp[j + 1]);
                dp[j] = cur;
            }
        }
        return dp[0];
    }

    public static void main(String[] args) {

    }
}
