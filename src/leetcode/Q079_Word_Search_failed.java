package leetcode;

/**
 * 只保存了上一个访问过的不行，完全错了
 */
class Solution79f {
    public boolean exist(char[][] board, String word) {

        for (int i=0; i<board.length; i++) {
            for (int j=0; j<board[0].length; j++) {
                if (search(board, word, i, j, 0, -1))
                    return true;
            }
        }
        return false;
    }
    
    /**
     * @param r 行号
     * @param c 列号
     * @param p 单词的指针
     * @param pred 前一个单元格的方向，0~3 代表上下左右
     */
    public boolean search(char[][] board, String word, int r, int c, int p, int pred) {
        if (r<0 || c<0 || r>=board.length || c>=board[0].length) return false;
        if (board[r][c]==word.charAt(p)) {
            if (p==(word.length()-1)) {
                return true;
            }
            
            for (int i=0; i<4; i++) {
                if (i==pred) continue;          //跳过防止重复
                int[] pos = getPos(i, r, c);
                boolean isFound = search(board, word, pos[0], pos[1], p+1, (i+2)%4);
                if (isFound) return true;
            }
        }
        return false;
    }
    
    /**
     * @param direction 0~3 分別代表右下左上
     * @return 指定方向的字符，-1 表示不存在
     */
    private int[] getPos(int direction, int r, int c) {
        int[] pos = {r, c};
        switch (direction) {
        case 0:
            pos[1]++; break;
        case 1:
            pos[0]++; break;
        case 2:
            pos[1]--; break;
        case 3:
            pos[0]--; break;
        }
        return pos;
    }
}

public class Q079_Word_Search_failed {
    public static void main(String[] args) {
        Solution79f s = new Solution79f();
        char[][] board = {
                         {'A','B','C','E'},
                         {'S','F','C','S'},
                         {'A','D','E','E'}
                       };
        System.out.println(s.exist(board, "ABCCED"));
        System.out.println(s.exist(board, "ASA"));
        System.out.println(s.exist(board, "ABCB"));
    }
}
