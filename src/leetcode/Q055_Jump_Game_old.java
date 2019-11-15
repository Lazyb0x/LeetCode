package leetcode;

// 从第一个数字开始，找能达到的数字，递归调用，看能不能达到最后
// 带剪枝

class Solution55o {
    public boolean canJump(int[] nums) {
    	boolean[] success = new boolean[nums.length];
    	for (int i=0; i<success.length; i++) {
    		success[i] = true;
    	}
        return canJump(nums, 0, success);
    }
    
    public boolean canJump(int[] nums, int pos, boolean[] success) {
    	if (pos==nums.length-1) return true;
//    	if (pos>nums.length) return false;
//    	if (!success[pos]) return false;
    	boolean flag = false;
    	int maxpos = pos+nums[pos]>=nums.length? nums.length-1: pos+nums[pos];
    	for (int i=maxpos; i>pos; i--) {
    		if (i==nums.length-1) {
    			flag = true;
    			break;
    		}
    		if (!success[i]) {
    			break;
    		}
    		if (canJump(nums, i, success)) {
    			flag = true;
    			break;
    		}
    	}
    	if (!flag) success[pos] = false;
    	return flag;
    }
}

public class Q055_Jump_Game_old {
	public static void main(String[] args) {
		int[] a1 = {2,3,1,1,4};
		int[] a2 = {3,2,1,0,4};
		int[] a3 = {0};
		int[] a4 = {2,0,0};
		int[] a5 = {2,0};
		Solution55o s = new Solution55o();
		System.out.println(s.canJump(a1));
		System.out.println(s.canJump(a2));
		System.out.println(s.canJump(a3));
		System.out.println(s.canJump(a4));
	}
}
