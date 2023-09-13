package TreeQuestions;

/*
 * https://leetcode.com/problems/invert-binary-tree/description/
 * Swap left and right, then recurse
 */

public class InvertBinaryTree {
    /**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
    public TreeNode invertTree(TreeNode root) {
      if(root != null) {
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        invertTree(root.left);
        invertTree(root.right);
      }
      return root;
    }
}
