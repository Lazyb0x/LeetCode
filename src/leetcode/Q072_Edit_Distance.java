package leetcode;

class Solution72 {
    public int minDistance(String word1, String word2) {
        int l1 = word1.length();
        int l2 = word2.length();
        
        int[][] minop = new int[l1+1][l2+1];
        
        for (int i=0; i<=l1; i++)
        	minop[i][0] = i;
        
        for (int j=0; j<=l2; j++) {
        	minop[0][j] = j;
        }
        
        for (int i=1; i<=l1; i++) {
        	for (int j=1; j<=l2; j++) {
        		int isDiff = word1.charAt(i-1)==word2.charAt(j-1) ? 0 : 1;
        		
        		int repl = minop[i-1][j-1]+isDiff;  //来自上一个状态替换字符
        		int rem = minop[i][j-1]+1;          //来自上一个状态添加字符
        		int add = minop[i-1][j]+1;          //来自上一个状态删除字符
        		
        		minop[i][j] = Math.min(repl, Math.min(rem, add));
        	}
        }
        
        return minop[l1][l2];
    }
}

public class Q072_Edit_Distance {
	public static void main(String[] args) {
		Solution72 s = new Solution72();
		System.out.println(s.minDistance("horse", "ros"));
		System.out.println(s.minDistance("intention", "execution"));
		System.out.println(s.minDistance("qee", "qwd"));
	}
}
