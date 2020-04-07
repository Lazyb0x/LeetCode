package leetcode;

class Solution104 {
    public int maxDepth(TreeNode root) {
        return calcDepth(root, 1);
    }
    
    private int calcDepth(TreeNode node, int depth) {
        if (node==null) return depth;
        return Math.max(calcDepth(node.left, depth+1), calcDepth(node.right, depth+1));
    }
}

public class Q104_Maximum_Depth_of_Binary_Tree{
    public static void main(String[] args) {
        
    }
}