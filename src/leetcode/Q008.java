package leetcode;

class Solution8 {
    public int myAtoi(String str) {
        int i = 0;
        int num = 0;
        while (i<str.length()) {
        	char c = str.charAt(i);
        	if (c==' ') {
        		i++;
        		continue;
        	}
        	else if (c=='-'||c=='+'||isNum(c)) {
        		boolean isSymbol = c=='-'||c=='+';
        		boolean minus = c=='-';
        		if (isNum(c)) {
        			return atoi(str, i, false);
        		}
        		else if (isSymbol&&(i+1<str.length()&&isNum(str.charAt(i+1)))) {
        			return atoi(str, i+1, minus);
        		}
        		else return 0;
        	}
        	else return 0;
        }
        return num;
    }
    
    public boolean isNum(char c) {
    	return c-'0'>=0&&c-'0'<=9;
    }
    
    public int atoi(String str,int pos,boolean isMinus) {
    	long num = 0;
    	int i=0;
    	while(pos<str.length()&&isNum(str.charAt(pos))) {
    		num *= 10;
    		num += str.charAt(pos)-'0';
    		pos++;
    		if(num!=0) i++;
    	}
    	if(i>10) {					//超出10位，一定溢出了
    		return isMinus?0x80000000:0x7fffffff;
    	}
    	if(isMinus) num = 0-num; 	
    	if(num>=0x7fffffff) num = 0x7fffffff;
    	else if(num<=0x80000000) num = 0x80000000;
    	
    	return (int)num;
    }
}

public class Q008 {
	public static void main(String[] args) {
		Solution8 s = new Solution8();
		int x = s.myAtoi(" 0000000000012345678");
//		int x = s.atoi("12345", 1, true);
		System.out.println(x);
	}
}
