/* 
Question 1
Given an integer array nums of length n and an integer target, find three integers
in nums such that the sum is closest to the target.
Return the sum of the three integers.

You may assume that each input would have exactly one solution.

Example 1:
Input: nums = [-1,2,1,-4], target = 1
Output: 2

Explanation: The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
*/

import java.util.Arrays;

public class Question_1 {
    public static void main(String[] args) {
        int[] nums = {-1,2,1,-4}; 
        int target = 1;
        System.out.println(threeSumClosest(nums, target));
    }
    public static int threeSumClosest(int[] nums, int target) {
        int closestSum = Integer.MAX_VALUE;
        Arrays.sort(nums);
        for(int i = 0;i<nums.length-2;i++){
            int num = nums[i];
            int start = i+1,end=nums.length-1;
            while(start < end){
                int sum = num + nums[start] + nums[end];
                if(sum == target) return target;
                else if(sum > target) end--;
                else start++;

                if(Math.abs(target - sum) < Math.abs(target - closestSum))
                    closestSum = sum;
            }
        }
        return closestSum;
    }
}
