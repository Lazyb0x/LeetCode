package leetcode;

import java.util.Stack;

class Solution20 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (int i=0;i<s.length();i++) {
        	char n = s.charAt(i);
        	if(!stack.empty()) {
        		if(isMatch(stack.peek(), n)) {
        			stack.pop();
        			continue;
        		}
        		else stack.push(n);
        	}
        	else stack.push(n);
        }
        return stack.empty();
    }
    
    public boolean isMatch(char a,char b) {
    	return ((a=='['&&b==']')||(a=='('&&b==')')||(a=='{'&&b=='}'));
    }
}

public class Q020 {
	public static void main(String[] args) {
		boolean b = new Solution20().isValid("[]{}");
		System.out.println(b);
	}
}
