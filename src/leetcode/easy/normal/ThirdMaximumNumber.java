package leetcode.easy.normal;


import java.util.*;

/**
 * 第三大的数
 */
public class ThirdMaximumNumber {
    public static int thirdMax(int[] nums) {
        TreeSet<Integer> set = new TreeSet<>(new compatator());
        for (int num : nums) {
            set.add(num);
            if(set.size() > 3) {
                set.remove(set.first());
            }
        }
        return set.size() == 3 ? set.first() : set.last();
    }
    public static class compatator implements Comparator<Integer> {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o2 - o1;
        }
    }

    public static void main(String[] args) {
        int[] nums = {2, 2, 3, 1, 5, 6, 7, 0};
        System.out.println(thirdMax(nums));
    }
}
