package leetcode;
import java.util.HashMap;

class Solution13 {
    public int romanToInt(String s) {
    	HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		hm.put('I', 1);
		hm.put('V', 5);
		hm.put('X', 10);
		hm.put('L', 50);
		hm.put('C', 100);
		hm.put('D', 500);
		hm.put('M', 1000);
		
		int num = 0;
		for (int i=0;i<s.length();i++) {
			int m = hm.get(s.charAt(i));
			if (i+1<s.length()) {
				int n = hm.get(s.charAt(i+1));
				if (m>=n) num += m;
				else num -= m;
			}
			else num += m;
		}
		
		return num;
    }
}

public class Q013 {
	public static void main(String[] args) {
		Solution13 s = new Solution13();
		int c = s.romanToInt("MCMXCIV");
		System.out.println(c);
	}
}
