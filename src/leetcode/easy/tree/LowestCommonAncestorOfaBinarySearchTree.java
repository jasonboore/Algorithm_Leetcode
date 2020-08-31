package leetcode.easy.tree;

/**
 * 二叉搜索树的最近公共祖先
 */
public class LowestCommonAncestorOfaBinarySearchTree {
    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if((p.val >= root.val && q.val <= root.val) || (q.val >= root.val && p.val <= root.val)) {
            return root;
        }
        if(p.val > root.val && q.val > root.val) {
            return lowestCommonAncestor(root.right, p, q);
        }
        return lowestCommonAncestor(root.left, p, q);
    }
}
