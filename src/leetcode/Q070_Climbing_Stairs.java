package leetcode;

class Solution70 {
	public int climbStairs(int n) {
		if (n<=0) return 0; 
        int[] counts = new int[n+1];
        counts[0] = 1;
        counts[1] = 2;
        for (int i=2; i<n; i++) {
        	counts[i] = counts[i-1] + counts[i-2];
        }
        return counts[n-1];
    }
}

public class Q070_Climbing_Stairs {
	public static void main(String[] args) {
		Solution70 s = new Solution70();
		System.out.println(s.climbStairs(0));
	}
}
