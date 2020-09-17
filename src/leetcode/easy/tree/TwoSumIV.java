package leetcode.easy.tree;

import java.util.HashSet;
import java.util.Set;

/**
 * 两数之和 IV - 输入 BST
 */
public class TwoSumIV {
    public static boolean findTarget(TreeNode root, int k) {
        Set<Integer> set = new HashSet<>();
        return findResult(root, k, set);
    }

    private static boolean findResult(TreeNode root, int k, Set<Integer> set) {
        if(root == null) {
            return false;
        }
        if(set.contains(k - root.val)) {
            return true;
        }
        set.add(root.val);
        return findResult(root.left, k, set) || findResult(root.right, k, set);
    }

    public static void main(String[] args) {

    }
}
