/**
 **Q1.** Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
*
*You may assume that each input would have exactly one solution, and you may not use the same element twice.
*
*You can return the answer in any order.
*
*Example:**
*Input: nums = [2,7,11,15], target = 9
*Output0 [0,1]
*
*Explanation:** Because nums[0] + nums[1] == 9, we return [0, 1]
* */

import java.util.HashMap;

public class Question_1 {

    static int[] twoSum(int[] arr, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            map.put(arr[i],i);
        }

        int result[] = new int[2];

        // if the current element is equal to the target

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] == target && map.containsKey(0)){

                result[0] = i;
                result[1] = map.get(0);
                break;
            }
            else if(map.containsKey(target-arr[i]))
            {
                //
                if(map.get(target-arr[i])>i)
                {
                    result[0]=i;
                    result[1] = map.get(target-arr[i]);
                    break;
                }
            }

        }
        return result;

    }

    public static void main(String[] args) {
        int[] arr= {2,7,11,15};
        int target =9 ;
        int[] res = twoSum(arr,target);
            System.out.print("["+res[0]+" "+res[1]+"]");
    }


}
