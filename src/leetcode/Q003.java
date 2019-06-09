package leetcode;

class Solution {
    public int lengthOfLongestSubstring(String s) {
    	if (s.length()==0) return 0;
    	int max = 0;
    	int k=0;
        for(int i=1;i<s.length();i++) {						//滑动窗口算法 k是左界，i是右界
        	for(int j=k;j<i;j++) {
//        		System.out.println("j=" + j + " i=" + i);
        		if (s.charAt(i)==s.charAt(j)) {
        			k = j+1;
//        			System.out.println(" same " + s.charAt(i));
        		}
        		
//        		System.out.println(" max=" + max);
        	}
        	max = i-k>max?i-k:max;
        }
        return max+1;
    }
}

public class Q003 {
	
	public static void main(String[] args) {
		Solution s = new Solution();
		int c = s.lengthOfLongestSubstring("");
		System.out.println(c);
	}
}
