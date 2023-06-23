

// Given an array of integers nums
// write a function to search target in nums. If target exists, then return its index. Otherwise,
// return -1.
// You must write an algorithm with O(log n) runtime complexity.
// Input: nums = [-1,0,3,5,9,12], target = 9 // Output: 4

// Time Complexcity =O(n log n) 

public class Q6 {
    public static int targetindex(int nums[], int target) {

        // Base Case if we found our target at starting we will return our index
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target)
                return i;
        }
        int  n = nums.length;
        int st = 0;
        int end = nums.length - 1;
        // We are using Binary Search For Timecomplexcity O(n log n)
        // for Binary Search 1st condition should be saticfy ( values must be In
        // Asscending Order )

        // Binary search code Block
        while (st <= end) {
            int mid = (st + end) << 1;
            // if target = mid then retuning mid
            if (nums[mid] == target)
                return mid;
            // if target not prsent in left side then searching to right side ** mid+1 **
            else if (nums[mid] < target)
                return mid + 1;
            else

                // finally searching to left side ** mid-1 **
                return mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int nums[] = { -1, 0, 3, 5, 9, 12 };
        int target = 9;
        // Function call
        System.out.println(Q6.targetindex(nums, target));
    }
}