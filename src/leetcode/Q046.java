// 46. 全排列
// 递归 + 回溯法 用第一位和每一位交换来保证唯一性

package leetcode;

import java.util.LinkedList;
import java.util.List;

class Solution46 {
	List<List<Integer>> list = new LinkedList<List<Integer>>();
	List<Integer> tmp = new LinkedList<Integer>();
    public List<List<Integer>> permute(int[] nums) {
    	permute(nums, 0);
    	return list;
    }
    public void permute(int[] nums, int pos) {
    	if (pos>=nums.length) {
    		for (Integer x : nums)
    			tmp.add(x);
    		list.add(new LinkedList<Integer>(tmp));
    		tmp.clear();
    		return;
    	}
    	for (int i=pos; i<nums.length; i++) {
    		swap(nums, pos, i);
    		permute(nums, pos+1);
    		swap(nums, pos, i);
    	}
    }
    public void swap(int[] nums, int i, int j) {
    	if (i==j) return;
    	int tmp = nums[i];
    	nums[i] = nums[j];
    	nums[j] = tmp;
    }
}

public class Q046 {
	public static void main(String[] args) {
		Solution46 s =new Solution46();
		int[] nums = {1,2,3};
		List<List<Integer>> list = s.permute(nums);
		System.out.println(list);
	}
}
