package leetcode.easy;

public class SameTree {
    public static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
          this.left = left;
         this.right = right;
      }
   }
    public static boolean isSameTree(TreeNode p, TreeNode q) {
       return process(p).equals(process(q));
    }
    public static String process(TreeNode node) {
        if(node == null) {
            return "!-";
        }
        return node.val + "-" + process(node.left) + process(node.right);
    }

    public static void main(String[] args) {
        TreeNode p = new TreeNode(1);
        p.left = new TreeNode(2);


        TreeNode q = new TreeNode(1);

        q.right = new TreeNode(2);
        System.out.println(isSameTree(p, q));
    }
}
