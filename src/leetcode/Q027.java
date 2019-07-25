package leetcode;

import java.util.Arrays;

class Solution27 {
    public int removeElement(int[] nums, int val) {
    	int i=-1;
    	for (int j=0;j<nums.length;j++) {
    		if (nums[j]!=val) {
    			nums[++i] = nums[j];
    		}
    	}
    	return i+1;
    }
}

public class Q027 {
	public static void main(String[] args) {
		Solution27 s = new Solution27();
		int[] a = {1,3,4,5,2,6,7,2};
		int n = s.removeElement(a, 2);
		System.out.println(Arrays.toString(a));
		System.out.println(n);
	}
}
