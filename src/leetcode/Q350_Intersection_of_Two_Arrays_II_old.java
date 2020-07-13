package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

class Solution350o {
    public int[] intersect(int[] nums1, int[] nums2) {
        var map1 = getMap(nums1);
        var map2 = getMap(nums2);
        
        var res = new HashSet<Integer>();
        res.addAll(map1.keySet());
        res.retainAll(map2.keySet());
        
        var list = new ArrayList<Integer>();
        for (int n : res) {
            int num = Math.min(map1.get(n), map2.get(n));
            for (int i=0; i<num; i++) {
                list.add(n);
            }
        }
        
        return list.stream().mapToInt(Integer::valueOf).toArray();
    }
    
    private Map<Integer, Integer> getMap(int[] nums){
        var map = new HashMap<Integer, Integer>();
        for (int n : nums) {
            Integer e = map.get(n);
            e = e==null ? 0 : e;
            map.put(n, e+1);
        }
        return map;
    }
}

public class Q350_Intersection_of_Two_Arrays_II_old {

    public static void main(String[] args) {
        
        Solution350o s = new Solution350o();
        
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        int[] nums3 = {4,9,5};
        int[] nums4 = {9,4,9,8,4};
        
        System.err.println(Arrays.toString(s.intersect(nums3, nums4)));
    }

}
