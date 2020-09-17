package leetcode.easy.tree;

/**
 * 二叉树中第二小的节点
 */
public class SecondMinimumNodeInaBinaryTree {
    public static int findSecondMinimumValue(TreeNode root) {
        if(root == null || (root.left == null && root.right == null)) {
            return -1;
        }
        return process(root, root.val);
    }
    public static int process(TreeNode root, int min1) {
        if(root == null) {
            return -1;
        }
        if(root.val > min1) {
            return root.val;
        }
        int left = process(root.left, min1);
        int right  = process(root.right, min1);
        if(left == -1 && right == -1) {
            return -1;
        }
        if(left == -1) {
            return right;
        }
        if(right == -1) {
            return left;
        }
        return Math.min(left, right);
    }
}
