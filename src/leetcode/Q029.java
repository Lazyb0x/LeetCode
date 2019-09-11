package leetcode;

class Solution29 {
    public int divide(int dividend, int divisor) {
    	int MIN = Integer.MIN_VALUE;
    	if (dividend==MIN && divisor==-1) return Integer.MAX_VALUE;
    	boolean minus = (dividend^divisor)<0;
        int x = dividend>0 ? dividend : -dividend;
        int y = divisor>0 ? divisor : -divisor;
        int c = 0;
        int res = 0;
        boolean overflow = false;
        while ((x+MIN) >= (y+MIN)) {	//无符号整形比大小
        	if (y>>>31 == 1) {			//溢出跳出循环
        		overflow = true;
        		c++;
        		break;
        	}
        	y = y<<1;
        	c++;
        }
        
        if (!overflow) y >>>= 1;
        while (c>0) {
        	if (x+MIN >= y+MIN) {
        		res <<= 1;
        		res |= 1;
        		x -= y;
        	}
        	else {
        		res <<= 1;
        	}
        	y >>>= 1;
        	c--;
        }
        
        if (minus) res = -res;
        return res;
    }
}

public class Q029 {
	public static void main(String[] args) {
		Solution29 s = new Solution29();
		int x = s.divide(-2147483648, 1);
		System.out.println(x);
		long y = -2147483648;
		long z = y/(-1);
		System.out.println((-2147483648)/(2));
	}
}
