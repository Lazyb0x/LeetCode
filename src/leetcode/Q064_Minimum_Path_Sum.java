package leetcode;

// 动态规划，通过一个额外数组记录已计算过的最小值。

class Solution64 {
	
	int[][] minval;
	
    public int minPathSum(int[][] grid) {
    	if (grid==null) return 0;
    	minval = new int[grid.length][grid[0].length];
    	fill(minval, -1);
        return calculateMin(grid, 0, 0);
    }
    
    public int calculateMin(int[][] grid, int i, int j) {
    	if (i>=grid.length || j>=grid[0].length) return Integer.MAX_VALUE;
    	
    	if (i==grid.length-1 && j==grid[0].length-1) {
    		minval[i][j] = grid[i][j];
    		return grid[i][j];
    	}
    	
    	//如果是已经计算过的，就不用算了
    	if (minval[i][j]!=-1) {
//    		System.out.printf("%d %d %d\n", i, j, minval[i][j]);
    		return minval[i][j]+grid[i][j];
    	}
    	
    	int right, down;
    	right = calculateMin(grid, i, j+1);
    	down = calculateMin(grid, i+1, j);
    	int res = Math.min(right, down);
//    	System.out.printf("right=%d, down=%d\n", right, down);
//    	System.out.printf("res=%d, minval=%d, i=%d, j=%d\n",res, minval[i][j], i, j);
    	
    	minval[i][j] = res;
    	
    	return res+grid[i][j];
    }
    
    public void fill(int[][] x, int num) {
    	for (int i=0; i<x.length; i++) {
    		for (int j=0; j<x[0].length; j++) {
    			x[i][j] = num;
    		}
    	}
    }
}

public class Q064_Minimum_Path_Sum {
	public static void main(String[] args) {
		int[][] nums = {
				{1,3,1},
				{1,5,1},
				{4,2,1}
		};
		int[][]nums2 = {
				{1,4,8,6,2,2,1,7},
				{4,7,3,1,4,5,5,1},
				{8,8,2,1,1,8,0,1},
				{8,9,2,9,8,0,8,9},
				{5,7,5,7,1,8,5,5},
				{7,0,9,4,5,6,5,6},
				{4,9,9,7,9,1,9,0}
		};
		int[][] nums3 = {{1,2},{1,1}};
		Solution64 s = new Solution64();
		System.out.println(s.minPathSum(nums3));;
	}
}