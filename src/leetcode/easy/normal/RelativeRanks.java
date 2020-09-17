package leetcode.easy.normal;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/**
 * 相对名次
 */
public class RelativeRanks {
    public static String[] findRelativeRanks(int[] nums) {
        TreeMap<Integer, Integer> treeMap = new TreeMap<>(new compatator());
        for (int i = 0; i < nums.length; i++) {
            treeMap.put(nums[i], i);
        }
        String[] rank = new String[nums.length];
        int count = 1;
        for (Map.Entry<Integer, Integer> entry : treeMap.entrySet()) {
            if(count == 1) {
                rank[entry.getValue()] = "Gold Medal";
            }else if(count == 2) {
                rank[entry.getValue()] = "Silver Medal";
            }else if(count == 3) {
                rank[entry.getValue()] = "Bronze Medal";
            }else {
                rank[entry.getValue()] = count + "";
            }
            count++;
        }
        return rank;
    }
    public static class compatator implements Comparator<Integer> {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o2 - o1;
        }
    }
    public static void main(String[] args) {
        int[] nums = {5, 4, 3, 2, 1};
        for (String relativeRank : findRelativeRanks(nums)) {
            System.out.println(relativeRank);
        }
    }
}
