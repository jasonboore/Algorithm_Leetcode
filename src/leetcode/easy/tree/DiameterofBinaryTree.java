package leetcode.easy.tree;

/**
 * 二叉树的直径
 */
public class DiameterofBinaryTree {
    public static class ReturnData{
        int maxDepth;
        int maxLength;
        public ReturnData(int maxDepth, int maxLength) {
            this.maxLength = maxLength;
            this.maxDepth = maxDepth;
        }
    }
    public static int diameterOfBinaryTree(TreeNode root) {
        if(root == null) {
            return 0;
        }
        return process(root).maxDepth - 1;
    }
    public static ReturnData process(TreeNode root) {
        if(root == null) {
            return new ReturnData(0, 0);
        }
        ReturnData leftData = process(root.left);
        ReturnData rightData = process(root.right);
        int curLength = Math.max(leftData.maxLength, rightData.maxLength) + 1;
        int curDepth = Math.max(leftData.maxLength + rightData.maxLength + 1, Math.max(leftData.maxDepth, rightData.maxDepth));
        return new ReturnData(curDepth, curLength);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(1);
        System.out.println(diameterOfBinaryTree(root));
    }
}

