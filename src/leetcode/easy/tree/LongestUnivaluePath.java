package leetcode.easy.tree;

/**
 * 最长同值路径
 */
public class LongestUnivaluePath {
    static int ans;
    public static int longestUnivaluePath(TreeNode root) {
        ans = 0;
        process(root);
        return ans;
    }
    public static int process(TreeNode root) {
        if(root == null) {
            return 0;
        }
        int maxLeft = process(root.left);
        int maxRight = process(root.right);
        int arrowLeft = 0, arrowRight = 0;
        if(root.left != null && root.val == root.left.val) {
            arrowLeft = maxLeft + 1;
        }
        if(root.right != null && root.val == root.right.val) {
            arrowRight = maxRight + 1;
        }
        ans = Math.max(arrowLeft + arrowRight, ans);
        return Math.max(arrowLeft, arrowRight);
    }
}
