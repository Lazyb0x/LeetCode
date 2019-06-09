package leetcode;
class Solution14 {
    public String longestCommonPrefix(String[] strs) {
        int minl = Integer.MAX_VALUE;
        int maxl = -1;
        if (strs.length==0) return "";
    	for (int i=0;i<strs.length;i++) {
    		if (strs[i].length()<minl) {
    			minl = strs[i].length();
    		}
    	}
    	
    	for (int i=0;i<minl;i++) {
    		maxl = i;
    		char c = strs[0].charAt(i);
    		boolean isSame = true;
    		for (int j=0;j<strs.length;j++) {
    			if (strs[j].charAt(i)!=c) {
    				isSame = false;
    			}
    		}
    		if (!isSame) {
    			maxl -= 1;
    			break;
    		}
    	}

    	return strs[0].substring(0,maxl+1);
    }
}

public class Q014 {
	public static void main(String[] args) {
		String[] s = {"a","a"};
		String a = new Solution14().longestCommonPrefix(s);
		System.out.println(a);
	}
}
