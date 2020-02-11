package leetcode;

import java.util.Arrays;

class Solution80 {
    public int removeDuplicates(int[] nums) {      
        int dupl = 0;
        int l = 1, r = 1;
        
        while (r<nums.length) {
            if (nums[r-1]==nums[r]) // num[r-1]值不会受到下面的影响
                dupl++;
            else
               dupl = 0; 
            
            // 快排序的双指针，因为右指针没用，不用替换
            // 赋值就可以了
            if (dupl<2) {
                nums[l]=nums[r];
                l++;
            }
            r++;
        }
        return l;
    }
    
}

public class Q080_Remove_Duplicates_from_Sorted_Array_II {
    public static void main(String[] args) {
        Solution80 s = new Solution80();
        
        int[] n = {1,1,1,2,2,2,2,3,3,3,3};
        int l = s.removeDuplicates(n);
        System.out.println(Arrays.toString(n) + l);
    }
}
