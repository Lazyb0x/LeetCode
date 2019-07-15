//执行用时 :193 ms, 在所有 Java 提交中击败了5.08% 的用户
//内存消耗 :71.1 MB, 在所有 Java 提交中击败了5.02%的用户

package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution22_o {
	List<String> list = new ArrayList<String>();
	Set<String> set = new HashSet<String>();
    public List<String> generateParenthesis(int n) {
        generate("()", 1, n);
        list.addAll(set);
        System.out.println(list);
        return list;
    }
    
    public void generate(String s, int current, int n) {
    	if (current<n) {
    		List<Integer> numList = insertPosition(s);
    		for (int pos:numList) {
    			StringBuffer sb = new StringBuffer(s);
    			sb.insert(pos, "()");
    			generate(sb.toString(), current+1, n);
    		}
    	}
    	else {
    		if (!list.contains(s)) {
    			set.add(s);
    		}
    	}
    }
    
    public List<Integer> insertPosition(String s){
    	List<Integer> numList = new ArrayList<Integer>();
    	for (int i=0;i<s.length();i++) {
    		if (s.charAt(i) == ')') {			//右括号后面可以插入
    			if (s.charAt(i-1) == '(') {		//左右括号之间可以插入
    				numList.add(i);
    			}
    			numList.add(i+1);
    		}
    	}
//    	System.out.println(numList.toString());
    	return numList;
    }
}

public class Q022_old {
	public static void main(String[] args) {
		Solution22_o s = new Solution22_o();
		s.generateParenthesis(8);
	}
}
