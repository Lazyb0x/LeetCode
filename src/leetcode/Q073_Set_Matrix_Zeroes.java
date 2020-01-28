package leetcode;

class Solution73 {
    public void setZeroes(int[][] matrix) {
        int rl = matrix.length;
        int cl = matrix[0].length;
        
        boolean col = false;
        boolean row = false;
        
        for (int i=0; i<rl; i++) {
            if (matrix[i][0]==0) {
                col = true;
                break;
            }
        }
        for (int i=0; i<cl; i++) {
            if (matrix[0][i]==0) {
                row = true;
                break;
            }
        }
        
        for (int i=1; i<rl; i++) {
            for (int j=1; j<cl; j++) {
                if (matrix[i][j]==0) {
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }
        
        for (int i=1; i<rl; i++) {
            for (int j=1; j<cl; j++) {
                if (matrix[0][j]==0 || matrix[i][0]==0) {
                    matrix[i][j] = 0;
                }
            }
        }
        
        if (col) {
            for (int i=0; i<rl; i++) {
                matrix[i][0] = 0;
            }
        }
        
        if (row) {
            for (int i=0; i<cl; i++) {
                matrix[0][i] = 0;
            }
        }
    }

}

public class Q073_Set_Matrix_Zeroes {

    public static void main(String[] args) {

        Solution73 s = new Solution73();
        int[][] m = {
                {1,1,1},
                {1,0,1},
                {1,1,1}
        };
        
        int[][] m2 = { 
                { 0, 1, 2, 0 }, 
                { 3, 4, 5, 2 }, 
                { 1, 3, 1, 5 } 
        };
        
        int[][] m3 = {{1,0}};
        
        s.setZeroes(m3);
        
        printMatrix(m3);
    }

    public static void printMatrix(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }
}
