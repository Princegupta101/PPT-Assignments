/*
Question 3
Given a 2D integer array matrix, return the transpose of matrix.
The transpose of a matrix is the matrix flipped over its main diagonal, switching the matrix's row and column indices.

Example 1:
Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [[1,4,7],[2,5,8],[3,6,9]]
*/

import java.util.Arrays;

public class Question_3 {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        for(int[] row: transpose(matrix)) System.out.println(Arrays.toString(row));
         /* [1, 4, 7]
            [2, 5, 8]
            [3, 6, 9]  */
    } 
    public static int[][] transpose(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] matrix2 = new int[n][m];
        for(int i = 0;i < m; i++){
            for(int j = 0; j< n; j++){
                matrix2[j][i] = matrix[i][j];
            }
        }
        return matrix2;
    }
}
