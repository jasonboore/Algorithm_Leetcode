package leetcode.easy.normal;

import java.util.Stack;

public class MinStack {
    Stack<Integer> stack;
    Stack<Integer> minVal;
    public MinStack() {
        stack = new Stack<>();
        minVal = new Stack<>();
        minVal.push(Integer.MAX_VALUE);
    }

    public void push(int x) {
        stack.add(x);
//        if(x <= minVal.peek()) {
//            minVal.push(x);
//        }
        minVal.push(Math.min(x, minVal.peek()));
    }

    public void pop() {
        int pop = stack.pop();
//        if(pop == minVal.peek()) {
//            minVal.pop();
//        }
        minVal.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minVal.peek();
    }

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(512);
        minStack.push(-1024);
        minStack.push(-1024);
        minStack.push(512);
        minStack.pop();
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.getMin());
    }
}
