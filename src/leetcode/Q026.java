package leetcode;

import java.util.Arrays;

class Solution26 {
    public int removeDuplicates(int[] nums) {
        if (nums.length<2) return nums.length;
    	int i=0;
    	for (int j=1;j<nums.length;j++) {
    		if (nums[j] != nums[j-1]) {
    			nums[++i] = nums[j];
    		}
    	}
    	return i+1;
    }
}

public class Q026 {
	public static void main(String[] args) {
		int[] a = {0,0,1,1,1,2,2,3,3,4};
		Solution26 s = new Solution26();
		int n =  s.removeDuplicates(a);
		System.out.println(Arrays.toString(a));
		System.out.println(n);
	}
}
