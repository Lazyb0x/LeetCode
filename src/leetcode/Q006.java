package leetcode;

class Solution6 {
    public String convert(String s, int numRows) {
        if(numRows==1) return s;
    	String c = new String();
        int m = numRows*2-2;
        for(int i=0;i<numRows;i++) {
        	for(int j=0;j<s.length();j++) {
        		
        		if(j%m==(m-i)) {
        			c +=s.charAt(j);
//        			for(int k=0;k<i-1;k++) c += ' ';
        		}
        		else if(j%m==i) {
        			c += s.charAt(j);
//        			for(int k=0;k<numRows-2-i;k++) c += ' ';
        		}
        	}
//        	c += '\n';
        }
        return c;
    }
}

public class Q006 {
	public static void main(String[] args) {
		Solution6 s = new Solution6();
		String c = s.convert("LEETCODEISHIRING", 1);
		System.out.print(c);
	}
}
