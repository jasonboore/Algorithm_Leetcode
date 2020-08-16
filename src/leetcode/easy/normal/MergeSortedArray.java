package leetcode.easy.normal;

/**
 * 合并两个有序数组
 */
public class MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        if(nums2.length == 0) {
            return;
        }
        int p1 = m - 1, p2 = n - 1, p = m + n - 1;
        while (p1 > -1 && p2 > -1) {
            nums1[p--] = nums1[p1] >= nums2[p2] ? nums1[p1--] : nums2[p2--];
        }
        System.arraycopy(nums2, 0, nums1, 0, p2 + 1);
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,8,0,0,0};
        int[] nums2 = {2,5,6};
        merge(nums1, 3, nums2, 3);
        for (int i : nums1) {
            System.out.println(i);
        }
    }
}
