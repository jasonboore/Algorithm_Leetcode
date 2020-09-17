package leetcode.medium;

import java.util.*;

/**
 *前K个高频元素
 */
public class TopKFrequentElements {
    public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        PriorityQueue<int[]> priorityQueue = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o2[1] - o1[1];
            }
        });
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            priorityQueue.add(new int[] {entry.getKey(), entry.getValue()});
        }
        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = priorityQueue.poll()[0];
        }
        return res;
    }

    public static int[] topKFrequent1(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        List<Integer>[] lists = new List[nums.length + 1];
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int i = entry.getValue();
            if(lists[i] == null) {
                lists[i] = new ArrayList<>();
            }
            lists[i].add(entry.getKey());
        }
        int[] res = new int[k];
        int index = 0;
        for (int i = lists.length - 1; i > -1; i--) {
            if(lists[i] != null) {
                for (Integer integer : lists[i]) {
                    res[index++] = integer;
                    if (index == k) {
                        return res;
                    }
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
        for (int i : topKFrequent1(nums, 2)) {
            System.out.println(i);
        }
    }
}
