package TreeQuestions;

import java.util.ArrayList;
import java.util.List;

class Inorder {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root == null) return list;
        if(root.left == null && root.right == null) {
            list.add(root.val);
            return list;
        }
        TreeNode left = root.left;
        TreeNode right = root.right;
        if(left != null) {
            list.addAll(inorderTraversal(left));
        }
        list.add(root.val);
        if(right != null) {
            list.addAll(inorderTraversal(right));
        }
        return list;
    }
}