package leetcode;

import java.util.Arrays;

// 按摩师
// https://leetcode-cn.com/problems/the-masseuse-lcci/

class Solutionm17 {
    int[] nums;
    int[] table;
    public int massage(int[] nums) {
        this.nums = nums;
        table = new int[nums.length];
        Arrays.fill(table, -1);
        return Math.max(calcMinSum(0), calcMinSum(1));
    }
    
    public int calcMinSum(int pos) {
        if (pos>=nums.length) {
            return 0;
        }
        if (table[pos]!=-1) {
            return table[pos];
        }
        
        int sum = nums[pos]+Math.max(calcMinSum(pos+2), calcMinSum(pos+3));
        table[pos] = sum;
        return sum;
    }
}

public class Qm017_The_Masseuse_LCCI {
    public static void main(String[] args) {
        Solutionm17 s = new Solutionm17();
        int[] nums = {2,7,9,3,1,5};
        int[] nums2 = {6,6,4,8,4,3,3,10};
        System.out.println(s.massage(nums2));
    }
}
