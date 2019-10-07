package lintcode.offer;

class Solution365 {
    /*
     * @param num: An integer
     * @return: An integer
     */
    public int countOnes(int num) {
    	int count = 0;
    	while(num!=0) {
    		count += num&1;
    		num = num>>>1;
    	}
    	return count;
    }
};

public class Q365_Count_1_in_Binary {
	public static void main(String[] args) {
		System.out.println(new Solution365().countOnes(-1));
	}
}
