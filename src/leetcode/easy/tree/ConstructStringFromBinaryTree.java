package leetcode.easy.tree;

/**
 * 根据二叉树创建字符串
 */
public class ConstructStringFromBinaryTree {
    public static String tree2str(TreeNode t) {
        if(t == null) {
            return "";
        }
        if(t.left == null && t.right == null) {
            return t.val + "";
        }
        if(t.right == null) {
            return t.val + "(" + tree2str(t.left) + ")";
        }
        return t.val + "(" + tree2str(t.left) + ")" + "(" + tree2str(t.right) + ")";
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        System.out.println(tree2str(root));
    }
}
