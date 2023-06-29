/*
Question 6
Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.

Example 1:
Input: nums = [-4,-1,0,3,10]
Output: [0,1,9,16,100]

Explanation: After squaring, the array becomes [16,1,0,9,100].
After sorting, it becomes [0,1,9,16,100]
*/

import java.util.Arrays;

public class Question_6 {
    public static void main(String[] args) {
            int[] nums = {-4,-1,0,3,10};
            System.out.println(Arrays.toString(sortedSquares(nums))); //[0, 1, 9, 16, 100]
        }
        public static int[] sortedSquares(int[] nums) {
        int[] nums2 = new int[nums.length];
        int i =0; int j = nums.length-1;
        for(int p = nums2.length-1;p >= 0;p--){
            if(Math.abs(nums[i]) > Math.abs(nums[j])){
                nums2[p] = nums[i]*nums[i];
                i++;
            }else{
                nums2[p] = nums[j] * nums[j];
                j--;
            }
        }
        return nums2;
    }

    }
    

