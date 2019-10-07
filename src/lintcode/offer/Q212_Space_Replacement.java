package lintcode.offer;

class Solution212 {
    /*
     * @param string: An array of Char
     * @param length: The true length of the string
     * @return: The true length of new string
     */
    public int replaceBlank(char[] string, int length) {
        int l = 0;
        for (int i=0; i<length; i++) {
        	if (string[i] == ' ') {
        		l += 3;
        	}
        	else {
				l++;
			}
        }
        
        for (int i=length-1,j=l-1; i>=0;i--) {
        	if (string[i] == ' ') {
        		string[j--] = '0';
        		string[j--] = '2';
        		string[j--] = '%';
        	}
        	else {
        		string[j--] = string[i];
        	}
        }
        
    	return l;
    }
}

public class Q212_Space_Replacement {

	public static void main(String[] args) {
		Solution212 s = new Solution212();
		char[] a = "Mr John Smith".toCharArray();
		char[] string = new char[100];
		for (int i=0; i<a.length; i++) string[i] = a[i];
		System.out.println(string);
		int length = s.replaceBlank(string, a.length);
		System.out.println(String.valueOf(string));
		System.out.println(length);
	}

}
