package leetcode.easy.normal;

import java.util.Stack;

/**
 * 棒球比赛
 */
public class BaseballGame {
    public static int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack<>();
        for (String op : ops) {
            if(op.equals("+")) {
                int top = stack.pop();
                int newTop = top + stack.peek();
                stack.push(top);
                stack.push(newTop);
            }else if(op.equals("C")) {
                stack.pop();
            }else if(op.equals("D")) {
                stack.push(stack.peek() * 2);
            }else {
                stack.push(Integer.valueOf(op));
            }
        }
        int ans = 0;
        for (Integer integer : stack) {
            ans += integer;
        }
        return ans;
    }

    public static class Pair{
        int sum;
        int num;
        public Pair(int num, int sum) {
            this.sum = sum;
            this.num = num;
        }
    }
    public static int calPoints1(String[] ops) {
        Stack<Pair> stack = new Stack<>();
        for (String op : ops) {
            if(op.equals("+")) {
                Pair top = stack.pop();
                int newTop = top.num + stack.peek().num;
                stack.push(top);
                stack.push(new Pair(newTop, top.sum + newTop));
            }else if(op.equals("C")) {
                stack.pop();
            }else if(op.equals("D")) {
                int newTop = stack.peek().num * 2;
                stack.push(new Pair(newTop, stack.peek().sum + newTop));
            }else {
                int num = Integer.valueOf(op);
                if(stack.isEmpty()) {
                    stack.push(new Pair(num, num));
                }else {
                    stack.push(new Pair(num, stack.peek().sum + num));
                }

            }
        }
        return stack.peek().sum;
    }



    public static void main(String[] args) {
        String[] options = {"5","-2","4","C","D","9","+","+"};
        System.out.println(calPoints1(options));
    }
}
