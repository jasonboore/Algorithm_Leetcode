package leetcode.easy.tree;

/**
 * 二叉树的坡度
 */
public class BinaryTreeTilt {
    public static class ReturnData{
        int sum;
        int diff;
        public ReturnData(int sum, int diff) {
            this.sum = sum;
            this.diff = diff;
        }
    }
    public int findTilt(TreeNode root) {
        if(root == null) {
            return 0;
        }
        return process(root).diff;
    }
    public ReturnData process(TreeNode root) {
        if(root == null) {
            return new ReturnData(0, 0);
        }
        ReturnData leftData = process(root.left);
        ReturnData rightData = process(root.right);
        int sum = leftData.sum + rightData.sum + root.val;
        int diff = leftData.diff + rightData.diff + Math.abs(leftData.sum - rightData.sum);
        return new ReturnData(sum, diff);
    }
}
