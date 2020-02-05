package leetcode;

// 类似快排序的算法，把所有的2移到最后，然后比较0和1

import java.util.Arrays;

class Solution75o {
    public void sortColors(int[] nums) {
        int l = 0;
        int r = nums.length-1;
        while (l<=r) {
            if (nums[l]>=2) {
                swap(nums, l, r);
                r--;
            }
            else {
                l++;
            }
        }
        
        l = 0;
        r = 0;
        while(r<nums.length && nums[r]!=2) {
            if (nums[r]<1) {
                swap(nums, l, r);
                l++;
            }
            r++;
        }
    }
    
    private void swap(int[] nums, int i, int j) {
        if (i==j) return;
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}

public class Q075_Sort_Colors_old {
    public static void main(String[] args) {
        Solution75o s = new Solution75o();
        
        int[] n1 = {2,0,2,1,1,0,2,0,1};
        int[] n2 = {0,1,0};
        int[] n3 = {2,0,2};
        int[] n4 = {0,1,1,0};
        int[] n = n4;
        s.sortColors(n);
        System.out.println(Arrays.toString(n));
    }
}
