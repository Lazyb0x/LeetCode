package leetcode;

// 从第一个数字开始，找能达到的数字，递归调用，看能不能达到最后
// 有很多重复计算的部分，还需要优化。时间超限。

class Solution55r {
    public boolean canJump(int[] nums) {
        return canJump(nums, 0);
    }
    
    public boolean canJump(int[] nums, int pos) {
    	if (pos==nums.length-1) return true;
    	if (pos>nums.length) return false;
    	boolean flag = false;
    	for (int i=1; i<=nums[pos]; i++) {
    		if (canJump(nums, pos+i)) {
    			flag = true;
    			break;
    		}
    	}
    	return flag;
    }
}

public class Q055_Jump_Game_failed {
	public static void main(String[] args) {
		int[] a1 = {2,3,1,1,4};
		int[] a2 = {3,2,1,0,4};
		int[] a3 = {0};
		int[] a4 = {2,0,0};
		Solution55r s = new Solution55r();
		System.out.println(s.canJump(a1));
		System.out.println(s.canJump(a2));
		System.out.println(s.canJump(a3));
		System.out.println(s.canJump(a4));
	}
}
