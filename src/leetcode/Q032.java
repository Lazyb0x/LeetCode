package leetcode;

import java.util.Arrays;

class Solution32 {
    public int longestValidParentheses(String s) {
        int left = 0;
        int max = 0;
        while (left<s.length()) {
        	int[] a = isValid(s,left);
        	if (a[0]!=-1) {
        		max = a[1]>max ? a[1] : max;
        		left = left+a[0]-1;
        	}
        	left++;
        }
        return max;
    }
    
    //返回 [最小匹配长度, 最大匹配长度] 或 [-1, -1] 不存在
    public int[] isValid(String s, int left) {
    	int lnum = 0;
    	int rnum = 0;
    	int vmin = -1;
    	int vmax = -1;
    	for (int i=left;i<s.length();i++) {
    		switch (s.charAt(i)) {
			case '(':
				lnum++;
				break;
			case ')':
				rnum++;
				break;
			}
    		if (rnum>lnum) {
    			break;
    		}
    		if (lnum==rnum) {
    			vmax = i-left+1;
    			vmin = vmin==-1 ? vmax : vmin;
    		}
    	}
    	return new int[] {vmin,vmax};
    }
}

public class Q032 {
	public static void main(String[] args) {
		Solution32 s = new Solution32();
		int[] a = s.isValid("(())(())()", 0);
//		System.out.println(Arrays.toString(a));
		System.out.println(s.longestValidParentheses("(()"));
	}
}
