package leetcode;
class Solution7 {
    public int reverse(int x) {
      long c = 0;
      while(x!=0) {
    	  c = c*10 + x%10;
    	  x /= 10;
      }
      
      if(c>=0x80000000&&c<=0x7fffffff) return (int)c;
      else return 0;
    }
}

public class Q007 {
	public static void main(String[] args) {
//		int a = 0x7fffffff;
		Solution7 s = new Solution7();
		int c = s.reverse(2147483647);
		System.out.println(c);
	}
}
