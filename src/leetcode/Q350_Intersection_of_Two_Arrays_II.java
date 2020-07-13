package leetcode;

import java.util.Arrays;
import java.util.HashMap;

// 一个 HashMap 记录 nums1 数字出现的次数，用 nums2 来比较
// 如果存在，就添加到结果中，并且把 map 的数字 -1。
class Solution350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        var map1 = new HashMap<Integer, Integer>();
        for (int n : nums1) {
            int c = map1.getOrDefault(n, 0);
            map1.put(n, c+1);
        }
        
        int[] intersection = new int[nums1.length];
        int i = 0;
        for (int n : nums2) {
            if (map1.containsKey(n)) {
                
                int c = map1.get(n);
                c--;
                if (c > 0) {
                    map1.put(n, c);
                }
                else {
                    map1.remove(n);
                }
                
                intersection[i++] = n;
                
            }
        }
        
        return Arrays.copyOfRange(intersection, 0, i);
    }
}

public class Q350_Intersection_of_Two_Arrays_II {

    public static void main(String[] args) {
        
        Solution350 s = new Solution350();
        
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        int[] nums3 = {4,9,5};
        int[] nums4 = {9,4,9,8,4};
        
        System.err.println(Arrays.toString(s.intersect(nums1, nums2)));
    }

}
