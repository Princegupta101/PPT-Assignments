/**
 Q3. Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You must write an algorithm with O(log n) runtime complexity.

Example 1:
Input: nums = [1,3,5,6], target = 5

Output: 2
**/
// time complexity :- O(long n)
// Space complexity :- O(1)
public class Question_3 {
    public static int findIndex(int[] arr,int target) {
        int low = 0;
        int high = arr.length-1;
        while(low<high)  // Binaray search applied time complexity O(logn);
        {
            int mid = low + (high-low)/2;
            if(arr[mid]==target)
            {
                return mid;
            }
            else if(arr[mid]<target)
            {
                low = mid+1;
            }
            else high = mid-1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,3,5,6};
        int target = 5;
        int res = findIndex(arr,target);
        if(res!=-1)
        System.out.println("tagret is present at idnex : "+res);
        else
        System.out.println("Target is not present in given array");
    }
}
