/*
You have n coins and you want to build a staircase with these coins. The staircase consists of k rows where the ith row has exactly i coins. The last row of the staircase may be incomplete.
Given the integer n, return the number of complete rows of the staircase you will build.
Example 1:

Input: n = 5
Output: 2
Explanation: Because the 3rd row is incomplete, we return 2.
 */
class Question_2{
    public static void main(String[] args) {
        int n = 5;
        System.out.println(completeRowsOfStaircase(n)); // 2
    }
    public static int completeRowsOfStaircase(int n){
        int low = 0,high = n;
        while(low <= high){
            int mid = low + (high - low) / 2;
            int curr = (mid * (mid + 1)) / 2;
            if(curr == n) return mid;
            else if( curr > n) high = mid-1;
            else low = mid + 1;
        }
        return high;
    }
}