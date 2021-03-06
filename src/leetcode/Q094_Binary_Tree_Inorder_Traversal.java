package leetcode;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

class Solution94 {
    List<Integer> list;
    public List<Integer> inorderTraversal(TreeNode root) {
        list = new LinkedList<Integer>();
        if (null==root) return list;
        stack(root);
        return list;
    }
    
    /**
     * 递归
     * @param root
     */
    public void traversal(TreeNode root) {
        if (root.left!=null) {
            traversal(root.left);
        }
        list.add(root.val);
        if (root.right!=null) {
            traversal(root.right);
        }
    }
    
    public void stack(TreeNode root) {
        TreeNode curr = root;
        Deque<TreeNode> stack = new LinkedList<TreeNode>();
        while(curr!=null || !stack.isEmpty()) {
            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }
            curr = stack.pop();
            list.add(curr.val);
            curr = curr.right;
        }
    }
}

public class Q094_Binary_Tree_Inorder_Traversal {
    public static void main(String[] args) {
        Solution94 s = new Solution94();
        
        Integer[] a = {1,2,4,null,null,5,null,null,3,null,6};
        Integer[] b = {1,null,null};
        TreeNode root = TreeNode.fromPreorder(a);
        List<Integer> list = s.inorderTraversal(root);
        List<Integer> list2 = TreeNode.preorderTraversal(root);
        System.out.println(list);
    }
}
