package leetcode;

class Solution43 {
    public String multiply(String num1, String num2) {
    	if (num2.equals("0")) return "0";
    	String res = "";
        for (int i=0; i<num1.length(); i++) {
        	String digit = manyMulOne(num2, num1.charAt(i));
        	res = add(res+"0", digit);
        }
        return res;
    }
    
    public String manyMulOne(String num, char c) {
    	if (c=='0') return "0";
    	int carry = 0;
    	int n = c-'0';
    	String res = "";
    	for (int i=num.length()-1; i>=0; i--) {
    		int inum = num.charAt(i)-'0';
    		int r = inum*n + carry;
    		res = r%10 + res;
    		carry = r/10;
    	}
    	if (carry!=0) {
    		res = carry + res;
    	}
    	return res;
    }
    
    public String add(String num1,String num2) {
    	int carry = 0;
    	String res = "";
    	for (int i=num1.length()-1, j=num2.length()-1; i>=0||j>=0; i--,j--) {
    		int a = i>=0? num1.charAt(i)-'0': 0;
    		int b = j>=0? num2.charAt(j)-'0': 0;
    		int n = a+b+carry;
    		res = n%10 + res;
    		carry = n/10;
    	}
    	if (carry!=0) {
    		res = carry + res;
    	}
    	return res;
    }
}

public class Q043_Multiply_Strings {
	public static void main(String[] args) {
		Solution43 s = new Solution43();
		System.out.println(s.manyMulOne("243334", '9'));
		System.out.println(s.add("1344234","3"));
		System.out.println(s.multiply("123456789", "987654321"));
	}
}
