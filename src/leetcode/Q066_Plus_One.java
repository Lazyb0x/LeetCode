package leetcode;

// 给数组加一，进位问题。
// 当给数组赋值 new int[] 时，就数组的值仍然保留
// 新的空位是在旧数组之前的

import java.util.Arrays;

class Solution66 {
    public int[] plusOne(int[] digits) {
        int carry = 0;
        int i = digits.length-1;
        digits[i] +=1;
        for (; i>=0; i--) {
        	int res = digits[i] + carry;
        	if (res>=10) {
        		carry = 1;
        		res -= 10;
        	}
        	else {
        		carry = 0;
        	}
        	digits[i] = res;
        }
        if (carry==1) {
//        	int[] digits2 = new int[digits.length+1];
//        	digits2[0] = 1;
//        	for (int j=0; j<digits.length; j++) {
//        		digits2[j+1] = digits[j];
//        	}
//        	return digits2;
        	digits = new int[digits.length + 1];
            digits[0] = 1;
        }
        
        return digits;
    }
}

public class Q066_Plus_One {

	public static void main(String[] args) {
		Solution66 s = new Solution66();
		int[] digits = {8,9,9,9};
		int[] res = s.plusOne(digits);
		System.out.println(Arrays.toString(res));
	}
	
}
