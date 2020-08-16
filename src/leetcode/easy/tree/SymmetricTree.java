package leetcode.easy.tree;

/**
 * 对称二叉树
 */

public class SymmetricTree {
    public static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
    public static boolean isSymmetric(TreeNode root) {
        if(root == null) {
            return true;
        }
        String left = processLeft(root.left);
        String right = processRight(root.right);
        return left.equals(right);
    }

    private static String processRight(TreeNode node) {
        if (node == null) {
            return "!-";
        }
        return node.val + "-" + processRight(node.right) + processRight(node.left);
    }

    public static String processLeft(TreeNode node) {
        if (node == null) {
            return "!-";
        }
        return node.val + "-" + processLeft(node.left) + processLeft(node.right);
    }
    public static boolean check(TreeNode p, TreeNode q) {
        if(p == null && q == null) {
            return true;
        }
        if(p == null || q == null) {
            return false;
        }
        return p.val == q.val && check(p.left, q.right) && check(p.right, q.left);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.left.right.left = new TreeNode(8);
        root.left.right.right = new TreeNode(9);

        root.right = new TreeNode(3);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(4);
        root.right.left.left = new TreeNode(9);
        root.right.left.right = new TreeNode(8);
        System.out.println(isSymmetric(root));
        System.out.println(check(root, root));
    }
}
