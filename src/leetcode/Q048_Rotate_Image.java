package leetcode;

class Solution48 {

    public void rotate(int[][] matrix) {

        int l = matrix.length;
        int maxX = l / 2 - 1;
        int maxY = (l - 1) / 2;

        for (int i = 0; i <= maxX; i++) {
            for (int j = 0; j <= maxY; j++) {
                fill(matrix, i, j, matrix[i][j], true);
            }
        }

    }

    private void fill(int[][] matrix, int x, int y, int value, boolean init) {

        int currValue = matrix[x][y];
        matrix[x][y] = value;

        if (!init && returnToBegin(matrix, x, y)) {
            return;
        }

        int d = matrix.length - 1;
        // 顺时针旋转90度后的坐标
        int nextX = y;
        int nextY = d - x;

        fill(matrix, nextX, nextY, currValue, false);
    }

    private boolean returnToBegin(int[][] matrix, int x, int y) {
        int l = matrix.length;
        int maxX = l / 2 - 1;
        int maxY = (l - 1) / 2;
        return x <= maxX && y <= maxY;
    }


}

public class Q048_Rotate_Image {

    public static void main(String[] args) {

//        int[][] matrix = {
//                {1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9}
//        };

        int[][] matrix = {{}};

        Solution48 s = new Solution48();
        s.rotate(matrix);

        for (var x : matrix) {
            for (var y : x) {
                System.out.print(y + " ");
            }
            System.out.println();
        }
    }

}
