package leetcode.easy.tree;

/**
 * 平衡二叉树
 */
public class BalancedBinaryTree {
    public static boolean isBalanced(TreeNode root) {
        if(root == null) {
            return true;
        }
        int leftHeight = process(root.left);
        if(leftHeight == -1) {
            return false;
        }
        int rightHeight = process(root.right);
        if(rightHeight == -1) {
            return false;
        }
        return Math.abs(leftHeight - rightHeight) <= 1;
    }

    private static int process(TreeNode node) {
        if(node == null) {
            return 0;
        }
        int leftH = process(node.left);

        if(leftH == -1) {
            return -1;
        }
        int rightH = process(node.right);
        if(rightH == -1) {
            return -1;
        }
        if(Math.abs(leftH - rightH) > 1) {
            return -1;
        }
        return Math.max(leftH, rightH) + 1;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        root.right.right = new TreeNode(3);
        root.right.left.right = new TreeNode(4);
        System.out.println(isBalanced(root));
    }
}
