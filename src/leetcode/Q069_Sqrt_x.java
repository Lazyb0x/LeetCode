package leetcode;

// 牛顿迭代法：设 x^2 - b = 0， b 是要求平方根的数
// 找到 y = x^2 - b 上的一个点，作切线与 x 轴相交得到截距 m
// 用截距 m 带入 x，得到新的点，再算切线的截距，以此类推。
// m 会越来越逼近 b 的平方根。

class Solution69 {
    public int mySqrt(int x) {
        long m = x;
        while (m*m > x) {
        	m = (m + x/m) / 2;
        }
        return (int)m;
    }
}

public class Q069_Sqrt_x {
	public static void main(String[] args) {
		Solution69 s = new Solution69();
		System.out.println(s.mySqrt(Integer.MAX_VALUE));
		System.out.println(Math.sqrt(Integer.MAX_VALUE));
	}
}
