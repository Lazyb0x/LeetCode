package leetcode;

import java.util.Arrays;

// 数组的左边和右边都可以设指针，左边的存比1小的，
// 右边存比1大的。

class Solution75 {
    public void sortColors(int[] nums) {
        int c = 0;
        int l = 0;
        int r = nums.length-1;
        
        while(c<=r) {
            if (nums[c]==0) {
                swap(nums, l, c);
                l++;
                c++;
            }
            else if (nums[c]==2) {
                swap(nums, c, r);
                r--;
            }
            else {
                c++;
            }
        }
    }
    
    private void swap(int[] nums, int i, int j) {
        if (i==j) return;
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}

public class Q075_Sort_Colors {
    public static void main(String[] args) {
        Solution75 s = new Solution75();
        
        int[] n1 = {2,0,2,1,1,0,2,0,1};
        int[] n2 = {0,1,0};
        int[] n3 = {2,0,2};
        int[] n4 = {0,1,1,0};
        int[] n = n2;
        s.sortColors(n);
        System.out.println(Arrays.toString(n));
    }
}
