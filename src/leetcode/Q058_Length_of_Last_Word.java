package leetcode;

class Solution58 {
    public int lengthOfLastWord(String s) {
        int i = s.length()-1;
        int c = 0;
        while(i>=0 && s.charAt(i)==' ') i--;
        while(i>=0 && s.charAt(i)!=' ') {
        	i--;
        	c++;
        }
        return c;
    }
}

public class Q058_Length_of_Last_Word {
	public static void main(String[] args) {
		Solution58 s = new Solution58();
		int x = s.lengthOfLastWord("hello dsfkk dfsfnkjfsd fdsn");
		System.out.println(x);
	}
}
