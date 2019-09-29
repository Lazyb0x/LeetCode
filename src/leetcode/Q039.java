//39. 组合总和
//递归回溯剪枝

package leetcode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

class Solution39 {
	List<List<Integer>> list = new LinkedList<List<Integer>>();
	List<Integer> tmp = new LinkedList<Integer>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
    	Arrays.sort(candidates);
        combination(candidates, target, 0, 0);
        return this.list;
    }
    
    public void combination(int[] candidates, int target, int sum, int pos) {
		if (sum==target) {
			list.add(new LinkedList<Integer>(tmp));
			return;
		}
//		if (sum>target) {
//			return;
//		}
		for (int i=pos; i<candidates.length; i++) {
			//提前判断数字之和是否超出，如果超出，后面的不用看了
			if (sum+candidates[i]>target) break;
			tmp.add(candidates[i]);
			combination(candidates, target, sum+candidates[i], i);
			tmp.remove(tmp.size()-1);
		}
    }
}

public class Q039 {
	public static void main(String[] args) {
		int[] candidates = {2,3,6,7};
		int target = 7;
		Solution39 s = new Solution39();
		s.combinationSum(candidates, target);
		System.out.println(s.list);
	}
}
