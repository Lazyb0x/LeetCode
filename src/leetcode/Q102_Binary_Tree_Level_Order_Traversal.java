package leetcode;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * 由于是需要分层 的层序遍历，设置了一个变量 num 来储存每一层的数量
 * @author Lazyb0x
 *
 */
class Solution102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> row = new LinkedList<>();
        List<Integer> col;
        Deque<TreeNode> queue = new LinkedList<TreeNode>();
        
        if (root==null) return row;
        queue.offer(root);
        int num = queue.size();
        while(num!=0) {
            col = new LinkedList<Integer>();
            for (int i=0; i<num; i++) {
                TreeNode n = queue.poll();
                col.add(n.val);
                
                if(n.left!=null) {
                    queue.offer(n.left);
                }
                if (n.right!=null) {
                    queue.offer(n.right);
                }
            }
            num = queue.size();
            row.add(col);
        }
        return row;
    }
}

public class Q102_Binary_Tree_Level_Order_Traversal {
    public static void main(String[] args) {
        Solution102 s = new Solution102();
        Integer[] nums = {3,9,null,null,20,15,null,null,7};
        
        TreeNode root = TreeNode.fromPreorder(nums);
//        System.out.println(TreeNode.preorderTraversal(root));
        
        var list = s.levelOrder(root);
        for (var l : list) {
            System.out.println(l);
        }
    }
}
