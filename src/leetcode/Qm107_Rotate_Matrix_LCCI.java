package leetcode;

import java.util.Arrays;

class Solutionm107 {
    public void rotate(int[][] matrix) {
        if (matrix.length<=1) return;
        int rl = matrix.length;
        int cl = matrix[0].length;
        int[][] matrix2 = new int[rl][cl];
        
        for (int i=0; i<rl; i++) {
            for (int j=0; j<cl; j++) {
                matrix2[j][rl-i-1] = matrix[i][j];
            }
        }
        
        for (int i=0; i<rl; i++) {
            for (int j=0; j<cl; j++) {
                matrix[i][j] = matrix2[i][j];
            }
        }
    }
}

public class Qm107_Rotate_Matrix_LCCI {
    public static void main(String[] args) {
        Solutionm107 s = new Solutionm107();
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
              };
        s.rotate(matrix);
        for(int[] nums : matrix) {
            System.out.println(Arrays.toString(nums));
        }
    }
}
