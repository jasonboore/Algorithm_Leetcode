package leetcode.easy.tree;

/**
 * 路径总和
 */
public class PathSum {
    public static boolean hasPathSum(TreeNode root, int sum) {
        if(root == null) {
            return false;
        }
        if(root.left == null && root.right == null) {
            return root.val == sum;
        }
        boolean ans = false;
        if(root.left != null) {
            ans = hasPathSum(root.left, sum - root.val) || ans;
        }
        if(root.right != null) {
            ans = hasPathSum(root.right, sum - root.val) || ans;
        }
        return ans;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(11);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);
        root.right.right.right = new TreeNode(1);
        System.out.println(hasPathSum(root, 22));
    }
}
