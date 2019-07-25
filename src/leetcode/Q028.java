package leetcode;

class Solution28 {
    public int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
}

public class Q028 {
	public static void main(String[] args) {
		System.out.println(new Solution28().strStr("hello", ""));
	}
}
