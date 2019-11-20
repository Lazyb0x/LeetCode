package leetcode;

// https://leetcode-cn.com/problems/spiral-matrix/solution/luo-xuan-ju-zhen-by-leetcode/
// 我好菜啊

import java.util.List;
import java.util.LinkedList;

class Solution54 {
    public List<Integer> spiralOrder(int[][] matrix) {
    	List<Integer> list = new LinkedList<Integer>();
    	if (matrix==null || matrix.length==0) return list;
    	int R = matrix.length,C =matrix[0].length;
    	int dir = 0;
    	int r = 0, c = 0;
    	int[] dr = {0, 1, 0, -1};
    	int[] dc = {1, 0, -1, 0};
    	boolean seen[][] = new boolean[R][C];
    	for (int i=0; i<C*R; i++) {
    		list.add(matrix[r][c]);
//    		System.out.println(r + " " + c);
    		seen[r][c] = true;
    		int pr = r+dr[dir];
    		int pc = c+dc[dir];
    		if (0<=pr && pr<R && 0<=pc && pc <C && !seen[pr][pc]) {
    			r = pr;
    			c = pc;
    		}
    		else {
    			dir = (dir+1)%4;
    			r += dr[dir];
    			c += dc[dir];
    		}
    	}
    	return list;
    }
}

public class Q054_Spiral_Matrix {

	public static void main(String[] args) {
		Solution54 s = new Solution54();
		int[][] a = {
				{1,2,3,4,5},
				{6,7,8,9,10},
				{11,12,13,14,15},
				{16,17,18,19,20},
				{21,22,23,24,25}
		};

		int[][] c = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		int[][] d = {{1,2},{3,4}};
		int[][] e = {{1}};
		int[][] f = {{3},{2}};
		List<Integer> list = s.spiralOrder(new int[][] {});
		System.out.println(list);
	}

}
