package leetcode;

// 理解错题目了，不一定是正方形的矩阵。

import java.util.LinkedList;
import java.util.List;

class Solution54f {
	public int turn(int x) {	//方向：0-3 右下左上
		return (x+1)%4;
	}
	
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new LinkedList<Integer>();
        for (int i=0; i<matrix[0].length; i++) {
        	list.add(matrix[0][i]);
        }
        int dir = 0;
        int x = 0, y = matrix[0].length-1;
        
        for (int i=matrix[0].length-1; i>0; i--) {
        	for (int n=0; n<2; n++) {
        		dir = turn(dir);
        		for (int j=0; j<i; j++) {
        			switch (dir) {
    				case 0:
    					y+=1;break;
    				case 1:
    					x+=1;break;
    				case 2:
    					y-=1;break;
    				case 3:
    					x-=1;
    				}
        			list.add(matrix[x][y]);
        		}
        	}
        }
        return list;
    }
}

public class Q054_Spiral_Matrix_failed {
	public static void main(String[] args) {
		int[][] a = {
				{1,2,3,4,5},
				{6,7,8,9,10},
				{11,12,13,14,15},
				{16,17,18,19,20},
				{21,22,23,24,25}
		};
		int[][] b = {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
				{13,14,15,16}
		};
		int[][] c = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		int[][] d = {{1,2},{3,4}};
		int[][] e = {{1}};
		
		Solution54f s = new Solution54f();
		List<Integer> list = s.spiralOrder(e);
		System.out.println(list);
	}
}
