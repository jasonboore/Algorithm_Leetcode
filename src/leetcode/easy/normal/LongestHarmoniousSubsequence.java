package leetcode.easy.normal;

import java.util.HashMap;

/**
 * 最长和谐子序列
 */
public class LongestHarmoniousSubsequence {
    public int findLHS(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        int res = 0;
        for (Integer i : map.keySet()) {
            if(map.containsKey(i + 1)) {
                res = Math.max(res, map.get(i) + map.get(i + 1));
            }
        }
        return res;
    }
}
