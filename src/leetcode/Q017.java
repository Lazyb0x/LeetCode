package leetcode;
import java.util.ArrayList;
import java.util.List;

class Solution17 {
	String[] map = {"", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    public List<String> letterCombinations(String digits) {
        List<String> l = new ArrayList<String>();
        getSequence(digits, 0, "",l);
        return l;
    }
    
    public void getSequence(String digits,int i,String letter,List<String> l) {
    	if (i>=digits.length()) {
    		if (letter!="") l.add(letter);
    		return;
    	}
    	int num = digits.charAt(i) - '0' - 1;
    	for(int j=0;j<map[num].length();j++) {
    		getSequence(digits, i+1, letter + map[num].charAt(j), l);
    	}
    }
}
public class Q017 {
	public static void main(String[] args) {
		List<String> l = new Solution17().letterCombinations("");
		
		System.out.println(l.toString());
	}
}