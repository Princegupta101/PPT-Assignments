/*
Question 3
A permutation of an array of integers is an arrangement of its members into a
sequence or linear order.

For example, for arr = [1,2,3], the following are all the permutations of arr:
[1,2,3], [1,3,2], [2, 1, 3], [2, 3, 1], [3,1,2], [3,2,1].

The next permutation of an array of integers is the next lexicographically greater
permutation of its integer. More formally, if all the permutations of the array are
sorted in one container according to their lexicographical order, then the next
permutation of that array is the permutation that follows it in the sorted container.

If such an arrangement is not possible, the array must be rearranged as the
lowest possible order (i.e., sorted in ascending order).

.For example, the next permutation of arr = [1,2,3] is [1,3,2].
.Similarly, the next permutation of arr = [2,3,1] is [3,1,2].
.While the next permutation of arr = [3,2,1] is [1,2,3] because [3,2,1] does not
have a lexicographical larger rearrangement.

Given an array of integers nums, find the next permutation of nums.
The replacement must be in place and use only constant extra memory.

Example 1:
Input: nums = [1,2,3]
Output: [1,3,2]
 */
import java.util.Arrays;
public class Question_3 {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        // finding result by replacement in place
        nextPermutation(nums);
        System.out.println(Arrays.toString(nums));//[1, 3, 2]
    }
    public static void nextPermutation(int[] nums) {
        int ind1 = -1;
        int ind2 = -1;
        int len = nums.length;
        // Find the breakpoint
        for(int i = len - 2;i >= 0;i--){
            if(nums[i] < nums[i+1]) {
                ind1 = i;
                break;
            } 
        }

        // Check if breakpoint exists or not

        if(ind1 == -1) reverse(nums,0,len-1);

        else{ //Find the first greater element than index1 element
            for(int i = len-1;i >= ind1; i--){
                if(nums[ind1] < nums[i]) {
                    ind2 = i;
                    break;
                    }
            }
        // Now swap ind1 and ind2 elements
        swap(nums,ind1,ind2);

        // reverse right part of array from ind+1 to len-1
        reverse(nums,ind1+1,len-1);

        }
    }
    public static void reverse(int[] nums,int start,int end){
        while(start < end){
        int temp = nums[start];
        nums[start++] = nums[end];
        nums[end--] = temp;
        }
    }
    public static void swap(int[] nums,int ind1,int ind2){
        int temp = nums[ind1];
        nums[ind1] = nums[ind2];
        nums[ind2] = temp;
    }
}
