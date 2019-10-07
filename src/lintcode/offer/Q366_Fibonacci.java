package lintcode.offer;

class Solution366 {
    /**
     * @param n: an integer
     * @return: an ineger f(n)
     */
    public int fibonacci(int n) {
        // write your code here
    	n--;
    	int a = 0;
    	int b = 1;
    	int c;
    	for (int i=0; i<n; i++) {
    		c = a+b;
    		a = b;
    		b = c;
    	}
    	return a;
    }
}

public class Q366_Fibonacci {
	public static void main(String[] args) {
		for (int i=1; i<15; i++) {
			System.out.println(new Solution366().fibonacci(i));
		}
	}
}
