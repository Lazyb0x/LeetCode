package lintcode.offer;

class Solution {
    /**
     * @return: The same instance of this class every time
     */
	private static Solution instance = new Solution();
	private Solution() {};
    public static Solution getInstance() {
        // write your code here
    	return instance;
    }
}

public class Q204_Singleton {
	public static void main(String[] args) {
		Solution a = Solution.getInstance();
		Solution b = Solution.getInstance();
		System.out.println(a==b);
	}
}
