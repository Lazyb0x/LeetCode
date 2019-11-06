package leetcode;

class Solution50 {
    public double myPow(double x, int n) {
    	int y = Math.abs(n);
    	if (n>0) {
    		return Pow(x,y);
    	}
    	else if (n<0) {
    		return 1/Pow(x,y);
    	}
    	else {
    		return 1;
    	}
    }
    
    public double Pow(double x, int n) {
    	if (n==0) return 1;
    	if (n==1) return x;
    	if (n==0x80000000) {			//-2147483648
    		double res = Pow(x, 0x40000000);
    		return res*res;
    	}
    	
    	if (n%2 == 0) {
    		double res = Pow(x, n/2);
    		return res*res;
    	}
    	else {
    		double res = Pow(x, (n-1)/2);
    		return res*res*x;
    	}
    }
}

public class Q050_Pow_x_n {
	public static void main(String[] args) {
		Solution50 s = new Solution50();
		System.out.println(s.myPow(2,-2147483648));
	}
}
