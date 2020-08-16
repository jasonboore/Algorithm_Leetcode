package leetcode.easy.dp;

import java.util.ArrayList;
import java.util.List;

/**
 * 杨辉三角II
 */
public class PascalTriangleII {
    public static List<Integer> getRow(int rowIndex) {
        List<Integer> lastList = new ArrayList<>();
        lastList.add(1);
        if(rowIndex == 0) {
            return lastList;
        }
        List<Integer> ans = new ArrayList<>();
        ans.add(1);
        ans.add(1);
        if(rowIndex == 1) {
            return ans;
        }
        for (int i = 2; i < rowIndex + 1; i++) {
            lastList.clear();
            lastList.addAll(ans);
            ans.clear();
            ans.add(1);
            for (int j = 1; j < i; j++) {
                ans.add(lastList.get(j) + lastList.get(j - 1));
            }
            ans.add(1);
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(getRow(4));
    }
}
