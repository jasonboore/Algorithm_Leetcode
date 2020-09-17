package leetcode.easy.tree;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * 二叉搜索树中的众数
 */
public class FindModInBinarySearchTree {
    static HashMap<Integer, Integer> map = new HashMap<>();
    public static int[] findMode(TreeNode root) {
        process(root);
        Stack<Integer> stack = new Stack<>();
        for (Map.Entry<Integer, Integer> entry: map.entrySet()) {
            if(stack.isEmpty()) {
                stack.push(entry.getKey());
            }else {
                if(entry.getValue() > map.get(stack.peek())) {
                    while (!stack.isEmpty()) {
                        stack.pop();
                    }
                    stack.push(entry.getKey());
                }else if(entry.getValue() == map.get(stack.peek())){
                    stack.push(entry.getKey());
                }
            }
        }
        int[] res = new int[stack.size()];
        int i = 0;
        while (stack.size() > 0) {
            res[i++] = stack.pop();
        }
        return res;
    }
    public static void process(TreeNode root) {
        if(root == null) {
            return;
        }
        if(!map.containsKey(root.val)) {
            map.put(root.val, 1);
        } else{
            map.put(root.val, map.get(root.val) + 1);
        }
        process(root.left);
        process(root.right);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(2147483647);
        root.right = new TreeNode(2);
        root.right.right = new TreeNode(2);
        for (int i : findMode(root)) {
            System.out.println(i);
        }
    }
}
