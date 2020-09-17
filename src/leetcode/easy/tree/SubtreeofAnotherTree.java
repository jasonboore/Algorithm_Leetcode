package leetcode.easy.tree;

/**
 * 另一个树的子树
 */
public class SubtreeofAnotherTree {
    public boolean isSubtree(TreeNode s, TreeNode t) {
        String s1 = treeToStr(s);
        String s2 = treeToStr(t);
        return s1.contains(s2);
    }
    public String treeToStr(TreeNode root) {
        if(root == null) {
            return "#!";
        }
        return "#" + root.val + treeToStr(root.left) + treeToStr(root.right);
    }
    public static boolean isSubtree1(TreeNode s, TreeNode t) {
        if(t == null) {
            return true;
        }
        if(s == null) {
            return false;
        }
        if(isSameTree(s, t)) {
            return true;
        }
        return isSubtree1(s.left, t) || isSubtree1(s.right, t);
    }
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null) {
            return true;
        }
        if(p == null || q == null) {
            return false;
        }
        if(p.val != q.val) {
            return false;
        }
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

    public static void main(String[] args) {
        TreeNode s = new TreeNode(1);
        s.right = new TreeNode(1);
        s.right.right = new TreeNode(1);
        s.right.right.right = new TreeNode(1);
        s.right.right.right.right = new TreeNode(1);
        s.right.right.right.right.right = new TreeNode(1);
        s.right.right.right.right.right.left = new TreeNode(1);
        s.right.right.right.right.right.right = new TreeNode(1);

        TreeNode t = new TreeNode(1);
        t.right = new TreeNode(1);
        t.right.right = new TreeNode(1);
        t.right.right.right = new TreeNode(1);
        t.right.right.right.left = new TreeNode(1);
        t.right.right.right.right = new TreeNode(1);

        System.out.println(isSubtree1(s, t));
    }
}
