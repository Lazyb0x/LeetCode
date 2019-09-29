package leetcode;

import java.util.HashMap;
import java.util.HashSet;

class Solution41O {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        for (int num : nums) set.add(num);
        int val=1;
        while(set.contains(val)) val++;
        return val;
    }
}

public class Q041_old {
	public static void main(String[] args) {
		int[] nums = {1,2,0};
		int val = new Solution41O().firstMissingPositive(nums);
		System.out.println(val);
	}
}
