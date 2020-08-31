package leetcode.easy.normal;

import java.util.Arrays;
import java.util.HashMap;

/**
 * 两个数组的交集II
 */
public class IntersectionofTwoArraysII {
    public static int[] intersect(int[] nums1, int[] nums2) {
        if(nums1.length == 0 || nums2.length == 0) {
            return new int[]{};
        }
        HashMap<Integer, Integer> map1 = new HashMap<>();

        for (int i = 0; i < nums1.length; i++) {
            if(map1.containsKey(nums1[i])) {
                map1.put(nums1[i], map1.get(nums1[i]) + 1);
            }else {
                map1.put(nums1[i], 1);
            }
        }
        int[] res = new int[nums1.length];
        int index = 0;
        for (int i = 0; i < nums2.length; i++) {
            if(map1.containsKey(nums2[i]) && map1.get(nums2[i]) > 0) {
                res[index++] = nums2[i];
                map1.put(nums2[i], map1.get(nums2[i]) - 1);
            }
        }
        return Arrays.copyOfRange(res, 0, index);
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1}, nums2 = {2,2};
        for (int i : intersect(nums1, nums2)) {
            System.out.println(i);
        }
    }
}
