package leetcode;

import java.util.Arrays;

// 类似归并排序，只是操作在同一个数组上。

class Solution88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p = m + n - 1;
        m -= 1;
        n -= 1;

        while (p >= 0) {
            int t1 = m >= 0 ? nums1[m] : Integer.MIN_VALUE;
            int t2 = n >= 0 ? nums2[n] : Integer.MIN_VALUE;
            
            if (t1 > t2) {
                nums1[p--] = nums1[m--];
            } else {
                nums1[p--] = nums2[n--];
            }
        }
    }
}

public class Q088_Merge_Sorted_Array {
    public static void main(String[] args) {
        Solution88 s = new Solution88();
        int[] nums1 = { 1, 2, 3, 0, 0, 0 };
        int[] nums2 = { 2, 5, 6 };
        s.merge(nums1, 3, nums2, 3);
        System.out.println(Arrays.toString(nums1));
    }
}
