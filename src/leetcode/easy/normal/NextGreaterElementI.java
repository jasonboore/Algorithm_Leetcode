package leetcode.easy.normal;

import java.util.HashMap;
import java.util.Stack;

/**
 * 下一个更大元素 I
 */
public class NextGreaterElementI {
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        if(nums2.length == 0 || nums1.length == 0) {
            return new int[]{};
        }
        Stack<Integer> stack = new Stack<>();
        HashMap<Integer, Integer> map =new HashMap<>();
        stack.push(nums2[0]);
        int i = 1;
        while (!stack.isEmpty() && i < nums2.length) {
            while (!stack.isEmpty() && nums2[i] > stack.peek()) {
                map.put(stack.pop(), nums2[i]);
            }
            stack.push(nums2[i++]);
        }
        while (!stack.isEmpty()) {
            map.put(stack.pop(), -1);
        }
        int[] res = new int[nums1.length];
        i = 0;
        for (int i1 : nums1) {
            res[i++] = map.get(i1);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums1 = {2,4}, nums2 = {1,2,3,4};
        for (int i : nextGreaterElement(nums1, nums2)) {
            System.out.println(i);
        }
    }
}
