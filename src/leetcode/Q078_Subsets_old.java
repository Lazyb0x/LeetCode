package leetcode;

import java.util.LinkedList;
import java.util.List;

// 递归的效率还是太低了

class Solution90o {
    LinkedList<Integer> comb;
    List<List<Integer>> subsets;
    
    public List<List<Integer>> subsets(int[] nums) {
        comb = new LinkedList<Integer>();
        subsets = new LinkedList<List<Integer>>();
        for (int i=0; i<=nums.length; i++) {
            combination(nums, 0, 0, i); 
        }
        return subsets;
    }
    
    private void combination(int[] nums, int p, int depth, int n) {
        if (depth==n) {
            List<Integer> tmp = new LinkedList<Integer>(comb);
            subsets.add(tmp);
            return;
        }
        for (int i=p; i<nums.length; i++) {
            comb.addLast(nums[i]);
            combination(nums, i+1, depth+1, n);
            comb.removeLast();
        }
    }
}

public class Q078_Subsets_old {
    public static void main(String[] args) {
        Solution90o s = new Solution90o();
        int[] nums = {1,2,3};
        
        List<List<Integer>> subsets = s.subsets(nums);
        System.out.println(subsets);
    }
}
