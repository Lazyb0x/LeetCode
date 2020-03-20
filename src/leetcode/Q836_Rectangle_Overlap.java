package leetcode;

class Solution836 {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        int l,r,u,d;
        l = Math.max(rec1[0], rec2[0]);
        d = Math.max(rec1[1], rec2[1]);
        r = Math.min(rec1[2], rec2[2]);
        u = Math.min(rec1[3], rec2[3]);
        return l<r && d<u;
    }
}

public class Q836_Rectangle_Overlap {
    public static void main(String[] args) {
        Solution836 s = new Solution836();
        System.out.println(s.isRectangleOverlap(new int[]{0,0,2,2}, new int[] {1,1,3,3}));
        System.out.println(s.isRectangleOverlap(new int[]{0,0,1,1}, new int[] {1,0,2,1}));
    }
}
