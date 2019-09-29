//39. 组合总和
//递归回溯剪枝

package leetcode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

class Solution40 {
	List<List<Integer>> list = new LinkedList<List<Integer>>();
	List<Integer> tmp = new LinkedList<Integer>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
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
			if (sum+candidates[i]>target) break;
			if (i>pos&&candidates[i]==candidates[i-1]) continue;
			tmp.add(candidates[i]);
			combination(candidates, target, sum+candidates[i], i+1);
			tmp.remove(tmp.size()-1);
		}
    }
}

public class Q040 {
	public static void main(String[] args) {
		int[] candidates = {10,1,2,7,6,1,5};
		int target = 8;
		Solution40 s = new Solution40();
		s.combinationSum2(candidates, target);
		System.out.println(s.list);
	}
}
