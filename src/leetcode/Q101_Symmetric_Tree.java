package leetcode;

class Solution101 {
    public boolean isSymmetric(TreeNode root) {
        if (root==null) return true;
        return isSameTree(root.left, root.right);
    }
    
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p==q) return true;
        if (p==null || q==null) {
            System.out.println(p.val + " " + q);
            return false;
        }
        if (p.val!=q.val) {
            System.out.println(p + " " + q);
            return false;
        }
        return isSameTree(p.left, q.right) && isSameTree(p.right, q.left);
    }
}

public class Q101_Symmetric_Tree {
    public static void main(String[] args) {
        Solution101 s = new Solution101();
        Integer[] nums1 = {1,2,2,3,4,4,3,null,null,null,null};
        TreeNode t1 = TreeNode.fromLevelOrder(nums1);
        
        t1.print();
//        t2.print();
        //System.out.println(s.isSymmetric(t1));
    }
}
