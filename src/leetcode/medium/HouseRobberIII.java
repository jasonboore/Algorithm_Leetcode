package leetcode.medium;

public class HouseRobberIII {
    public static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
    public static int rob(TreeNode root) {
        int[] robStatus = process(root);
        return Math.max(robStatus[0], robStatus[1]);
    }

    private static int[] process(TreeNode root) {
        if(root == null) {
            return new int[]{0, 0};
        }
        int[] lRob = process(root.left);
        int[] rRob = process(root.right);
        int selected = root.val + lRob[0] + rRob[0];
        int noSelected = Math.max(lRob[0], lRob[1]) + Math.max(rRob[0], rRob[1]);
        return new int[]{noSelected, selected};
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(3);
        root.right.right = new TreeNode(1);
        System.out.println(rob(root));
    }
}
