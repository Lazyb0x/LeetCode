package leetcode;

import java.util.LinkedList;
import java.util.List;

class Solution90 {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> subsets = new LinkedList<List<Integer>>();
        int l = nums.length;
        // 1<<l 即 2^l
        for (int i = 0; i < 1<<l; i++) {
            LinkedList<Integer> comb = new LinkedList<Integer>();
            for (int j=0; j<l; j++) {
                if ((i>>j&1)==1) {
                    comb.addLast(nums[j]);
                }
            }
            subsets.add(comb);
        }
        return subsets;
    }
}

public class Q078_Subsets {
    public static void main(String[] args) {
        Solution90 s = new Solution90();
        int[] nums = {1,2,3};
        
        List<List<Integer>> subsets = s.subsets(nums);
        System.out.println(subsets);
    }
}