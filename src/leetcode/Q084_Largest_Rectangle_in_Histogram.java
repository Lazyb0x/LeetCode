package leetcode;

import java.util.Arrays;

// 优化的暴力

class Solution84 {
    public int largestRectangleArea(int[] heights) {
        int maxAreaArea = 0;
        for (int i=0; i<heights.length; i++) {
            int minHeight = heights[i];
            for (int j=i; j<heights.length; j++) {
                minHeight = minHeight<heights[j] ? minHeight : heights[j];
                int area = (j-i+1) * minHeight;
                if (area>maxAreaArea)
                    maxAreaArea = area;
            }
        }
        return maxAreaArea;
    }
}

public class Q084_Largest_Rectangle_in_Histogram {
    public static void main(String[] args) {
        Solution84 s = new Solution84();
        int[] nums = {2,1,5,6,2,3};
        int minArea = s.largestRectangleArea(nums);
        System.out.println(minArea);
    }
}
