package leetcode;

import java.util.Arrays;

class Solution1103 {
    public int[] distributeCandies(int candies, int num_people) {
        int[] candy = new int[num_people];
        if (candies==0||num_people==0) return candy;
        int p = 0;
        int n = 1;
        candies--;
        
        while(candies>0) {
            candy[p] += n++;
            p = (p+1)%num_people;
            
            n = n>candies ? candies : n;
            candies-=n;
        }
        candy[p] += n;
        return candy;
    }
}

public class Q1103_Distribute_Candies_to_People {
    public static void main(String[] args) {
        int[] nums = new Solution1103().distributeCandies(100, 0);
        System.out.println(Arrays.toString(nums));
    }
}
