package leetcode;

import java.util.ArrayList;
import java.util.List;

class Solution22 {
    List<String> list = new ArrayList<String>();
	public List<String> generateParenthesis(int n) {
        generate("", 0, 0, n);
        return list;
    }
    
    public void generate(String s,int left, int right, int max) {
    	if (s.length() >= max*2) {
    		list.add(s);
    	}
    	
    	if (left<max) {		//左括号的数量小于等于n
    		generate(s+"(", left+1, right, max);
    	}
    	
    	if (right<left) {	//右括号的数量小于等于左括号的
    		generate(s+=")", left, right+1, max);
    	}
    }
}

public class Q022 {
	public static void main(String[] args) {
		Solution22 s = new Solution22();
		List<String> list = s.generateParenthesis(3);
		System.out.println(list);
	}
}
