package leetcode;

//递归穷举，时间超限

class Solution64f {
    public int minPathSum(int[][] grid) {
        return calculateMin(grid, 0, 0, 0);
    }
    
    public int calculateMin(int[][] grid, int i, int j, int sum) {
//    	System.out.printf("%s %s %s\n", i, j, sum);
    	if (i==grid.length-1 && j==grid[0].length-1) return sum+grid[i][j];
    	if (i>=grid.length || j>=grid[0].length) return Integer.MAX_VALUE;
    	int res = Math.min(calculateMin(grid, i, j+1, sum+grid[i][j]),
    			calculateMin(grid, i+1, j, sum+grid[i][j]));
    	return res;
    }
}

public class Q064_Minimum_Path_Sum_failed {
	public static void main(String[] args) {
		int[][] x = {{1,2},{3,4}};
		int[][] x2 = {
				{1,3,1},
				{1,5,1},
				{4,2,1}
		};
		Solution64f s = new Solution64f();
		System.out.println(s.minPathSum(x2));
	}
}
