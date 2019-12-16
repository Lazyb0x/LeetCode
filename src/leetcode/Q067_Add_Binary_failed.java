package leetcode;

class Solution67f {
    public String addBinary(String a, String b) {
        int x = stringToInt(a);
        int y = stringToInt(b);
        return intToString(x+y);
    }
    
    public int stringToInt(String s) {
    	int n = 0;
    	for (int i=0; i<s.length(); i++) {
    		n |= s.charAt(i)=='1' ? 1 : 0;
    		n <<= 1;
    	}
    	n >>= 1;
    	return n;
    }
    
    public String intToString(int n) {
    	String s = "";
    	while (n!=0) {
    		s = ((n&1)==1 ? "1" : "0") + s;
    		n >>= 1;
    	}
    	return s!="" ? s : "0";
    }
}

public class Q067_Add_Binary_failed {
	public static void main(String[] args) {
		Solution67f s = new Solution67f();
		System.out.println(s.stringToInt("1010"));
		System.out.println(s.intToString(16));
		System.out.println(s.addBinary("0", "0"));
	}
}
