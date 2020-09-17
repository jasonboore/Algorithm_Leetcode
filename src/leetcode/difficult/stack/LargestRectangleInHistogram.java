package leetcode.difficult.stack;

import java.util.Stack;

/**
 * 柱状图中最大的矩形
 */
public class LargestRectangleInHistogram {
    public static int largestRectangleArea(int[] heights) {
        int maxArea = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < heights.length; i++) {
            while (!stack.isEmpty() && heights[i] <= heights[stack.peek()]) {
                int j = stack.pop();
                int k = stack.isEmpty() ? -1 : stack.peek();
                maxArea = Math.max(maxArea, heights[j] * (i - k - 1));
            }
            stack.push(i);
        }
        while (!stack.isEmpty()) {
            int j = stack.pop();
            int k = stack.isEmpty() ? -1 : stack.peek();
            maxArea = Math.max(maxArea, heights[j] * (heights.length - k - 1));
        }
        return maxArea;
    }

    public static void main(String[] args) {
        int[] nums = {2,1,5,6,2,3};
        System.out.println(largestRectangleArea(nums));
    }
}
