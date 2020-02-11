package leetcode;

// 深度优先搜索
// 不要用 switch，用二维数组更简单
// private int[][] direction = {{-1, 0}, {0, -1}, {0, 1}, {1, 0}};

class Solution79 {
    boolean[][] visited;
    
    public boolean exist(char[][] board, String word) {
        int rl = board.length;
        int cl = board[0].length;
        visited = new boolean[rl][cl];
        for (int i=0; i<rl; i++) {
            for (int j=0; j<cl; j++) {
                if (search(board, word, i, j, 0))
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
    public boolean search(char[][] board, String word, int r, int c, int p) {
        if (r<0 || c<0 || r>=board.length || c>=board[0].length || visited[r][c]) return false;
        if (board[r][c]==word.charAt(p)) {
            if (p==(word.length()-1)) {
                return true;
            }
            
            for (int i=0; i<4; i++) {
                int[] pos = getPos(i, r, c);
                
                visited[r][c] = true;
                boolean isFound = search(board, word, pos[0], pos[1], p+1);
                visited[r][c] = false;
                
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

public class Q079_Word_Search {
    public static void main(String[] args) {
        Solution79 s = new Solution79();
        char[][] board = {
                         {'A','B','C','E'},
                         {'S','F','C','S'},
                         {'A','D','E','E'}
                       };
        char[][] board2 = {{'a','a','a','a'},{'a','a','a','a'},{'a','a','a','a'}};
        System.out.println(s.exist(board, "ABCCED"));
        System.out.println(s.exist(board, "ASA"));
        System.out.println(s.exist(board, "ABCB"));
        System.out.println(s.exist(board2, "aaaaaaaaaaaaa"));
    }
}
