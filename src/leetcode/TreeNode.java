package leetcode;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class TreeNode {
    public int val;
    public TreeNode left, right;

    public TreeNode(int val) {
        this.val = val;
        this.left = this.right = null;
    }
    
    /**
     * 由前序遍历序列生成树
     * @param nums 树的前序遍历，包括 null 节点
     * @return 二叉树的根节点
     */
    public static TreeNode fromPreorder(Integer[] nums) {
        Deque<TreeNode> stack = new LinkedList<TreeNode>();
        TreeNode head = new TreeNode(nums[0]);
        TreeNode curr = head.left;
        stack.push(head);
        
        boolean isLeft = true;
        for (int i=1; i<nums.length; i++) {
            if (nums[i]!=null) {
                curr = new TreeNode(nums[i]);
                if (isLeft)
                    stack.peek().left = curr;
                else
                    stack.pop().right = curr;
                stack.push(curr);
                isLeft = true;
            }
            else {
                if (isLeft)
                    isLeft = false;
                else
                    curr = stack.pop();
            }
        }
        return head;
    }
    
    /**
     * 返回中序遍历列表
     * @param root 二叉树的根节点
     * @return List&lt;Integer&gt;
     */
    public static List<Integer> inorderTraversal(TreeNode root){
        TreeNode curr = root;
        List<Integer> list = new LinkedList<Integer>();
        Deque<TreeNode> stack = new LinkedList<TreeNode>();
        while(curr!=null || !stack.isEmpty()) {
            if (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }
            else {
                curr = stack.pop();
                list.add(curr.val);
                curr = curr.right;
            }
        }
        return list;
    }
    
    /**
     * 返回前序遍历列表
     * @param root 二叉树的根节点
     * @return List&lt;Integer&gt;
     */
    public static List<Integer> preorderTraversal(TreeNode root){
        TreeNode curr = root;
        List<Integer> list = new LinkedList<Integer>();
        Deque<TreeNode> stack = new LinkedList<TreeNode>();
        while(curr!=null || !stack.isEmpty()) {
            if (curr != null) {
                list.add(curr.val);
                stack.push(curr);
                curr = curr.left;
            }
            else {
                curr = stack.pop();
                curr = curr.right;
            }
        }
        return list;
    }
    
    public static void main(String[] args) {
        Integer[] a = {1,2,4,null,null,5,null,null,3,null,6};
        TreeNode node = TreeNode.fromPreorder(a);
        System.out.println(TreeNode.preorderTraversal(node));
    }
}