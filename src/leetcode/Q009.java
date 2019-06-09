package leetcode;
class Solution9 {
    public boolean isPalindrome(int x) {
    	if (x<0||(x%10==0&&x!=0)) return false;
        int c = 0;
        while (c<x) {
        	c = 10*c+x%10;
        	x /= 10;
        }
        if(c==x||c/10==x) return true;
        else return false;
        
    }
}
public class Q009 {
	public static void main(String[] args) {
		Solution9 s = new Solution9();
		boolean b = s.isPalindrome(0);
		System.out.println(b);
	}
}
