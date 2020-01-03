package leetcode;

import java.util.Arrays;
import java.util.LinkedList;

class Solution71 {
    public String simplifyPath(String path) {
        String[] list = path.split("/");
        LinkedList<String> stack = new LinkedList<String>();
        
        for (String s : list) {
			if (s.equals(".") || s.equals("")) {
				continue;
			}
			else if (s.equals("..")) {
				if (!stack.isEmpty()) {
					stack.pollLast();
				}
			}
			else {
				stack.add(s);
			}
		}
        
        String res = "";
        
//        System.out.println(stack);
//        System.out.println(Arrays.toString(list));
        
        for (String s : stack) {
        	res += "/" + s;
        }
        
        return res.length()==0 ? "/" : res;
    }
}

public class Q071_Simplify_Path {
	public static void main(String[] args) {
		Solution71 s = new Solution71();
		String res = s.simplifyPath("/a//b////c/d//././/..");
		System.out.println(res);
	}
}
