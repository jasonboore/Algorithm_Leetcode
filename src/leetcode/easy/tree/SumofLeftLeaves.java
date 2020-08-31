package leetcode.easy.tree;

/**
 * 左叶子之和
 */
public class SumofLeftLeaves {
    public static int sumOfLeftLeaves(TreeNode root) {
        return process(root, false);
    }
    public static int process(TreeNode root, boolean flag) {
        if(root == null) {
            return 0;
        }
        if(flag && root.left == null && root.right == null) {
            return root.val;
        }
        return process(root.left, true) + process(root.right, false);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        System.out.println(sumOfLeftLeaves(root));
    }
}
