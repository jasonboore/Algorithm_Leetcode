package leetcode.medium.tree;

import java.util.ArrayList;
import java.util.List;

/**
 *  二叉树的前序遍历
 */
public class BinaryTreePreorderTraversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        TreeNode cur = root;
        TreeNode mostRight = null;
        while (cur != null) {
            mostRight = cur.left;
            if(mostRight != null) {
                while (mostRight.right != null && mostRight.right != cur) {
                    mostRight = mostRight.right;
                }
                if(mostRight.right == null) {
                    mostRight.right = cur;
                    list.add(cur.val);
                    cur = cur.left;
                    continue;
                }else {
                    mostRight.right = null;
                }
            }else {
                list.add(cur.val);
            }
            cur = cur.right;
        }
        return list;
    }
}
