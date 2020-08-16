package leetcode.easy.tree;

/**
 * 二叉树的最大深度
 */
public class MaximumDepthofBinaryTree {
    public static class TreeNode{
        public int value;
        public TreeNode left;
        public TreeNode right;
        public TreeNode(int value){
            this.value = value;
        }
    }
    public static int maxDepth(TreeNode root){
        if(root == null) {
            return 0;
        }
        if(root.left == null && root.right == null) {
            return 1;
        }
        int level = 0;
        int leftLevel = 0;
        int rightLevel = 0;
        if(root.left != null) {
            leftLevel = maxDepth(root.left);
        }
        if(root.right != null) {
            rightLevel = maxDepth(root.right);
        }
        level = Integer.max(leftLevel, rightLevel) + 1;
        return level;
    }
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(3);
        treeNode.left = new TreeNode(9);
        treeNode.right = new TreeNode(20);
        treeNode.right.left = new TreeNode(15);
        treeNode.right.right = new TreeNode(20);
        System.out.println(maxDepth(treeNode));
    }
}
