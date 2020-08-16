package leetcode.easy.dp;

import java.util.ArrayList;
import java.util.List;

/**
 * 杨辉三角
 */
public class PascalTriangle {
    public static List<List<Integer>> generate(int numRows) {
        if(numRows == 0) {
            return new ArrayList<>();
        }
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> l0 = new ArrayList<>();
        l0.add(1);
        ans.add(l0);
        if(numRows == 1) {
            return ans;
        }
        List<Integer> l1 = new ArrayList<>();
        l1.add(1);
        l1.add(1);
        ans.add(l1);
        if(numRows == 2) {
            return ans;
        }
        for (int i = 2; i < numRows; i++) {
            List<Integer> list = new ArrayList<>(i + 1);
            list.add(1);
            for (int j = 1; j < i; j++) {
                list.add(ans.get(i - 1).get(j) + ans.get(i - 1).get(j - 1));
            }
            list.add(1);
            ans.add(list);
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(generate(5));
    }
}
