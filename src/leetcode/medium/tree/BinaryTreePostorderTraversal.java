package leetcode.medium.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * 二叉树的后序遍历
 */
public class BinaryTreePostorderTraversal {
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        TreeNode cur = root;
        TreeNode mostRight = null;
        while (cur != null) {
            mostRight = cur.left;
            if(mostRight != null) {
                while (mostRight.right != null && mostRight.right != cur) {
                    mostRight = mostRight.right;
                }
                if(mostRight.right == null) {
                    mostRight.right = cur;
                    cur = cur.left;
                    continue;
                }else {
                    mostRight.right = null;
                    printEdge(cur.left, list);
                }
            }
            cur = cur.right;
        }
        printEdge(root, list);
        return list;
    }

    private void printEdge(TreeNode cur, List<Integer> list) {
        TreeNode tail = reverseEdge(cur);
        TreeNode node = tail;
        while (node != null) {
            list.add(node.val);
            node = node.right;
        }
        reverseEdge(tail);
    }

    private TreeNode reverseEdge(TreeNode cur) {
        TreeNode pre = null;
        TreeNode next = null;
        while (cur != null) {
            next = cur.right;
            cur.right = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }
}
