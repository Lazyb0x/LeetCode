package leetcode;

class Solution55 {
    public boolean canJump(int[] nums) {
        int pos = nums.length-1;
        for (int i=pos-1; i>=0; i--) {
        	if (nums[i]+i>=pos) {
        		pos = i;
        	}
        }
        return pos==0;
    }
}

public class Q055_Jump_Game {
	public static void main(String[] args) {
		int[] a1 = {2,3,1,1,4};
		int[] a2 = {3,2,1,0,4};
		int[] a3 = {0};
		int[] a4 = {2,0,0};
		int[] a5 = {2,0};
		Solution55 s = new Solution55();
		System.out.println(s.canJump(a1));
		System.out.println(s.canJump(a2));
		System.out.println(s.canJump(a3));
		System.out.println(s.canJump(a4));
	}
}
