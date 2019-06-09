package leetcode;

class Solution5f {
    public String longestPalindrome(String s) {
        int l = s.length();
        int maxl = 0;
        String p = new String();
    	for(int i=0;i<l;i++) {
    		for(int j=i;j<l;j++) {
//    			System.out.println("i=" + i + " j=" + j);
    			boolean isp = true;
    			for(int k=i;k<=((j-i-1)/2+i);k++) {
    				if(s.charAt(k)!=s.charAt(i+j-k)) isp = false;
    			}
    			if (isp) {
    				int plen = j-i+1;
    				if (plen>maxl) {
//    					System.out.println("  i=" + i + " j=" + j + " " + plen + " " + maxl);
    					maxl = plen;
    					p = s.substring(i,j+1);
    				}
    			}
    		}
    	}
    	
    	return p;
    }
}

public class Q005_failed {
	public static void main(String[] args) {
		Solution5f s = new Solution5f();
		String a = s.longestPalindrome("w");
		System.out.println(a);
	}
}
