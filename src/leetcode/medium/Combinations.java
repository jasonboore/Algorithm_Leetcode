package leetcode.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * 组合
 */
public class Combinations {
    public static List<List<Integer>> combine(int n, int k) {
        List<Integer> path = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        dfs(1, n, k , path, ans);
        return ans;
    }
    public static void dfs(int cur, int n, int k, List<Integer> path, List<List<Integer>> ans) {
        if(path.size() + (n - cur + 1) < k) {
            return;
        }
        if(path.size() == k) {
            ans.add(new ArrayList<>(path));
            return;
        }
        path.add(cur);
        dfs(cur + 1, n, k, path, ans);
        path.remove(path.size() - 1);
        dfs(cur + 1, n, k, path, ans);
    }

    public static void main(String[] args) {
        int n = 4, k = 2;
        System.out.println(combine(n, k));
    }
}
