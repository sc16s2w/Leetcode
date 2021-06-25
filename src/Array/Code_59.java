package Array;

/**
 * 给你一个正整数 n ，生成一个包含 1 到 n2 所有元素，且元素按顺时针顺序螺旋排列的 n x n 正方形矩阵 matrix
 */
//注意判别条件
public class Code_59 {
    public int[][] generateMatrix(int n) {
        int left = 0;
        int right = n - 1;
        int top = 0;
        int bottom = n - 1;
        int i = 1;
        int[][] generatematrix = new int[n][n];
        while (left <= right && top <= bottom) {
            for (int row = left; row <= right; row++) {
                generatematrix[top][row] = i;
                i += 1;
            }
            for (int column = top + 1; column <= bottom; column++) {
                generatematrix[column][right] = i;
                i += 1;
            }
            if (left < right && top < bottom ) {
                for (int row = right - 1; row > left; row--) {
                    generatematrix[bottom][row] = i;
                    i += 1;
                }
                for (int column = bottom; column > top; column--) {
                    generatematrix[column][left] = i;
                    i += 1;
                }
            }
            left++;
            top++;
            right--;
            bottom--;

        }
        return generatematrix;

    }

}

