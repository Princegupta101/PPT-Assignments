/*
Question 5

Given two integer arrays arr1 and arr2, and the integer d, return the distance value between the two arrays.
The distance value is defined as the number of elements arr1[i] such that there is not any element arr2[j] where |arr1[i]-arr2[j]| <= d.
Example 1:
Input: arr1 = [4,5,8], arr2 = [10,9,1,8], d = 2
Output: 2
Explanation:
For arr1[0]=4 we have:
|4-10|=6 > d=2
|4-9|=5 > d=2
|4-1|=3 > d=2
|4-8|=4 > d=2
For arr1[1]=5 we have:
|5-10|=5 > d=2
|5-9|=4 > d=2
|5-1|=4 > d=2
|5-8|=3 > d=2
For arr1[2]=8 we have:
|8-10|=2 <= d=2
|8-9|=1 <= d=2
|8-1|=7 > d=2
|8-8|=0 <= d=2
 */

import java.util.TreeSet;

class Question_5{
    public static void main(String[] args) {
        int[] arr1 = {4,5,8}, arr2 = {10,9,1,8}; 
        int d = 2;
        System.out.println(findTheDistanceValue(arr1,arr2,d)); // 2
    }
    public static int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        /*
        // Bruteforce
        int resCount = arr1.length;
        for(int i = 0;i < arr1.length; i++){
            for(int j  = 0;j < arr2.length;j++){
                if(Math.abs(arr1[i] - arr2[j]) <= d){
                    resCount--;
                    break;
                } 
            }
        }
        return resCount; */

        // Optimized O(nlogm)
        int count = 0;
        TreeSet<Integer> tree = new TreeSet<Integer>(); //O(mlogm)
        for(int num : arr2) tree.add(num); 
        // Traverse arr1
        for(int i = 0;i < arr1.length;i++){ //O(n)
        // Create two values less and great such that subtraction with current element result value <= d
        int left = arr1[i] - d , right = arr1[i] + d;
            TreeSet<Integer> subTree = (TreeSet<Integer>) tree.subSet(left,right+1);
            if(subTree.isEmpty()) count++;
        }
        return count;
    }
}