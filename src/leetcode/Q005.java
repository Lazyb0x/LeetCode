package leetcode;

class Solution5 {
    public String longestPalindrome(String s) {
        String a = new String();
        int maxl = 0;
        int l = s.length();
        
        for(int i=0;i<l;i++) {
        	boolean isQ = false;
        	int Qlen = 0;
        	int pos = 0;
        	for(int j=0;i-j>=0&&i+j<l;j++) {
        		if (s.charAt(i-j)==s.charAt(i+j)) {
        			pos = j;
        			Qlen = 2*j+1;
        			isQ = true;
        		}
        		else break;
        	}
        	
        	if (isQ&&Qlen+1>maxl) {
        		maxl = Qlen+1;
        		a = s.substring(i-pos, i+pos+1);
        	}
        	
        	isQ = false;
        	
        	for(int j=0;i-j>=0&&i+j+1<l;j++) {
        		if(s.charAt(i-j)==s.charAt(i+j+1)) {
        			pos = j;
        			Qlen = 2*(j+1);
        			isQ = true;
        		}
        		else break;
        	}
        	
        	if (isQ&&Qlen+1>maxl) {
        		maxl = Qlen+1;
        		a = s.substring(i-pos, i+pos+2);
        	}
        }
        
    	return a;
    }
}

public class Q005 {
	public static void main(String[] args) {
		Solution5 s = new Solution5();
		String a = s.longestPalindrome("sdkjfhdjsksasaskshfgasbfgaer");
		System.out.println(a);
	}
}
