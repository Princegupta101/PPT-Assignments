/*
Question 4
Given a sorted array of distinct integers and a target value, return the index if the
target is found. If not, return the index where it would be if it were inserted in
order.

You must write an algorithm with O(log n) runtime complexity.

Example 1:
Input: nums = [1,3,5,6], target = 5
Output: 2
 */
public class Question_4 {
    public static void main(String[] args) {
        int[] nums = {1,3,5,6}; 
        int target = 5 ;
        System.out.println(findInsertPosition(nums,target)); // 2
    }
    public static int findInsertPosition(int[] nums,int target){
        int lb = 0,ub = nums.length-1;
        while(lb <= ub){
            int mid = lb + (ub-lb)/2;
            if(nums[mid] == target) return mid;
            else if(nums[mid] < target){
                lb = mid+1;
            }else{
                ub = mid - 1;
            }
        } 
        return lb;// or ub+1
    }
}
