package leetcode;

// 二分查找 拉直成一维然后用除法和取余得到坐标

class Solution74 {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length==0) return false;
        int num = matrix.length * matrix[0].length;
        return searchMatrix(matrix, target, 0, num);
    }
    
    public boolean searchMatrix(int[][] matrix, int target, int l, int r) {
        if (l>=r) return false;
        int mid = (l+r)/2;
        int midVal = getValue(matrix, mid);
        if (target==midVal) {
            return true;
        }
        else if (target<midVal) {
            return searchMatrix(matrix, target, l, mid);
        }
        else {  // target>midVal
            return searchMatrix(matrix, target, mid+1, r);
        }
    }
    
    public int getValue(int[][] matrix, int num) {
        int cc = matrix[0].length;
        int row = num/cc;
        int col = num%cc;
        return matrix[row][col];
    }
}

public class Q074_Search_a_2D_Matrix {
    public static void main(String[] args) {
        Solution74 s = new Solution74();
        int[][] m = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 50 } };
        int[][] m2 = {};
        System.out.println(s.searchMatrix(m2, 0));
    }
}
