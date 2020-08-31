package leetcode.easy.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * 二叉树的所有路径
 */
public class BinaryTreePaths {
    public static List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new ArrayList<>();
        process(root, "", paths);
        return paths;

    }
    public static void process(TreeNode root, String path, List<String> paths) {
        if(root != null) {
            path += String.valueOf(root.val);
            if(root.left == null && root.right == null) {
                paths.add(path);
            }else {
                path += "->";
                process(root.left, path, paths);
                process(root.right, path, paths);
            }
        }
    }
}
