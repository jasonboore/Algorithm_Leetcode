package leetcode.easy.normal;

import java.util.Collections;
import java.util.HashMap;

/**
 * 数组的度
 */
public class DegreeOfAnArray {
    public static int findShortestSubArray(int[] nums) {
        HashMap<Integer, Integer> count = new HashMap<>(),
                left = new HashMap<>(), right = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            left.putIfAbsent(num, i);
            right.put(num, i);
            count.put(num, count.getOrDefault(num, 0) + 1);
        }
        int maxLen = Collections.max(count.values());
        int ans = nums.length;
        for (Integer integer : count.keySet()) {
            if(count.get(integer) == maxLen) {
                ans = Math.min(ans, right.get(integer) - left.get(integer) + 1);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,2,3,1,4,2};
        System.out.println(findShortestSubArray(nums));
    }
}
