/** **Q7.** Given an integer array nums, move all 0's to the end
*  of it while maintaining the relative order of the nonzero elements.

Note that you must do this in-place without making a copy of the array.

**Example 1:**
Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]

*
*
* */

import java.util.Scanner;

public class Question_7 {
    static void moveZerosEnd(int[] arr)
    {
//        bubble sort
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=0;j<arr.length-i-1;j++) {
                if(arr[j]==0)
                {
                    int temp=arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

    }

    public static void main(String[] args) {
        try (Scanner obj = new Scanner(System.in)) {
            int  n = obj.nextInt();
                int[] arr = new int[n];
                for(int i=0;i<n;i++)
                {
                    arr[i]=obj.nextInt();
                }
                moveZerosEnd(arr);
                for(int i=0;i<n;i++)
                {
                    System.out.print(arr[i]+" ");
                }
        }
       System.out.println();
    }

}
