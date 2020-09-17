package leetcode.easy.tree;

/**
 *  二叉搜索树的最小绝对差
 */
public class MinimumAbsoluteDifferenceInBST {
     static TreeNode pre = null;
     static int min = Integer.MAX_VALUE;
    public int getMinimumDifference(TreeNode root) {
        inOrder(root);
        return min;
    }
    public static void inOrder(TreeNode root) {
        if(root == null) {
            return;
        }
        inOrder(root.left);
        if(pre != null) {
            min = Math.min(root.val - pre.val, min);
        }
        pre = root;
        inOrder(root.right);
    }
}
