// 这个方法不好，每次都要重新排序一次才行
// 失败就是因为替换后的数组不是有序的了

package leetcode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

class Solution47F {
	List<List<Integer>> list = new LinkedList<List<Integer>>();
	List<Integer> tmp = new LinkedList<Integer>();
    public List<List<Integer>> permuteUnique(int[] nums) {
    	Arrays.sort(nums);
    	System.out.println(Arrays.toString(nums));
    	permute2(nums, 0);
    	isDupl();
    	return list;
    }
    public void permute2(int[] nums, int pos) {
    	if (pos>=nums.length) {
    		for (Integer x : nums)
    			tmp.add(x);
    		list.add(new LinkedList<Integer>(tmp));
    		tmp.clear();
    		return;
    	}
    	for (int i=pos; i<nums.length; i++) {
    		if (i!=pos&&(nums[i]==nums[pos]||nums[i]==nums[i-1])) continue;
    		swap(nums, pos, i);
    		permute2(nums, pos+1);
    		swap(nums, pos, i);
    	}
    }
    public void swap(int[] nums, int i, int j) {
    	if (i==j) return;
    	int tmp = nums[i];
    	nums[i] = nums[j];
    	nums[j] = tmp;
    }
    
    public void isDupl() {
    	for (int i=0;i<list.size()-1;i++) {
    		for(int j=i+1;j<list.size();j++) {
    			List<Integer> a = list.get(i);
    			List<Integer> b = list.get(j);
    			boolean isD = true;
    			for (int k=0;k<a.size();k++) {
    				if (a.get(k)!=b.get(k)) {
    					isD = false;
    					break;
    				}
    			}
    			if (isD) {
    				System.out.println(a);
    			}
    		}
    	}
    }
}

public class Q047_failed {
	public static void main(String[] args) {
		Solution47F s =new Solution47F();
		int[] nums = {1,1,3,3,2,2,4};
		List<List<Integer>> list = s.permuteUnique(nums);
		System.out.println(list);
	}
}
