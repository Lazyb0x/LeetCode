package leetcode;

class Solution100 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p==q) return true;
        if (p==null || q==null) {
            return false;
        }
        if (p.val!=q.val) {
            return false;
        }
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}

public class Q100_Same_Tree {
    public static void main(String[] args) {
        Solution100 s = new Solution100();
        Integer[] nums1 = {0};
        Integer[] nums2 = {};
        TreeNode t1 = TreeNode.fromLevelOrder(nums1);
        TreeNode t2 = TreeNode.fromLevelOrder(nums2);
        
//        t1.print();
//        t2.print();
        System.out.println(s.isSameTree(t1, t2));
    }
}
