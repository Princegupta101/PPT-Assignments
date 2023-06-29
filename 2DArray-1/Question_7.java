/*
You are given an m x n matrix M initialized with all 0's and an array of operations ops, where ops[i] = [ai, bi] means M[x][y] should be incremented by one for all 0 <= x < ai and 0 <= y < bi.
Count and return the number of maximum integers in the matrix after performing all the operations
Example 1:

Input: m = 3, n = 3, ops = [[2,2],[3,3]]
Output: 4
Explanation: The maximum integer in M is 2, and there are four of it in M. So return 4.
*/
public class Question_7 {
    public static void main(String[] args) {
        int m = 3, n = 3; 
        int[][] ops = {{2,2},{3,3}};
        System.out.println(maxCount(m,n,ops)); // 4
    }
    public static int maxCount(int m, int n, int[][] ops) {
        int minRows = m;
        int minCols = n;
        for(int i = 0; i < ops.length; i++){
            if(ops[i][0] < minRows) minRows = ops[i][0];
            if(ops[i][1] < minCols) minCols = ops[i][1];
        }
        return minRows * minCols;
    }
}
