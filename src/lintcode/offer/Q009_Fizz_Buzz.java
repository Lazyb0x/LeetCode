package lintcode.offer;

import java.util.ArrayList;
import java.util.List;

class Solution9 {
    /**
     * @param n: An integer
     * @return: A list of strings.
     */
    public List<String> fizzBuzz(int n) {
        // write your code here
    	List<String> list = new ArrayList<String>();
    	for (int i=1; i<=n; i++) {
    		boolean isFizz = i%3==0;
    		boolean isBuzz = i%5==0;
    		String s;
    		if (isFizz) {
    			if (isBuzz) {
    				s = "fizz buzz";
    			}
    			else s = "fizz";
    		}
    		else if (isBuzz) {
    			s = "buzz";
    		}
    		else {
    			s = String.valueOf(i);
    		}
    		list.add(s);
    	}
    	return list;
    }
}

public class Q009_Fizz_Buzz {
	public static void main(String[] args) {
		List<String> list = new Solution9().fizzBuzz(15);
		System.out.println(list);
	}
}
