/*
Question 7
You are given an inclusive range [lower, upper] and a sorted unique integer array
nums, where all elements are within the inclusive range.

A number x is considered missing if x is in the range [lower, upper] and x is not in
nums.

Return the shortest sorted list of ranges that exactly covers all the missing
numbers. That is, no element of nums is included in any of the ranges, and each
missing number is covered by one of the ranges.

Example 1:
Input: nums = [0,1,3,50,75], lower = 0, upper = 99
Output: [[2,2],[4,49],[51,74],[76,99]]

Explanation: The ranges are:
[2,2]
[4,49]
[51,74]
[76,99]
 */

import java.util.ArrayList;
import java.util.List;

public class Question_7 {
    public static void main(String[] args) {
        int[] nums = {0,1,3,50,75}; 
        int lower = 0, upper = 99;
        System.out.println((ssl(nums,lower,upper)));
    }
    public static List<List<Integer>> ssl(int[] nums,int lower,int upper){
        List<List<Integer>> arr = new ArrayList<>(); 
        if(nums.length == 0) arr.add(List.of(lower,upper));
        if(nums[0] < lower) {
                arr.add(List.of(nums[0],lower));
            }
        for(int i = 0;i < nums.length-1;i++){
            if(nums[i]+1 != nums[i+1]){
                arr.add(List.of(nums[i]+1,nums[i+1]-1));
            }
        }
        if(nums[nums.length-1] < upper){
            arr.add(List.of(nums[nums.length-1]+1,upper));
        }
        return arr;
    }
}
