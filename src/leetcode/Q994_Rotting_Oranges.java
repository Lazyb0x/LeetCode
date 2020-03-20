package leetcode;

// 不好，应该用 BFS。

class Solution994 {
    int [][] grid;
    boolean [][] rotGrid;
    public int orangesRotting(int[][] grid) {
        if (grid.length==0) return 0;
        this.grid = grid;
        boolean isAllRotted = true;
        boolean isChanged = true;
        int count = 0;
        int rl = grid.length;
        int cl = grid[0].length;
        //每分钟
        while(isChanged) {
            count++;
            isChanged = false;
            isAllRotted = true;
            rotGrid = new boolean[rl][cl];
            //遍历网格
            for (int i=0;i<rl;i++) {
                for (int j=0; j<cl; j++) {
                    //检查橘子
                    if (grid[i][j]==1) {
                        isAllRotted = false;
                        if (checkRot(i, j)) {
                            isChanged = true;
                            rotGrid[i][j] = true;
                        }
                    }
                }
            }
            
            //橘子腐烂
            for (int i=0;i<rl;i++) {
                for(int j=0;j<cl;j++) {
                    if(rotGrid[i][j]) {
                        grid[i][j] = 2;
                    }
                }
            }
        }
        return isAllRotted ? count-1 : -1;
    }
    
    public boolean checkRot(int i, int j) {
        boolean isRot = false;
        int[] si = {-1,0,1,0};
        int[] sj = {0,-1,0,1};
        for (int k=0; k<4; k++) {
            int pi = i + si[k];
            int pj = j + sj[k];
            if (pi <0 || pi>=grid.length) continue;
            if (pj <0 || pj>=grid[0].length) continue;
            if (grid[pi][pj]==2) {
                isRot = true;
                break;
            }
        }
        return isRot;
    }
}

public class Q994_Rotting_Oranges {
    public static void main(String[] args) {
        int[][] grid = {{2,1,1},{1,1,0},{0,1,1}};
        int[][] grid2 = {{2,1,1},{0,1,1},{1,0,1}};
        int[][] grid3 = {{0,2}};
        System.out.println(new Solution994().orangesRotting(grid3));
    }
}
