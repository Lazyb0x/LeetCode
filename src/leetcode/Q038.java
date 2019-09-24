package leetcode;

class Solution38 {
    public String countAndSay(int n) {
        String s = "1";
        n-=1;
        for (int i=0;i<n;i++) {
        	String tmp = "";
        	char c = s.charAt(0);
        	int count = 1;
        	for (int j=0;j<s.length();j++) {
        		if (j==0) {
        			c = s.charAt(0);
        			count = 1;
        		}
        		else if (s.charAt(j)==s.charAt(j-1)) {
        			count++;
        		}
        		else {
        			tmp += String.valueOf(count) + c;
        			c = s.charAt(j);
        			count = 1;
        		}
    			if (j==s.length()-1) {
    				tmp += String.valueOf(count) + c;
    			}
        	}
        	s = tmp;
        }
        return s;
    }
}

public class Q038 {
	public static void main(String[] args) {
		for (int i=0;i<30;i++) {
			System.out.println(new Solution38().countAndSay(i));
		}
	}
}
