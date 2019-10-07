package leetcode;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

class Solution47 {
	List<List<Integer>> list = new LinkedList<List<Integer>>();
	List<Integer> tmp = new LinkedList<Integer>();
    public List<List<Integer>> permuteUnique(int[] nums) {
        permute(nums, 0);
        return list;
    }
    public void permute(int[] nums, int pos) {
    	if (pos>=nums.length) {
    		list.add(new LinkedList<Integer>(tmp));
    		return;
    	}
    	Set<Integer> set = new HashSet<Integer>();
    	for (int i=pos; i<nums.length; i++) {
    		
    		if (!set.contains(nums[i])) {
    			set.add(nums[i]);
    			tmp.add(nums[i]);
    			permute(nums, pos+1);
    			tmp.remove(tmp.size()-1);
    		}
    	}
    }
}

public class Q047 {
	public static void main(String[] args) {
		Solution47 s =new Solution47();
		int[] nums = {1,1,3};
		List<List<Integer>> list = s.permuteUnique(nums);
		System.out.println(list);
	}
}
