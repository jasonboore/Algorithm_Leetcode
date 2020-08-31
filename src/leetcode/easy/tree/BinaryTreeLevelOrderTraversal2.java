package leetcode.easy.tree;
/**
 *
 * 二叉树的层次遍历 II
 */

import java.util.*;

public class BinaryTreeLevelOrderTraversal2 {
    public static List<List<Integer>> levelOrderBottom(TreeNode root) {
        if(root == null) {
            return new ArrayList<>();
        }
        List<List<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> list = new ArrayList<>();
            while (size > 0) {
                TreeNode treeNode = queue.poll();
                list.add(treeNode.val);
                if(treeNode.left != null) {
                    queue.offer(treeNode.left);
                }
                if(treeNode.right != null) {
                    queue.offer(treeNode.right);
                }
                size--;
            }
            ans.add(0, list);
        }
        return ans;
    }

    public static void main(String[] args) {

    }
}
