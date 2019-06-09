package leetcode;

class Solution10 {
    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length-1;
        int max = 0;
        
        while(l<r) {
        	max = Math.max(max, Math.min(height[l], height[r])*(r-l));
        	if (height[l]<height[r]) l++;
        	else r--;
        }
        
        return max;
    }
}

public class Q011 {
	public static void main(String[] args) {
		Solution10 s = new Solution10();
		int[] a = {1,8,6,2,5,4,8,3,7};
		int m = s.maxArea(a);
		System.out.println(m);
	}
}
