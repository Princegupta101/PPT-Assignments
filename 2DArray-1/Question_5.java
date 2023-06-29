/*
Question 5
You have n coins and you want to build a staircase with these coins. The staircase consists of k rows where the ith row has exactly i coins. The last row of the staircase may be incomplete.
Given the integer n, return the number of complete rows of the staircase you will build.

Example 1:

Input: n = 5
Output: 2

Explanation: Because the 3rd row is incomplete, we return 2.
*/
public class Question_5 {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(arrangeCoins(n)); //2
    }
    public static int arrangeCoins(int n) {
    //Bruteforce Approach
        // int count = 0;
        // int restAmount = n;
        // int i = 1;
        // while( restAmount >= i){
        //     restAmount = restAmount - i;
        //     i++;
        //     count++;
        // }
        // return count;
    // Binary Search Approach
    long low = 0, high = n;
    while(low <= high){
        long k = low + (high - low)/2;
        long curr = (k * (k+1)) / 2;

        if(curr == n) return (int)k;
        else if(curr > n) high = k-1;
        else low = k + 1;
    }
    return (int)high;
    }
}
