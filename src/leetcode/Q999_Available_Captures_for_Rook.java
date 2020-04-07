package leetcode;

class Solution999 {
    public int numRookCaptures(char[][] board) {
        int pi=-1,pj=-1;
        int[][] dir = {{1,0},{0,1},{-1,0},{0,-1}};
        //找到白色的车
        for (int i=0; i<board.length; i++) {
            for (int j=0; j<board[0].length; j++) {
                if(board[i][j]=='R') {
                    pi = i;
                    pj = j;
                }
            }
        }
        
        int count = 0;
        for (int i=0; i<4; i++) {
            int ti = pi+dir[i][0];
            int tj = pj+dir[i][1];
            boolean isCatch = false;
            while((0<=ti && ti<board.length) && (0<=tj && tj<board[0].length)) {
                
                if (board[ti][tj]=='p') {
                    isCatch = true;
                    break;
                }
                else if (board[ti][tj]=='B') {
                    break;
                }
                ti += dir[i][0];
                tj += dir[i][1];
            }
            count += isCatch ? 1 : 0;
        }
        
        return count;
    }
}

public class Q999_Available_Captures_for_Rook {
    public static void main(String[] args) {
        Solution999 s = new Solution999();
        
        char[][] board = { 
                { '.', '.', '.', '.', '.', '.', '.', '.' }, 
                { '.', '.', '.', 'p', '.', '.', '.', '.' },
                { '.', '.', '.', 'p', '.', '.', '.', '.' }, 
                { 'p', 'p', '.', 'R', '.', 'p', 'B', '.' },
                { '.', '.', '.', '.', '.', '.', '.', '.' }, 
                { '.', '.', '.', 'B', '.', '.', '.', '.' },
                { '.', '.', '.', 'p', '.', '.', '.', '.' }, 
                { '.', '.', '.', '.', '.', '.', '.', '.' }
                };
        
        char[][] board2 = { 
                { '.', '.', '.', '.', '.', '.', '.', '.' }, 
                { '.', 'p', 'p', 'p', 'p', 'p', '.', '.' },
                { '.', 'p', 'p', 'B', 'p', 'p', '.', '.' }, 
                { '.', 'p', 'B', 'R', 'B', 'p', '.', '.' },
                { '.', 'p', 'p', 'B', 'p', 'p', '.', '.' }, 
                { '.', 'p', 'p', 'p', 'p', 'p', '.', '.' },
                { '.', '.', '.', '.', '.', '.', '.', '.' }, 
                { '.', '.', '.', '.', '.', '.', '.', '.' } 
                };
        char[][] board3 = { 
                { '.', '.', '.', '.', '.', '.', '.', '.' }, 
                { '.', '.', '.', 'p', '.', '.', '.', '.' },
                { '.', '.', '.', 'p', '.', '.', '.', '.' }, 
                { 'p', 'p', '.', 'R', '.', 'p', 'B', '.' },
                { '.', '.', '.', '.', '.', '.', '.', '.' }, 
                { '.', '.', '.', 'B', '.', '.', '.', '.' },
                { '.', '.', '.', 'p', '.', '.', '.', '.' }, 
                { '.', '.', '.', '.', '.', '.', '.', '.' } 
                };
        
        System.out.println(s.numRookCaptures(board));
        System.out.println(s.numRookCaptures(board2));
        System.out.println(s.numRookCaptures(board3));
    }
}
