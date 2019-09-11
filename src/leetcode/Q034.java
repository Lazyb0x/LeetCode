package leetcode;

import java.util.Arrays;

class Solution34 {
    public int[] searchRange(int[] nums, int target) {
        return search(nums, 0, nums.length-1, target);
    }
    
    public int[] search(int[] nums, int left, int right, int target) {
    	int mid = (left+right)/2;
    	if (right-left<=0) {
    		if (nums.length>0 && nums[left]==target)
    			return new int[] {left, left};
    		else
    			return new int[] {-1, -1};
    	}
    	int[] leftNums = search(nums, left, mid, target);
    	int[] rightNums = search(nums, mid+1, right, target);
    	
    	//合并
    	int rLeft = mymin(leftNums[0], rightNums[0]);
    	int rRight = Math.max(leftNums[1], rightNums[1]);
    	return new int[] {rLeft, rRight};
    }
    
    public int mymin(int x, int y) {
    	if (x==-1 || y==-1)
    		return Math.max(x, y);
    	else
    		return Math.min(x, y);
    }
}

public class Q034 {
	public static void main(String[] args) {
		Solution34 s = new Solution34();
//		int[] a = {5,7,7,8,8,10};
		int[] a = {1};
		int[] b = s.searchRange(a, 1);
		System.out.println(Arrays.toString(b));
	}
}
