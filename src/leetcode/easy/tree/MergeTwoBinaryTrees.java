package leetcode.easy.tree;

/**
 * 合并二叉树
 */
public class MergeTwoBinaryTrees {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if(t1 == null && t2 == null) {
            return null;
        }
        TreeNode cur = null;
        if(t1 == null) {
            cur = new TreeNode(t2.val);
        }else if(t2 == null) {
            cur = new TreeNode(t1.val);
        }else {
            cur = new TreeNode(t1.val + t2.val);
        }

        cur.left = mergeTrees(t1 == null ? null : t1.left, t2 == null ? null : t2.left);
        cur.right = mergeTrees(t1 == null ? null : t1.right, t2 == null ? null : t2.right);
        return cur;
    }

    public static void main(String[] args) {

    }
}
