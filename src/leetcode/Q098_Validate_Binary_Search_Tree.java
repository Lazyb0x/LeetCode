package leetcode;

import java.util.Stack;


class Solution98 {
    public boolean isValidBST(TreeNode root) {
        if (root==null) return true;
        return isValid(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
    
    public boolean isValid(TreeNode node, int min, int max) {
        if (min>node.val || node.val>max) {
            return false;
        }
        
        boolean isValid = true;
        if (node.left!=null) {
            isValid &= isValid(node.left, min, Math.min(max,node.val));
        }
        if (node.right!=null) {
            isValid &= isValid(node.right, Math.max(min, node.val), max);
        }
        return isValid;
    }
}

public class Q098_Validate_Binary_Search_Tree {
    public static void main(String[] args) {
        Integer[] nums = {5,1,4,null,null,3,6};
        Integer[] nums2 = {2,1,null,null,3};
        Integer[] nums3 = {10,5,null,null,15,6,null,null,20};
        TreeNode node = TreeNode.fromPreorder(nums2);
        System.out.println(TreeNode.inorderTraversal(node));
        Solution98 s = new Solution98();
        boolean isValid = s.isValidBST(node);
        
        System.out.println(isValid);
    }
}
