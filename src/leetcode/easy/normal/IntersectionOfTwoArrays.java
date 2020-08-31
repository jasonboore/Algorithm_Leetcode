package leetcode.easy.normal;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * 两个数组的交集
 */
public class IntersectionOfTwoArrays {
    public static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            set.add(nums1[i]);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums2.length; i++) {
            if(set.contains(nums2[i])) {
                list.add(nums2[i]);
                set.remove(nums2[i]);
            }
        }
        int[] ans = new int[list.size()];
        int index = 0;
        for (Integer integer : list) {
            ans[index++] = integer;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1}, nums2 = {2,2};
        for (int i : intersection(nums1, nums2)) {
            System.out.println(i);
        }
    }
}
