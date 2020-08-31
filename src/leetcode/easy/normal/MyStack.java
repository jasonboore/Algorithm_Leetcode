package leetcode.easy.normal;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 用队列实现栈
 */
public class MyStack {
    Queue<Integer> queue, help;
    /** Initialize your data structure here. */
    public MyStack() {
        queue = new LinkedList<>();
        help = new LinkedList<>();
    }

    /** Push element x onto stack. */
    public void push(int x) {
        queue.offer(x);
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        while (queue.size() != 1) {
            help.offer(queue.poll());
        }
        int peek = queue.poll();
        swap();
        return peek;
    }

    /** Get the top element. */
    public int top() {
        while (queue.size() != 1) {
            help.offer(queue.poll());
        }
        int peek = queue.poll();
        help.add(peek);
        swap();
        return peek;
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return queue.isEmpty();
    }

    public  void swap() {
        Queue<Integer> temp = this.queue;
        this.queue = this.help;
        this.help = temp;
    }

    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push(1);
        myStack.push(2);


        System.out.println(myStack.pop());
        System.out.println(myStack.top());
    }
}
