// 有效的数独

package leetcode;

class Solution36 {
    public boolean isValidSudoku(char[][] board) {
         boolean[] marks = new boolean[10];
         for (int i=0; i<9; i++) {
        	 for (int j=0; j<9; j++) {
    			 if (board[i][j]=='.') continue;
    			 else if (marks[board[i][j]-'0']) return false;
    			 else marks[board[i][j]-'0'] = true;
        	 }
        	 clearMark(marks);
         }
         for (int i=0; i<9; i++) {
        	 for (int j=0; j<9; j++) {
        		 if (board[j][i]=='.') continue;
    			 else if (marks[board[j][i]-'0']) return false;
    			 else marks[board[j][i]-'0'] = true;
        	 }
        	 clearMark(marks);
         }
         for (int i=0; i<9; i+=3) {
        	 for (int j=0; j<9; j+=3) {
        		 for (int k=0; k<9; k++) {
        			 int row = i + k/3;
        			 int col = j + k%3;
        			 if (board[row][col]=='.') continue;
        			 else if (marks[board[row][col]-'0']) return false;
        			 else marks[board[row][col]-'0'] = true;
        		 }
        		 clearMark(marks);
        	 }
         }
         return true;
    }
    
    void clearMark(boolean[] marks) {
    	for (int i=0; i<marks.length; i++) 
    		marks[i] = false;
    }
}

public class Q036 {
	public static void main(String[] args) {
		//true
		char[][] board = {
		        {'5','3','.','.','7','.','.','.','.'},
		        {'6','.','.','1','9','5','.','.','.'},
		        {'.','9','8','.','.','.','.','6','.'},
		        {'8','.','.','.','6','.','.','.','3'},
		        {'4','.','.','8','.','3','.','.','1'},
		        {'7','.','.','.','2','.','.','.','6'},
		        {'.','6','.','.','.','.','2','8','.'},
		        {'.','.','.','4','1','9','.','.','5'},
		        {'.','.','.','.','8','.','.','7','9'}
			};
		//false
		char[][] board2 ={
				{'.','.','4','.','.','.','6','3','.'},
				{'.','.','.','.','.','.','.','.','.'},
				{'5','.','.','.','.','.','.','9','.'},
				{'.','.','.','5','6','.','.','.','.'},
				{'4','.','3','.','.','.','.','.','1'},
				{'.','.','.','7','.','.','.','.','.'},
				{'.','.','.','5','.','.','.','.','.'},
				{'.','.','.','.','.','.','.','.','.'},
				{'.','.','.','.','.','.','.','.','.'}
			};
		boolean x = new Solution36().isValidSudoku(board2);
		System.out.println(x);
	}
}
