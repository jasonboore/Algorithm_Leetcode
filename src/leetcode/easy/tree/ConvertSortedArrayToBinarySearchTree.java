package leetcode.easy.tree;

/**
 * 将有序数组转换为二叉搜索树
 */
public class ConvertSortedArrayToBinarySearchTree {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public static TreeNode sortedArrayToBST(int[] nums) {
        return process(nums, 0, nums.length - 1);
    }

    private static TreeNode process(int[] nums, int L, int R) {
        if(L > R) {
            return null;
        }
        int mid = (L + R) / 2;
        TreeNode treeNode = new TreeNode(nums[mid]);
        treeNode.left = process(nums, L, mid - 1);
        treeNode.right = process(nums, mid + 1, R);
        return treeNode;
    }

    public static void main(String[] args) {
        int[] nums  = {-10,-3,0,5,9};
        TreeNode root = sortedArrayToBST(nums);
    }
}
