package leetcode;

class Solution67 {
    public String addBinary(String a, String b) {
    	String res = "";
    	int i = a.length()-1;
    	int j = b.length()-1;
    	int carry = 0;
    	while (i>=0 || j>=0) {
    		int ai = i>=0 ? a.charAt(i)-'0' : 0;
    		int bi = j>=0 ? b.charAt(j)-'0' : 0;
    		int t = ai +bi + carry;
    		if (t>>1!=0) {
    			carry = 1;
    			t = t&1;
    		}
    		else {
    			carry = 0;
    		}
    		res = (char)('0'+t) + res;
    		i--;
    		j--;
    	}
    	if (carry==1) res = "1" + res;
    	return res;
    }
}

public class Q067_Add_Binary {
	public static void main(String[] args) {
		Solution67 s = new Solution67();
		System.out.println(s.addBinary("0", "0"));
	}
}
