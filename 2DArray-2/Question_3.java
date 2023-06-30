/*
Question 3

Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.
Example 1:
Input: nums = [-4,-1,0,3,10]
Output: [0,1,9,16,100]
Explanation: After squaring, the array becomes [16,1,0,9,100].
After sorting, it becomes [0,1,9,16,100].
 */

import java.util.Arrays;

class Question_3{
    public static void main(String[] args) {
        int[] nums = {-4,-1,0,3,10};
        System.out.println(Arrays.toString(squareSortedArrays(nums))); // [0, 0, 1, 9, 16, 100]
    }
    public static int[] squareSortedArrays(int[] nums){
        // Create an extra array to store result
        int[] res = new int[nums.length];
        // Take two pointer
        int start = 0, end = nums.length - 1;
        int last = nums.length - 1;
        while(start < end){
            if(Math.abs(nums[start]) < Math.abs(nums[end])){
                res[last--] = nums[end] * nums[end];
                end--;
            }else{
                res[last--] = nums[start] * nums[start];
                start++;
            }
        }
        return res;
    }
}