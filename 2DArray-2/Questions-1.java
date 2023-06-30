/*
Question 1
Given three integer arrays arr1, arr2 and arr3 sorted in strictly increasing order, return a sorted array of only the integers that appeared in all three arrays.

Example 1:
Input: arr1 = [1,2,3,4,5], arr2 = [1,2,5,7,9], arr3 = [1,3,4,5,8]
Output: [1,5]

Explanation: Only 1 and 5 appeared in the three arrays.
*/

import java.util.*;
class Question_1 {
    public static void main(String args[] ) throws Exception {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {1,2,5,7,9};
        int[] arr3 = {1,3,4,5,8};

        int n1 = arr1.length;
        int n2 = arr2.length;
        int n3 = arr3.length;
        List<Integer> ls = new ArrayList<>();

        int i = 0,j = 0,k = 0;
        int prev1 = Integer.MIN_VALUE,prev2 = Integer.MIN_VALUE,prev3 = Integer.MIN_VALUE;
        
        while(i < n1 && j < n2 && k < n3){

            while(i < n1 && arr1[i] == prev1) i++;
            while(j < n2 && arr2[j] == prev2) j++;
            while(k < n3 && arr3[k] == prev3) k++;

            if(i < n1 && j < n2 && k < n3){
                if(arr1[i] == arr2[j] && arr2[j] == arr3[k]){
                    prev1 = arr1[i];
                    prev2 = arr2[j];
                    prev3 = arr3[k];
                    ls.add(arr1[i]);
                    i++;
                    j++;
                    k++;
                }

                else if(arr1[i] < arr2[j]){
                    prev1 = arr1[i];
                    i++;
                }
                else if(arr2[j] < arr3[k]){
                    prev1 = arr2[j];
                    j++;
                }else{
                    prev3 = arr3[k];
                    k++;
                }
            }
        }
        int[] res = new int[ls.size()];
        for(int l = 0;l < res.length;l++){
            res[l] = ls.get(l); 
        }
    System.out.print(Arrays.toString(res)); //[1,5]
    }
}
