package leetcode.company;

import java.util.Stack;

/**
 * 单调栈
 * 烽火问题
 */
public class BeaconCount {
    public static int countBeacon(int[] nums) {
        if(nums.length < 2) {
            return 0;
        }
        int count = 0;
        int size = nums.length;
        int maxIndex = 0;
        for (int i = 0; i < size; i++) {
            maxIndex = nums[maxIndex] < nums[i] ? i : maxIndex;
        }
        Stack<Pair> stack = new Stack<>();
        stack.push(new Pair(nums[maxIndex]));
        int index = nextIndex(maxIndex, size);
        while (index != maxIndex) {
            int value = nums[index];
            while (!stack.isEmpty() && value > stack.peek().value) {
                int times = stack.pop().times;
                count += getNum(times) + times;
                count += stack.isEmpty() ? 0 : times;
            }
            if(!stack.isEmpty() && value == stack.peek().value) {
                stack.peek().times++;
            }else {
                stack.push(new Pair(value));
            }
            index = nextIndex(index, size);
        }
        while (!stack.isEmpty()) {
            int times = stack.pop().times;
            count += getNum(times);
            if(!stack.isEmpty()) {
                count += times;
                if(stack.size() > 1) {
                    count += times;
                }else {
                    count += stack.peek().times > 1 ? times : 0;
                }
            }
        }
        return count;
    }
    public static class Pair{
        int value;
        int times;
        public Pair(int value) {
            this.value = value;
            this.times = 1;
        }
    }
    public static int nextIndex(int i, int size) {
        return i < size - 1 ? i + 1 : 0;
    }
    public static long getNum(int k) {
        return k == 1L ? 0  : k * (k - 1) / 2L;
    }

    public static void main(String[] args) {
        int[] nums = {4,3,3,3,5};
        System.out.println(countBeacon(nums));
    }
}
