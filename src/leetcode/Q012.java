package leetcode;

class Solution11 {
    public String intToRoman(int num) {
        String rom = new String();
    	String[][] r = {
    			{"","I","II","III","IV","V","VI","VII","VIII","IX"},
    			{"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"},
    			{"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"},
    			{"","M","MM","MMM"}
    	};
        
    	int i = 0;
    	while(num>0) {
    		rom = r[i][num%10] + rom;
    		num /= 10;
    		i++;
    	}
    	
        return rom;
    }
}

public class Q012 {
	public static void main(String[] args) {
		Solution11 s = new Solution11();
		String c =  s.intToRoman(89);
		String e = new String("aaa");
		e = "eee" + e;
		System.out.println(c);
	}
}
