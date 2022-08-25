public class PathSum {
    /**
     * Given the root of a binary tree and an integer targetSum, return true if the
     * tree has a root-to-leaf path such that adding up all the values along the
     * path equals targetSum.
     */

    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     * int val;
     * TreeNode left;
     * TreeNode right;
     * TreeNode() {}
     * TreeNode(int val) { this.val = val; }
     * TreeNode(int val, TreeNode left, TreeNode right) {
     * this.val = val;
     * this.left = left;
     * this.right = right;
     * }
     * }
     */
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null)
            return false;
        if (null == root.left && null == root.right)
            return targetSum - root.val == 0 ? true : false;
        return hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right, targetSum - root.val);
    }
}
